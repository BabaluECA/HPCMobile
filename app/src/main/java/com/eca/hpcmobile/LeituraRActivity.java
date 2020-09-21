package com.eca.hpcmobile;

import android.content.Intent;
import androidx.appcompat.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class LeituraRActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_leitura_r);

    }

    public void btnSalmos1 (View v){
        Intent i = new Intent(this, Salmos1Activity.class);
        startActivity(i);
    }

    public void btnSalmos8 (View v){
        Intent i = new Intent(this, Salmos8Activity.class);
        startActivity(i);
    }

    public void btnSalmos15 (View v){
        Intent i = new Intent(this, Salmos15Activity.class);
        startActivity(i);
    }

    public void btnSalmos23 (View v){
        Intent i = new Intent(this, Salmos23Activity.class);
        startActivity(i);
    }

    public void btnSalmos24 (View v){
        Intent i = new Intent(this, Salmos24Activity.class);
        startActivity(i);
    }

    public void btnSalmos46 (View v){
        Intent i = new Intent(this, Salmos46Activity.class);
        startActivity(i);
    }

    public void btnSalmos67 (View v){
        Intent i = new Intent(this, Salmos67Activity.class);
        startActivity(i);
    }

    public void btnSalmos72 (View v){
        Intent i = new Intent(this, Salmos72Activity.class);
        startActivity(i);
    }

    public void btnSalmos90 (View v){
        Intent i = new Intent(this, Salmos90Activity.class);
        startActivity(i);
    }

    public void btnSalmos100 (View v){
        Intent i = new Intent(this, Salmos100Activity.class);
        startActivity(i);
    }

    public void btnSalmos103 (View v){
        Intent i = new Intent(this, Salmos103Activity.class);
        startActivity(i);
    }

    public void btnSalmos139 (View v){
        Intent i = new Intent(this, Salmos139Activity.class);
        startActivity(i);
    }

    public void btnSalmos150 (View v){
        Intent i = new Intent(this, Salmos150Activity.class);
        startActivity(i);
    }

    public void btnSaoLucas (View v){
        Intent i = new Intent(this, SaoLucasActivity.class);
        startActivity(i);
    }

    public void btnSaoLucas1 (View v){
        Intent i = new Intent(this, SaoLucas1Activity.class);
        startActivity(i);
    }

    public void btnSaoMateus (View v){
        Intent i = new Intent(this, SaoMateusActivity.class);
        startActivity(i);
    }

    public void btnApocalipse (View v){
        Intent i = new Intent(this, ApocalipseActivity.class);
        startActivity(i);
    }
}
