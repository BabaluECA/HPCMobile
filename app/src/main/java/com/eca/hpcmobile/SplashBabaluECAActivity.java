package com.eca.hpcmobile;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Build;
import android.os.Bundle;
import android.os.Handler;
import android.widget.ImageView;

public class SplashBabaluECAActivity extends AppCompatActivity {

    int timer = 2500; //timer teste 5000;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_splash_babalu_eca);

        new Handler().postDelayed(new Runnable() {
            @Override
            public void run() {
                Intent i = new Intent(SplashBabaluECAActivity.this, MainActivity.class);
                startActivity(i);
                finish();
            }
        }, timer);

    }
}
