package com.example.juego;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;

public class PantallaMenuDos extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_pantalla_menu_dos);
    }
    public void VSPersonas_onClick(View v){
        Intent vspersonas = new Intent(this, MULTIJUGADOR.class);
        startActivity(vspersonas);
    }
    public void Retroceder_onClick(View v){
        Intent retroceder = new Intent(this, MainActivity.class);
        startActivity(retroceder);
    }
}