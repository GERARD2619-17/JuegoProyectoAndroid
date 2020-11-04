package com.example.juego;

import androidx.appcompat.app.AppCompatActivity;

import android.content.SharedPreferences;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.Toast;

public class Configuracion extends AppCompatActivity {
    private SharedPreferences Desbloqueados;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_configuracion);
        this.Desbloqueados = getSharedPreferences(Mundo1.ARCHIVO,MODE_PRIVATE);
    }
    public void borrarDatos_onClick(View v){
        if(this.Desbloqueados!=null){
            SharedPreferences.Editor editor = this.Desbloqueados.edit();
            editor.putString(Mundo1.KEY,"");
            if(editor.commit()){
                Toast.makeText(this, "Los niveles se reiniciaron en 1", Toast.LENGTH_SHORT).show();
            }else {
                Toast.makeText(this, "Error", Toast.LENGTH_SHORT).show();
            }

        }
    }
}