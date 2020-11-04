package com.example.juego;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.TextView;

public class Ganador extends AppCompatActivity {
    TextView txtTitulo;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_ganador);
        this.txtTitulo = findViewById(R.id.txtTitulo);
        txtTitulo.setText("Victoria!");
    }
    public void recargar_onClick(View v){
        Intent mundo1 = new Intent(this, Mundo1Niveles.class);
        mundo1.putExtra("nivel",getIntent().getStringExtra("nivel"));
        startActivity(mundo1);
        finish();
    }
    public void niveles_onClick(View v){
        finish();
    }
    public void siguiente_onClick(View v){
        Intent mundo1 = new Intent(this, Mundo1Niveles.class);
        int nivelProximo = Integer.parseInt(getIntent().getStringExtra("nivel"))+1;
        mundo1.putExtra("nivel",Integer.toString(nivelProximo));
        startActivity(mundo1);
        finish();
    }
}