package com.example.juego;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Context;
import android.content.Intent;
import android.content.SharedPreferences;
import android.media.AudioManager;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.Button;
import android.widget.SeekBar;
import android.widget.Toast;

public class Configuracion extends AppCompatActivity implements View.OnClickListener{
    Button btnstop,btnplay,btnpantallaAtras;
    AudioManager audioManager;
    SeekBar sk_volumen;
    private SharedPreferences Desbloqueados;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_configuracion);
        this.Desbloqueados = getSharedPreferences(Mundo1.ARCHIVO,MODE_PRIVATE);

        btnstop = findViewById(R.id.btnstop);

        btnstop.setOnClickListener(this);

        btnplay = findViewById(R.id.btnplay);

        btnplay.setOnClickListener(this);
        btnpantallaAtras = findViewById(R.id.btnpantallaAtras);
        btnpantallaAtras.setOnClickListener(this);
        Volumen();
    }
    private void Volumen(){
        try {
            sk_volumen = (SeekBar)findViewById(R.id.volumeSeekbar);
            audioManager = (AudioManager) getSystemService(Context.AUDIO_SERVICE);
            sk_volumen.setMax(audioManager.getStreamMaxVolume(AudioManager.STREAM_MUSIC));
            sk_volumen.setProgress(audioManager.getStreamVolume(AudioManager.STREAM_MUSIC));

            sk_volumen.setOnSeekBarChangeListener(new SeekBar.OnSeekBarChangeListener() {
                @Override            public void onStopTrackingTouch(SeekBar arg0) {
                }

                @Override            public void onStartTrackingTouch(SeekBar arg0) {
                }

                @Override            public void onProgressChanged(SeekBar arg0, int progress, boolean arg2) {
                    audioManager.setStreamVolume(AudioManager.STREAM_MUSIC, progress, 0);
                }
            });
        }catch (Exception e){
            e.printStackTrace();
        }
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

    @Override
    public void onClick(View v) {
        switch (v.getId()) {
            case R.id.btnstop: {
                // Intent a = new Intent(this, PantallaActivity2.class);
                Intent i = new Intent(this, AudioService.class);
                i.putExtra("action", AudioService.PAUSE);
                startService(i);
                //  startService(a);


            }
            break;
            case R.id.btnplay:{
                Intent pantalla1 = new Intent(this, MainActivity.class);
                Intent pantalla2 = new Intent(this, MULTIJUGADOR.class);
                Intent pantalla3 = new Intent(this, Mundo1.class);
                Intent pantalla4 = new Intent(this, Mundo1Niveles.class);
                Intent pantalla5 = new Intent(this, PantallaMenuDos.class);
                Intent pantalla6 = new Intent(this, SelectorMundos.class);
                Intent i = new Intent(this, AudioService.class);
                i.putExtra("action", AudioService.START);
                startService(i);
                startService(pantalla1);
                startService(pantalla2);
                startService(pantalla3);
                startService(pantalla4);
                startService(pantalla5);
                startService(pantalla6);

            }break;
            case R.id.btnpantallaAtras:{

                Intent i = new Intent(this, MainActivity.class);
               /* Intent e = new Intent(this, AudioService.class);
                e.putExtra("action", AudioService.START);*/

                //  startService(e);
                startActivity(i);

            }break;



        }
    }
}