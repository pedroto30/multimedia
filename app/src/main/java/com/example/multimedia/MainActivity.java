package com.example.multimedia;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.media.MediaPlayer;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.ImageButton;

public class MainActivity extends AppCompatActivity {
ImageButton btngato, btnperro;
Button btnllamar;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        btngato=(ImageButton)findViewById(R.id.btngato);
        btnperro=(ImageButton)findViewById(R.id.btnperro);
        btnllamar=(Button)findViewById(R.id.btnllamar);
        btnperro.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Ladrar();
                Intent form2= new Intent(MainActivity.this,salud.class);
                startActivity(form2);
            }
        });
        btnllamar.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent form2= new Intent(MainActivity.this,Formulario2Activity2.class);
                startActivity(form2);
            }
        });
        btngato.setOnClickListener(new View.OnClickListener() {
            @Override

            public void onClick(View v) {
                Maullar();
                Intent form2= new Intent(MainActivity.this,calculadora.class);
                startActivity(form2);
            }

        });

    }

    private void Ladrar() {
        MediaPlayer mpPerro=MediaPlayer.create(MainActivity.this,R.raw.salu);
                mpPerro.start();
    }

    private void Maullar() {
        MediaPlayer mpGato= MediaPlayer.create(MainActivity.this,R.raw.calcu);
        mpGato.start();
    }
}