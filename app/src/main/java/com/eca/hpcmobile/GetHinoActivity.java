package com.eca.hpcmobile;

import androidx.appcompat.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.TextView;

public class GetHinoActivity extends AppCompatActivity {
    String[] hinos_pt_conteudos, hinos_kb_conteudos;
    private TextView tvHinoTitulo, tvHino;
    int index = 0;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_get_hino);

        tvHinoTitulo = findViewById(R.id.tvHinoTitulo);
        tvHino = findViewById(R.id.tvHino);

        //hinos_pt_conteudos = getResources().getStringArray(R.array.hinos_pt_conteudos);
        //hinos_kb_conteudos = getResources().getStringArray(R.array.hinos_kb_conteudos);

        //if(hinos_pt_conteudos.length > 0) {

            String titulo = getIntent().getStringExtra("tituloIndex");
            tvHinoTitulo.setText(titulo);

            String hino = getIntent().getStringExtra("hinoIndex");
            tvHino.setText(hino);
       /* }
        else{
            String titulo = getIntent().getStringExtra("tituloIndex");
            tvHinoTitulo.setText(titulo);

            String hino = getIntent().getStringExtra("hinoIndex");
            tvHino.setText(hino);
        }*/

    }


}
