package com.eca.hpcmobile;

import android.content.Intent;
import androidx.appcompat.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class CredoApostolicoActivity extends AppCompatActivity {


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_credo_apostolico);

    }

    public void btnPortugues(View v){
        Intent i = new Intent(this, CredoPtActivity.class);
        startActivity(i);
    }

    public void btnKikongo(View v){
        Intent i = new Intent(this, CredoKkActivity.class);
        startActivity(i);
    }

    public void btnUmbundo(View v){
        Intent i = new Intent(this, CredoUbActivity.class);
        startActivity(i);
    }

    public void btnKimbundo(View v){
        Intent i = new Intent(this, CredoKbActivity.class);
        startActivity(i);
    }
}
