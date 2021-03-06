package com.example.team3project;

import android.content.Intent;
import android.os.Bundle;
import android.os.Handler;

import androidx.appcompat.app.AppCompatActivity;

public class TelaSplash extends AppCompatActivity {

    // Timer da  TelaSplash
    private static int SPLASH_TIME_OUT = 2000;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_tela_splash);

        new Handler().postDelayed(new Runnable() {
            @Override
            public void run() {


                Intent i = new Intent(TelaSplash.this,
                        Login.class);
                startActivity(i);

                // Fecha esta activity
                finish();
            }
        }, SPLASH_TIME_OUT);
    }
}


