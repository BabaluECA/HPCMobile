package com.eca.hpcmobile;

import android.content.Context;
import android.content.Intent;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.appcompat.app.AppCompatActivity;
import androidx.core.view.MenuItemCompat;

import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.Menu;
import android.view.MenuInflater;
import android.view.MenuItem;
import android.view.View;
import android.view.ViewGroup;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.ListView;
import android.widget.SearchView;
import android.widget.TextView;

import java.util.ArrayList;

public class HinosPortuguesActivity extends AppCompatActivity {
    String [] hinos_pt_num_titulos, hinos_pt_conteudos;
    ListView lvHinosPortugues;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_hinos_portugues);

        // Inicializa a ListView do xml
        lvHinosPortugues = findViewById(R.id.lvHinosPortugues);

        // monta a lista de dados no resource xml
        hinos_pt_num_titulos = getResources().getStringArray(R.array.hinos_pt_num_titulos);
        hinos_pt_conteudos = getResources().getStringArray(R.array.hinos_pt_conteudos);

        //monta o adapter para o novo formato
        MyAdapter adapter = new MyAdapter(this, hinos_pt_num_titulos);
        lvHinosPortugues.setAdapter(adapter);

        lvHinosPortugues.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> parent, View view, int position, long id) {
                Intent i = new Intent(HinosPortuguesActivity.this, GetHinoActivity.class);
                i.putExtra("tituloIndex",hinos_pt_num_titulos[position]);
                i.putExtra("hinoIndex", hinos_pt_conteudos[position]);
                startActivity(i);
            }
        });
    }

    // Criação da class adapter para formataçao do ListView
    class MyAdapter extends ArrayAdapter<String>{
        Context context;
        String hinosPt[];
        MyAdapter (Context c, String numTitulo[]){
            super(c, R.layout.row, R.id.tvTitulo, numTitulo);
            this.context = c;
            this.hinosPt = numTitulo;
        }
        @NonNull
        @Override
        public View getView(int position, @Nullable View convertView, @NonNull ViewGroup parent) {
            LayoutInflater layoutInflater = (LayoutInflater)getApplicationContext().getSystemService(context.LAYOUT_INFLATER_SERVICE);
            View row = layoutInflater.inflate(R.layout.row, parent, false);
            TextView tituloF = row.findViewById(R.id.tvTitulo);
            tituloF.setText(hinosPt[position]);
            return row;
        }
    }


    /*
    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        MenuInflater inflater = getMenuInflater();
        inflater.inflate(R.menu.procurar_pt, menu);

        MenuItem procurarItem = menu.findItem(R.id.edtProcurar);
        SearchView procurarView = (SearchView) MenuItemCompat.getActionView(procurarItem);

        procurarView.setOnQueryTextListener(new SearchView.OnQueryTextListener() {
            @Override
            public boolean onQueryTextSubmit(String query) {
                return false;
            }

            @Override
            public boolean onQueryTextChange(String newText) {

                final ArrayList<String> tempList = new ArrayList<>();

                for(String temp : hinos_pt_num_titulos){
                    if(temp.toLowerCase().contains(newText.toLowerCase())){
                        tempList.add(temp);
                    }
                }

                ArrayAdapter<String> adapter = new ArrayAdapter<>(HinosPortuguesActivity.this,
                        android.R.layout.simple_list_item_1, tempList);
                lvHinosPortugues.setAdapter(adapter);

                lvHinosPortugues.setOnItemClickListener(new AdapterView.OnItemClickListener() {
                    @Override
                    public void onItemClick(AdapterView<?> parent, View view, int position, long id) {
                        Intent i = new Intent(HinosPortuguesActivity.this, GetHinoActivity.class);
                        i.putExtra("tituloIndex",hinos_pt_num_titulos[position]);
                        i.putExtra("hinoIndex", hinos_pt_conteudos[position]);
                        startActivity(i);
                    }
                });

                return true;
            }
        });
        return super.onCreateOptionsMenu(menu);
    }
    */
}
