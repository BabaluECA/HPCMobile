package com.eca.hpcmobile;

import androidx.appcompat.app.AppCompatActivity;

import android.app.AlertDialog;
import android.content.DialogInterface;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;

import com.google.android.gms.ads.AdRequest;
import com.google.android.gms.ads.AdView;

public class CalendarActivity extends AppCompatActivity {

    AdView myAdView3;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_calendar);

        myAdView3 = findViewById(R.id.adView3);
        AdRequest adRequest = new AdRequest.Builder()
                //.addTestDevice(AdRequest.DEVICE_ID_EMULATOR)
                .build();
        myAdView3.loadAd(adRequest);

        mostrarAlertaMensagemCurta();
    }

    public void mostrarAlertaMensagemCurta(){
        AlertDialog.Builder ad = new AlertDialog.Builder(CalendarActivity.this);
        ad.setIcon(R.drawable.ic_thumbup_good_emoticon_svg);
        ad.setTitle(R.string.alertaTitulofixe);
        ad.setMessage(R.string.alertaMensagemCurta);
        ad.setPositiveButton("OK", new DialogInterface.OnClickListener() {
            @Override
            public void onClick(DialogInterface dialog, int which) {
                closeOptionsMenu();
            }
        });
        ad.create();
        ad.show();
    }

    public void btnJaneiro(View v){
        Intent i = new Intent(this, JaneiroActivity.class);
        startActivity(i);
    }

    public void btnFevereiro(View v){
        Intent i = new Intent(this, FevereiroActivity.class);
        startActivity(i);
    }

    public void btnMarco(View v){
        Intent i = new Intent(this, MarcoActivity.class);
        startActivity(i);
    }

    public void btnAbril(View v){
        Intent i = new Intent(this, AbrilActivity.class);
        startActivity(i);
    }

    public void btnMaio(View v){
        Intent i = new Intent(this, MaioActivity.class);
        startActivity(i);
    }

    public void btnJunho(View v){
        Intent i = new Intent(this, JunhoActivity.class);
        startActivity(i);
    }

    public void btnJulho(View v){
        Intent i = new Intent(this, JulhoActivity.class);
        startActivity(i);
    }

    public void btnAgosto(View v){
        Intent i = new Intent(this, AgostoActivity.class);
        startActivity(i);
    }

    public void btnSetembro(View v){
        Intent i = new Intent(this, SetembroActivity.class);
        startActivity(i);
    }

    public void btnOutubro(View v){
        Intent i = new Intent(this, OutubroActivity.class);
        startActivity(i);
    }

    public void btnNovembro(View v){
        Intent i = new Intent(this, NovembroActivity.class);
        startActivity(i);
    }

    public void btnDezembro(View v){
        Intent i = new Intent(this, DezembroActivity.class);
        startActivity(i);
    }
}
