package com.example.tictactoe12;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

public class Resultado extends AppCompatActivity {
    Button btn1, btn2;
    TextView M1, M2, Res;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_resultado);
        btn1 = findViewById(R.id.btn1);
        btn2 = findViewById(R.id.btn2);
        M1 = findViewById(R.id.txt1);
        M2 = findViewById(R.id.txt2);
        Res = findViewById(R.id.Resultado);

        Intent intent =getIntent();
        int Resultado = intent.getIntExtra("Ganador",0);
        if (Resultado == 1){
            Res.setText("Jugador 1");
        }else if (Resultado == 2){
            Res.setText("Jugador 2");
        }else if (Resultado == 3){
            Res.setText("Empate");
        }
        int ResPlayer1 = intent.getIntExtra("resultado1",0);
        M1.setText(String.valueOf(ResPlayer1));
        int ResPlayer2 = intent.getIntExtra("resultado2",0);
        M2.setText(String.valueOf(ResPlayer2));

        btn1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent Regreso = new Intent(Resultado.this, MainActivity.class);
                startActivity(Regreso);
                finish();
            }
        });
        btn2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                finish();
            }
        });



    }
}