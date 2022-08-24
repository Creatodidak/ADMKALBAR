package com.example.admkalbar;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.os.Handler;

public class Splash extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_splash);

        int durasi = 1500;
        new Handler().postDelayed(new Runnable() {
            @Override
            public void run() {

                Intent home = new Intent(Splash.this, Tatami.class);
                startActivity(home);
                finish();

            }
        }, durasi);
    }
}