package com.eca.hpcmobile;

import android.app.AlertDialog;
import android.app.Dialog;
import android.content.DialogInterface;
import android.content.Intent;
import androidx.appcompat.app.AppCompatActivity;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuInflater;
import android.view.MenuItem;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

import com.google.android.gms.ads.AdRequest;
import com.google.android.gms.ads.AdView;

import java.util.Calendar;
import java.util.GregorianCalendar;

public class MainActivity extends AppCompatActivity {

    AdView myAdView;
    Dialog myDialog;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        myDialog = new Dialog(this);

        myAdView = findViewById(R.id.adView);
        AdRequest adRequest = new AdRequest.Builder()
                //.addTestDevice(AdRequest.DEVICE_ID_EMULATOR)
        .build();
        myAdView.loadAd(adRequest);
        //mostrarAlertaMensagem();
        ShowPopup();
    }

    //metodo para vincuçar o menu na activity
    public boolean onCreateOptionsMenu(Menu menu){
        MenuInflater mi = getMenuInflater();
        mi.inflate(R.menu.menu_configuracoes, menu);
        return true;
    }

    //abrir activity de configuracoes
    public void abrirConfiguracao(MenuItem item){
        Intent i = new Intent(this, ConfiguracaoActivity.class);
        startActivity(i);
    }

    public void btnCreditos (View v){
        Intent i = new Intent(this, CreditosActivity.class);
        startActivity(i);
        finish();
    }

    public void btnPrefacio (View v){
        Intent i = new Intent(this, PrefacioActivity.class);
        startActivity(i);
    }

    public void btnAbrirHinario (View v){
        Intent i = new Intent(this, ContentActivity.class);
        startActivity(i);
    }

    public void btnPrivacidade(View v){
        Intent i = new Intent(this, PoliticasPrivacidadeActivity.class);
        startActivity(i);
    }

    public void btnCalendar(View v){
        Intent i = new Intent(this, CalendarActivity.class);
        startActivity(i);
    }

    public void btnContactos(View v){
        Intent i = new Intent(this, ContactoActivity.class);
        startActivity(i);
    }

    public void btnDoacoes(View v){
        Intent i = new Intent(this, DoacoesActivity.class);
        startActivity(i);
    }

    public void btnMinhaIgreja(View v){
        Intent i = new Intent(this, MinhaIgrejaActivity.class);
        startActivity(i);
    }

    public void ShowPopup(){
        Button btnFechar;
        myDialog.setContentView(R.layout.alert_main);
        btnFechar = myDialog.findViewById(R.id.btnFechar);

        btnFechar.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                myDialog.dismiss();
            }
        });
        myDialog.show();
    }

    /*
    public void mostrarAlertaMensagem(){

        Calendar caldata = GregorianCalendar.getInstance();

        int diaAtual = caldata.get(Calendar.DAY_OF_MONTH);
        int diaSemana = caldata.get(Calendar.DAY_OF_WEEK);

        // usar para verificar a versao do SO do dispositivo
        //if (Build.VERSION.SDK_INT >= Build.VERSION_CODES.N) {}

        if(diaAtual % 3 == 0 || diaSemana == 1){
            AlertDialog.Builder ad = new AlertDialog.Builder(MainActivity.this);
            ad.setIcon(R.drawable.ic_comunity_svg);
            ad.setTitle(R.string.aletaTitulo);
            ad.setMessage(R.string.alertaMensagem);
            ad.setPositiveButton("OK", new DialogInterface.OnClickListener() {
                        @Override
                        public void onClick(DialogInterface dialog, int which) {
                            closeOptionsMenu();
                        }
                    });
            ad.create();
            ad.show();
        }
    }*/
}
