package com.example.juego;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class MainActivity extends AppCompatActivity {
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        Button btnsalimos  = findViewById(R.id.btnsalir);


        btnsalimos.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
               Intent intent = new Intent(Intent.ACTION_MAIN);
               intent.addCategory(Intent.CATEGORY_HOME);
               intent.setFlags(Intent.FLAG_ACTIVITY_NEW_TASK);
               startActivity(intent);
            }
        });
    }
    public void MULTIJUGADOR_onClick(View v){
        Intent multijugador = new Intent(this, PantallaMenuDos.class);
        startActivity(multijugador);
    }
    //Aventura
    public void AVENTURA_onClick(View v){
        Intent aventura = new Intent(this, Mundo1.class);
        startActivity(aventura);
    }
}