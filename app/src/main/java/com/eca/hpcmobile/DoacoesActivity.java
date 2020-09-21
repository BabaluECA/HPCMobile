package com.eca.hpcmobile;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;

import com.google.android.gms.ads.AdRequest;
import com.google.android.gms.ads.AdView;

public class DoacoesActivity extends AppCompatActivity {

    AdView myAdView;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_doacoes);

        myAdView = findViewById(R.id.adView);

        AdRequest adRequest = new AdRequest.Builder()
                //.addTestDevice(AdRequest.DEVICE_ID_EMULATOR)
                .build();
        myAdView.loadAd(adRequest);

    }

    public void btnKwanza(View v){
        Intent i = new Intent(this, KwanzaActivity.class);
        startActivity(i);
    }

    public void btnEuro(View v){
        Intent i = new Intent(this, EuroActivity.class);
        startActivity(i);
    }

    public void btnComoDoar(View v){
        Intent i = new Intent(this, ComoDoarActivity.class);
        startActivity(i);
    }

    public void btnComunidade(View v){
        Intent i = new Intent(this, ComunidadeActivity.class);
        startActivity(i);
    }
}
