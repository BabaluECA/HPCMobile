package com.eca.hpcmobile;

import android.content.Context;
import android.content.Intent;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.appcompat.app.AppCompatActivity;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.ListView;
import android.widget.TextView;

public class HinosKimbundoActivity extends AppCompatActivity {
    String [] hinos_kb_num_titulos, hinos_kb_conteudos;
    private ListView lvHinosKimbundo;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_hinos_kimbundo);

        lvHinosKimbundo = findViewById(R.id.lvHinosKimbundo);

        hinos_kb_num_titulos = getResources().getStringArray(R.array.hinos_kb_num_titulos);
        hinos_kb_conteudos = getResources().getStringArray(R.array.hinos_kb_conteudos);

        MyAdapter adapter = new MyAdapter(this, hinos_kb_num_titulos);
        lvHinosKimbundo.setAdapter(adapter);

        lvHinosKimbundo.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> parent, View view, int position, long id) {
                Intent i = new Intent(HinosKimbundoActivity.this,GetHinoActivity.class);
                i.putExtra("tituloIndex",hinos_kb_num_titulos[position]);
                i.putExtra("hinoIndex", hinos_kb_conteudos[position]);
                startActivity(i);
            }
        });
    }

    class MyAdapter extends ArrayAdapter<String> {

        Context context;
        String hinosKb[];

        MyAdapter (Context c, String numTitulo[]){
            super(c, R.layout.row, R.id.tvTitulo, numTitulo);
            this.context = c;
            this.hinosKb = numTitulo;
        }

        @NonNull
        @Override
        public View getView(int position, @Nullable View convertView, @NonNull ViewGroup parent) {
            LayoutInflater layoutInflater = (LayoutInflater)getApplicationContext().getSystemService(context.LAYOUT_INFLATER_SERVICE);
            View row = layoutInflater.inflate(R.layout.row, parent, false);
            TextView tituloF = row.findViewById(R.id.tvTitulo);
            tituloF.setText(hinosKb[position]);
            return row;
        }
    }
}
