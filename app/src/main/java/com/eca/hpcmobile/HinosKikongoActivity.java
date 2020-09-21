package com.eca.hpcmobile;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.appcompat.app.AppCompatActivity;

import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.ListView;
import android.widget.TextView;

public class HinosKikongoActivity extends AppCompatActivity {
    String [] hinos_kk_num_titulos, hinos_kk_conteudos;
    private ListView lvHinosKikongo;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_hinos_kikongo);

        // Inicializa a ListView do xml
        lvHinosKikongo = findViewById(R.id.lvHinosKikongo);

        // monta a lista de dados no resource xml
        hinos_kk_num_titulos = getResources().getStringArray(R.array.hinos_kk_num_titulos);
        hinos_kk_conteudos = getResources().getStringArray(R.array.hinos_kk_conteudos);

        //monta o adapter para o novo formato
        MyAdapter adapter = new MyAdapter(this, hinos_kk_num_titulos);
        lvHinosKikongo.setAdapter(adapter);

        lvHinosKikongo.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> parent, View view, int position, long id) {
                Intent i = new Intent(HinosKikongoActivity.this, GetHinoActivity.class);
                i.putExtra("tituloIndex", hinos_kk_num_titulos[position]);
                i.putExtra("hinoIndex", hinos_kk_conteudos[position]);
                startActivity(i);
            }
        });
    }

    // Criação da class adapter para formataçao do ListView
    class MyAdapter extends ArrayAdapter<String> {
        Context context;
        String hinoskk[];
        MyAdapter (Context c, String numTitulo[]){
            super(c, R.layout.row, R.id.tvTitulo, numTitulo);
            this.context = c;
            this.hinoskk = numTitulo;
        }
        @NonNull
        @Override
        public View getView(int position, @Nullable View convertView, @NonNull ViewGroup parent) {
            LayoutInflater layoutInflater = (LayoutInflater)getApplicationContext().getSystemService(context.LAYOUT_INFLATER_SERVICE);
            View row = layoutInflater.inflate(R.layout.row, parent, false);
            TextView tituloF = row.findViewById(R.id.tvTitulo);
            tituloF.setText(hinoskk[position]);
            return row;
        }
    }
}
