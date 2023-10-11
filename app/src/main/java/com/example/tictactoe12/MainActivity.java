package com.example.tictactoe12;

import androidx.appcompat.app.AppCompatActivity;

import android.app.Activity;
import android.content.DialogInterface;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.view.View.OnClickListener;
import android.widget.ImageView;
import android.widget.TextView;
import android.widget.Toast;


public class MainActivity extends AppCompatActivity implements OnClickListener {
    ImageView img1, img2, img3,img4, img5, img6, img7, img8, img9;
    TextView ScoreP1, ScoreP2;
    int[] matriz = new int[9];
    boolean ganarP1, ganarP2;
    int tiradas = 0;
    private static int GPlayer1 = 0, GPlayer2 = 0;
    int jugador = 1;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        img1 = (ImageView) findViewById(R.id.image1);
        img2 = (ImageView) findViewById(R.id.image2);
        img3 = (ImageView) findViewById(R.id.image3);
        img4 = (ImageView) findViewById(R.id.image4);
        img5 = (ImageView) findViewById(R.id.image5);
        img6 = (ImageView) findViewById(R.id.image6);
        img7 = (ImageView) findViewById(R.id.image7);
        img8 = (ImageView) findViewById(R.id.image8);
        img9 = (ImageView) findViewById(R.id.image9);
        ScoreP1 = (TextView) findViewById(R.id.puntajeP1);
        ScoreP2 = (TextView) findViewById(R.id.puntajeP2);

        for (int i = 0; i < 8; i++) {
            matriz[i] = 0;
        }

        img1.setOnClickListener(this);
        img2.setOnClickListener(this);
        img3.setOnClickListener(this);
        img4.setOnClickListener(this);
        img5.setOnClickListener(this);
        img6.setOnClickListener(this);
        img7.setOnClickListener(this);
        img8.setOnClickListener(this);
        img9.setOnClickListener(this);

        borrar();
        actualizarMarcador();
    }
    @Override
    public void onClick(View view){
        boolean tiro = false;
        if (view.getId() == R.id.image1) {
            if (matriz[0] == 0 && jugador == 1) {
                img1.setImageResource(R.drawable.ximage);
                matriz[0] = 1;
                tiro = true;
            }
            if (matriz[0] == 0 && jugador == 2) {
                img1.setImageResource(R.drawable.oimage);
                matriz[0] = 2;
                tiro = true;
            }
        }else if (view.getId() == R.id.image2) {
            if (matriz[1] == 0 && jugador == 1) {
                img2.setImageResource(R.drawable.ximage);
                matriz[1] = 1;
                tiro = true;
            }
            if (matriz[1] == 0 && jugador == 2) {
                img2.setImageResource(R.drawable.oimage);
                matriz[1] = 2;
                tiro = true;
            }
        }else if (view.getId() == R.id.image3) {
            if (matriz[2] == 0 && jugador == 1) {
                img3.setImageResource(R.drawable.ximage);
                matriz[2] = 1;
                tiro = true;
            }
            if (matriz[2] == 0 && jugador == 2) {
                img3.setImageResource(R.drawable.oimage);
                matriz[2] = 2;
                tiro = true;
            }
        }else if (view.getId() == R.id.image3) {
            if (matriz[2] == 0 && jugador == 1) {
                img3.setImageResource(R.drawable.ximage);
                matriz[2] = 1;
                tiro = true;
            }
            if (matriz[2] == 0 && jugador == 2) {
                img3.setImageResource(R.drawable.oimage);
                matriz[2] = 2;
                tiro = true;
            }
        }else if (view.getId() == R.id.image4) {
            if (matriz[3] == 0 && jugador == 1) {
                img4.setImageResource(R.drawable.ximage);
                matriz[3] = 1;
                tiro = true;
            }
            if (matriz[3] == 0 && jugador == 2) {
                img4.setImageResource(R.drawable.oimage);
                matriz[3] = 2;
                tiro = true;
            }
        }else if (view.getId() == R.id.image5) {
            if (matriz[4] == 0 && jugador == 1) {
                img5.setImageResource(R.drawable.ximage);
                matriz[4] = 1;
                tiro = true;
            }
            if (matriz[4] == 0 && jugador == 2) {
                img5.setImageResource(R.drawable.oimage);
                matriz[4] = 2;
                tiro = true;
            }
        }else if (view.getId() == R.id.image6) {
            if (matriz[5] == 0 && jugador == 1) {
                img6.setImageResource(R.drawable.ximage);
                matriz[5] = 1;
                tiro = true;
            }
            if (matriz[5] == 0 && jugador == 2) {
                img6.setImageResource(R.drawable.oimage);
                matriz[5] = 2;
                tiro = true;
            }
        }else if (view.getId() == R.id.image7) {
            if (matriz[6] == 0 && jugador == 1) {
                img7.setImageResource(R.drawable.ximage);
                matriz[6] = 1;
                tiro = true;
            }
            if (matriz[6] == 0 && jugador == 2) {
                img7.setImageResource(R.drawable.oimage);
                matriz[6] = 2;
                tiro = true;
            }
        }else if (view.getId() == R.id.image8) {
            if (matriz[7] == 0 && jugador == 1) {
                img8.setImageResource(R.drawable.ximage);
                matriz[7] = 1;
                tiro = true;
            }
            if (matriz[7] == 0 && jugador == 2) {
                img8.setImageResource(R.drawable.oimage);
                matriz[7] = 2;
                tiro = true;
            }
        }else if (view.getId() == R.id.image9) {
            if (matriz[8] == 0 && jugador == 1) {
                img9.setImageResource(R.drawable.ximage);
                matriz[8] = 1;
                tiro = true;
            }
            if (matriz[8] == 0 && jugador == 2) {
                img9.setImageResource(R.drawable.oimage);
                matriz[8] = 2;
                tiro = true;
            }
        }
        if (tiro == true) {
            if (jugador == 1) {
                jugador = 2;
            } else {
                jugador = 1;
            }
            tiradas++;
            quiengana();
            checa();
        }
    }

    public void borrar(){
        img1.setImageResource(R.drawable.vacio);
        img2.setImageResource(R.drawable.vacio);
        img3.setImageResource(R.drawable.vacio);
        img4.setImageResource(R.drawable.vacio);
        img5.setImageResource(R.drawable.vacio);
        img6.setImageResource(R.drawable.vacio);
        img7.setImageResource(R.drawable.vacio);
        img8.setImageResource(R.drawable.vacio);
        img9.setImageResource(R.drawable.vacio);

        for (int i = 0; i < 8; i++) {
            matriz[i] = 0;
        }

        ganarP1 = false;
        ganarP2 = false;
        tiradas = 0;
    }

    public void actualizarMarcador(){
        ScoreP1.setText("");
        ScoreP2.setText("");
        String text1 = String.valueOf(GPlayer1);
        String text2 = String.valueOf(GPlayer2);
        ScoreP1.setText(text1);
        ScoreP2.setText(text2);
    }

    public void checa(){
        if(ganarP1 == true){
            GPlayer1++;
            Intent resultadoview = new Intent(MainActivity.this, Resultado.class);
            resultadoview.putExtra("resultado1", GPlayer1);
            resultadoview.putExtra("resultado2", GPlayer2);
            resultadoview.putExtra("Ganador", 1);
            startActivity(resultadoview);
            finish();
        }

        if(ganarP2 == true){
            GPlayer2++;
            Intent resultadoview = new Intent(MainActivity.this, Resultado.class);
            resultadoview.putExtra("resultado1", GPlayer1);
            resultadoview.putExtra("resultado2", GPlayer2);
            resultadoview.putExtra("Ganador", 2);
            startActivity(resultadoview);
            finish();
        }
        if(tiradas ==9 && ganarP1 == false && ganarP2 == false){
            Intent resultadoview = new Intent(MainActivity.this, Resultado.class);
            resultadoview.putExtra("resultado1", GPlayer1);
            resultadoview.putExtra("resultado2", GPlayer2);
            resultadoview.putExtra("Ganador", 3);
            startActivity(resultadoview);
            finish();
        }
    }
    public void quiengana(){
        // gana jugador 1
        if (matriz[0] == 1 && matriz[1]==1 && matriz[2] == 1) {
            ganarP1 = true;
        }
        if (matriz[3] == 1 && matriz[4]==1 && matriz[5] == 1) {
            ganarP1 = true;
        }
        if (matriz[6] == 1 && matriz[7]==1 && matriz[8] == 1) {
            ganarP1 = true;
        }
        if (matriz[0] == 1 && matriz[3]==1 && matriz[6] == 1) {
            ganarP1 = true;
        }
        if (matriz[1] == 1 && matriz[4]==1 && matriz[7] == 1) {
            ganarP1 = true;
        }
        if (matriz[2] == 1 && matriz[5]==1 && matriz[8] == 1) {
            ganarP1 = true;
        }
        if (matriz[0] == 1 && matriz[4]==1 && matriz[8] == 1) {
            ganarP1 = true;
        }
        if (matriz[2] == 1 && matriz[4]==1 && matriz[6] == 1) {
            ganarP1 = true;
        }
        // gana jugador 2
        if (matriz[0] == 2 && matriz[1]==2 && matriz[2] == 2) {
            ganarP2 = true;
        }
        if (matriz[3] == 2 && matriz[4]==2 && matriz[5] == 2) {
            ganarP2 = true;
        }
        if (matriz[6] == 2 && matriz[7]==2 && matriz[8] == 2) {
            ganarP2 = true;
        }
        if (matriz[0] == 2 && matriz[3]==2 && matriz[6] == 2) {
            ganarP2 = true;
        }
        if (matriz[1] == 2 && matriz[4]==2 && matriz[7] == 2) {
            ganarP2 = true;
        }
        if (matriz[2] == 2 && matriz[5]==2 && matriz[8] == 2) {
            ganarP2 = true;
        }
        if (matriz[0] == 2 && matriz[4]==2 && matriz[8] == 2) {
            ganarP2 = true;
        }
        if (matriz[2] == 2 && matriz[4]==2 && matriz[6] == 2) {
            ganarP2 = true;
        }
    }
}