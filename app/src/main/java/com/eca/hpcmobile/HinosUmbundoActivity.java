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

public class HinosUmbundoActivity extends AppCompatActivity {
    String[] hinos_ub_num_titulos, hinos_ub_conteudos;
    ListView lvHinosUmbundo;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_hinos_umbundo);

        // Inicializa a ListView do xml
        lvHinosUmbundo = findViewById(R.id.lvHinosUmbundo);

        // monta a lista de dados no resource xml
        hinos_ub_num_titulos = getResources().getStringArray(R.array.hinos_ub_num_titulos);
        hinos_ub_conteudos = getResources().getStringArray(R.array.hinos_ub_conteudos);

        //monta o adapter para o novo formato
        MyAdapter adapter = new MyAdapter(this, hinos_ub_num_titulos);
        lvHinosUmbundo.setAdapter(adapter);

        lvHinosUmbundo.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> parent, View view, int position, long id) {
                Intent i = new Intent(HinosUmbundoActivity.this, GetHinoActivity.class);
                i.putExtra("tituloIndex", hinos_ub_num_titulos[position]);
                i.putExtra("hinoIndex", hinos_ub_conteudos[position]);
                startActivity(i);
            }
        });
    }

    // Criação da class adapter para formataçao do ListView
    class MyAdapter extends ArrayAdapter<String> {
        Context context;
        String hinosub[];
        MyAdapter (Context c, String numTitulo[]){
            super(c, R.layout.row, R.id.tvTitulo, numTitulo);
            this.context = c;
            this.hinosub = numTitulo;
        }
        @NonNull
        @Override
        public View getView(int position, @Nullable View convertView, @NonNull ViewGroup parent) {
            LayoutInflater layoutInflater = (LayoutInflater)getApplicationContext().getSystemService(context.LAYOUT_INFLATER_SERVICE);
            View row = layoutInflater.inflate(R.layout.row, parent, false);
            TextView tituloF = row.findViewById(R.id.tvTitulo);
            tituloF.setText(hinosub[position]);
            return row;
        }
    }
}
