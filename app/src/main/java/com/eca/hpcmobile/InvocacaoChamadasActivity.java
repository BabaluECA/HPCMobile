package com.eca.hpcmobile;

import android.content.Intent;
import androidx.appcompat.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class InvocacaoChamadasActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_invocacao_chamadas);

    }

    public void btnAdvento(View v){
        Intent i = new Intent(this, AdventoActivity.class);
        startActivity(i);
    }

    public void btnNatal(View v){
        Intent i = new Intent(this, NatalActivity.class);
        startActivity(i);
    }

    public void btnEpifania(View v){
        Intent i = new Intent(this, EpifaniaActivity.class);
        startActivity(i);
    }

    public void btnQuaresma(View v){
        Intent i = new Intent(this, QuaresmaActivity.class);
        startActivity(i);
    }

    public void btnPascoa(View v){
        Intent i = new Intent(this, PascoaActivity.class);
        startActivity(i);
    }

    public void btnPentecoste(View v){
        Intent i = new Intent(this, PentecosteActivity.class);
        startActivity(i);
    }

    public void btnConfissao(View v){
        Intent i = new Intent(this, ConfissaoActivity.class);
        startActivity(i);
    }

    public void btnOfertorio(View v){
        Intent i = new Intent(this, OfertorioActivity.class);
        startActivity(i);
    }

    public void btnBencao(View v){
        Intent i = new Intent(this, BencaoActivity.class);
        startActivity(i);
    }
}
