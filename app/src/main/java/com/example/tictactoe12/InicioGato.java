package com.example.tictactoe12;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.os.CountDownTimer;
import android.view.View;

public class InicioGato extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_inicio_gato);

        CountDownTimer Timer = new CountDownTimer(3000, 1000){
            public void onTick(long millisUntilFinished) {

            }
            public void onFinish(){
                Intent intent = new Intent(InicioGato.this, MainActivity.class);
                startActivity(intent);
                finish();
            }
        };
        Timer.start();
    }
}