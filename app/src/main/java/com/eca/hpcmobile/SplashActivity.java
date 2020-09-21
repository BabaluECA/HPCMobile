package com.eca.hpcmobile;

import android.content.Intent;
import android.os.Build;
import android.os.Handler;
import androidx.appcompat.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.ImageView;

public class SplashActivity extends AppCompatActivity {

    int timer = 2500; //timer teste 5000;
    ImageView iv;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_splash);

        iv = findViewById(R.id.ivLogo);

        if (Build.VERSION.SDK_INT >= Build.VERSION_CODES.N) {
            iv.setImageResource(R.drawable.logo);

            new Handler().postDelayed(new Runnable() {
                @Override
                public void run() {
                    Intent i = new Intent(SplashActivity.this, SplashBabaluECAActivity.class);
                    startActivity(i);
                    finish();
                }
            }, timer);
        }else{
            iv.setImageResource(R.mipmap.ic_logo_imu);
            new Handler().postDelayed(new Runnable() {
                @Override
                public void run() {
                    Intent i = new Intent(SplashActivity.this, SplashBabaluECAActivity.class);
                    startActivity(i);
                    finish();
                }
            }, timer);
        }

    }
}
