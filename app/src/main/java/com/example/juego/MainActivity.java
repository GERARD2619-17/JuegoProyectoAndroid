package com.example.juego;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;

public class MainActivity extends AppCompatActivity {
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }
    public void MULTIJUGADOR_onClick(View v){
        Intent multijugador = new Intent(this, MULTIJUGADOR.class);
        startActivity(multijugador);
    }
}