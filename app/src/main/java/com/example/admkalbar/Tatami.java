package com.example.admkalbar;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageView;

public class Tatami extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_tatami);

        ImageView ttm1, ttm2, ttm3, ttm4;

        ttm1 = findViewById(R.id.tatami1ic);

        ttm1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent i = new Intent(Tatami.this, PenilaianTunggal.class);
                startActivity(i);
            }
        });
    }
}