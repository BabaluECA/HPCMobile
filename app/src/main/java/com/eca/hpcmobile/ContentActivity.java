package com.eca.hpcmobile;

import android.app.AlertDialog;
import android.content.DialogInterface;
import android.content.Intent;
import androidx.appcompat.app.AppCompatActivity;

import android.os.Build;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

import com.google.android.gms.ads.AdRequest;
import com.google.android.gms.ads.AdView;
import com.google.android.gms.ads.MobileAds;

import java.util.Calendar;
import java.util.GregorianCalendar;

public class ContentActivity extends AppCompatActivity {

    AdView myAdView, myAdView1;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_content);

        myAdView = findViewById(R.id.adView);
        myAdView1 = findViewById(R.id.adView1);

        AdRequest adRequest = new AdRequest.Builder()
                //.addTestDevice(AdRequest.DEVICE_ID_EMULATOR)
                .build();
        myAdView.loadAd(adRequest);

        AdRequest adRequest1 = new AdRequest.Builder()
                //.addTestDevice(AdRequest.DEVICE_ID_EMULATOR)
                .build();
        myAdView1.loadAd(adRequest1);

        mostrarAlertaMensagemCurta();
    }

    public void btnPortugues(View v){
        Intent i = new Intent(this, HinosPortuguesActivity.class);
        startActivity(i);
    }

    public void btnKikongo(View v){
        Intent i = new Intent(this, HinosKikongoActivity.class);
        startActivity(i);
    }

    public void btnUmbundo(View v){
        Intent i = new Intent(this, HinosUmbundoActivity.class);
        startActivity(i);
    }

    public void btnKimbundo(View v){
        Intent i = new Intent(this, HinosKimbundoActivity.class);
        startActivity(i);
    }

    public void btnLResponsiva(View v){
        Intent i = new Intent(this, LeituraRActivity.class);
        startActivity(i);
    }

    public void btnICPAdoracao(View v){
        Intent i = new Intent(this, InvocacaoChamadasActivity.class);
        startActivity(i);
    }

    public void btnSantaCeia(View v){
        Intent i = new Intent(this, RitualSantaCeiaActivity.class);
        startActivity(i);
    }

    public void btnOracaoDominical(View v){
        Intent i = new Intent(this, OracaoDominicalActivity.class);
        startActivity(i);
    }

    public void btnCredoApostolico(View v){
        Intent i = new Intent(this, CredoApostolicoActivity.class);
        startActivity(i);
    }

    public void mostrarAlertaMensagemCurta(){
        AlertDialog.Builder ad = new AlertDialog.Builder(ContentActivity.this);
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
}
