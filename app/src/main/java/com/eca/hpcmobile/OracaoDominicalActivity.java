package com.eca.hpcmobile;

import android.content.Intent;
import androidx.appcompat.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class OracaoDominicalActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_oracao_dominical);

    }

    public void btnPortugues(View v){
        Intent i = new Intent(this, OracaoPtActivity.class);
        startActivity(i);
    }

    public void btnKikongo(View v){
        Intent i = new Intent(this, OracaoKkActivity.class);
        startActivity(i);
    }

    public void btnUmbundo(View v){
        Intent i = new Intent(this, OracaoUbActivity.class);
        startActivity(i);
    }

    public void btnKimbundo(View v){
        Intent i = new Intent(this, OracaoKbActivity.class);
        startActivity(i);
    }
}
