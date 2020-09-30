package com.example.juego;

import androidx.appcompat.app.AppCompatActivity;

import android.graphics.Color;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.Toast;

import com.example.juego.clases.Grupo;

import java.util.ArrayList;
import java.util.List;

public class MULTIJUGADOR extends AppCompatActivity implements View.OnClickListener{

    private List<Grupo> grupos = new ArrayList<>();
    private List<Button> botones = new ArrayList<>();
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_m_u_l_t_i_j_u_g_a_d_o_r);
        agregarBotones();
        cargarGrupos();
        cargar();
    }
    private void cargarGrupos(){
        int contador = 0;
        for(int i = 1; i<=7; i++){
            for(int j = 1; j <=5; j++){
                int id = (int)(Math.random() * 2) + 1;
                int cantidad = (int)(Math.random() * 6) + 1;
                Grupo g = new Grupo(id,i,j,cantidad,contador,botones.get(i));
                grupos.add(g);
                contador++;
            }
        }
    }
    private void agregarBotones(){
        Button btn1 = findViewById(R.id.btn1);
        botones.add(btn1);
        Button btn2 = findViewById(R.id.btn2);
        botones.add(btn2);
        Button btn3 = findViewById(R.id.btn3);
        botones.add(btn3);
        Button btn4 = findViewById(R.id.btn4);
        botones.add(btn4);
        Button btn5 = findViewById(R.id.btn5);
        botones.add(btn5);
        Button btn6 = findViewById(R.id.btn6);
        botones.add(btn6);
        Button btn7 = findViewById(R.id.btn7);
        botones.add(btn7);
        Button btn8 = findViewById(R.id.btn8);
        botones.add(btn8);
        Button btn9 = findViewById(R.id.btn9);
        botones.add(btn9);
        Button btn10 = findViewById(R.id.btn10);
        botones.add(btn10);
        Button btn11 = findViewById(R.id.btn11);
        botones.add(btn11);
        Button btn12 = findViewById(R.id.btn12);
        botones.add(btn12);
        Button btn13 = findViewById(R.id.btn13);
        botones.add(btn13);
        Button btn14 = findViewById(R.id.btn14);
        botones.add(btn14);
        Button btn15 = findViewById(R.id.btn15);
        botones.add(btn15);
        Button btn16 = findViewById(R.id.btn16);
        botones.add(btn16);
        Button btn17 = findViewById(R.id.btn17);
        botones.add(btn17);
        Button btn18 = findViewById(R.id.btn18);
        botones.add(btn18);
        Button btn19 = findViewById(R.id.btn19);
        botones.add(btn19);
        Button btn20 = findViewById(R.id.btn20);
        botones.add(btn20);
        Button btn21 = findViewById(R.id.btn21);
        botones.add(btn21);
        Button btn22 = findViewById(R.id.btn22);
        botones.add(btn22);
        Button btn23 = findViewById(R.id.btn23);
        botones.add(btn23);
        Button btn24 = findViewById(R.id.btn24);
        botones.add(btn24);
        Button btn25 = findViewById(R.id.btn25);
        botones.add(btn25);
        Button btn26 = findViewById(R.id.btn26);
        botones.add(btn26);
        Button btn27 = findViewById(R.id.btn27);
        botones.add(btn27);
        Button btn28 = findViewById(R.id.btn28);
        botones.add(btn28);
        Button btn29 = findViewById(R.id.btn29);
        botones.add(btn29);
        Button btn30 = findViewById(R.id.btn30);
        botones.add(btn30);
        Button btn31 = findViewById(R.id.btn31);
        botones.add(btn31);
        Button btn32 = findViewById(R.id.btn32);
        botones.add(btn32);
        Button btn33 = findViewById(R.id.btn33);
        botones.add(btn33);
        Button btn34 = findViewById(R.id.btn34);
        botones.add(btn34);
        Button btn35 = findViewById(R.id.btn35);
        botones.add(btn35);
        btn1.setOnClickListener(this);
        btn2.setOnClickListener(this);
        btn3.setOnClickListener(this);
        btn4.setOnClickListener(this);
        btn5.setOnClickListener(this);
        btn6.setOnClickListener(this);
        btn7.setOnClickListener(this);
        btn8.setOnClickListener(this);
        btn9.setOnClickListener(this);
        btn10.setOnClickListener(this);
        btn11.setOnClickListener(this);
        btn12.setOnClickListener(this);
        btn13.setOnClickListener(this);
        btn14.setOnClickListener(this);
        btn15.setOnClickListener(this);
        btn16.setOnClickListener(this);
        btn17.setOnClickListener(this);
        btn18.setOnClickListener(this);
        btn19.setOnClickListener(this);
        btn20.setOnClickListener(this);
        btn21.setOnClickListener(this);
        btn22.setOnClickListener(this);
        btn23.setOnClickListener(this);
        btn24.setOnClickListener(this);
        btn25.setOnClickListener(this);
        btn26.setOnClickListener(this);
        btn27.setOnClickListener(this);
        btn28.setOnClickListener(this);
        btn29.setOnClickListener(this);
        btn30.setOnClickListener(this);
        btn31.setOnClickListener(this);
        btn32.setOnClickListener(this);
        btn33.setOnClickListener(this);
        btn34.setOnClickListener(this);
        btn35.setOnClickListener(this);
    }

    private void cargar(){
        for (int i=0;i<35;i++){
            String bando;
            String cant = Integer.toString(grupos.get(i).getCantidad());
            if(grupos.get(i).getId()==1){
                botones.get(i).setBackgroundColor(Color.rgb(255,0,0));
            }
            else if(grupos.get(i).getId()==2){
                botones.get(i).setBackgroundColor(Color.rgb(0,255,0));
            }
            botones.get(i).setText(cant);
        }
    }

    @Override
    public void onClick(View view) {
        switch (view.getId()){
            case R.id.btn1:
                marcar(grupos.get(1).getId(),grupos.get(1).getPosX(),grupos.get(1).getPosY());
                break;
            case R.id.btn2:
                marcar(grupos.get(2).getId(),grupos.get(2).getPosX(),grupos.get(2).getPosY());
                break;
            case R.id.btn3:
                marcar(grupos.get(3).getId(),grupos.get(3).getPosX(),grupos.get(3).getPosY());
                break;
            case R.id.btn4:
                marcar(grupos.get(4).getId(),grupos.get(4).getPosX(),grupos.get(4).getPosY());
                break;
            case R.id.btn5:
                marcar(grupos.get(5).getId(),grupos.get(5).getPosX(),grupos.get(5).getPosY());
                break;
            case R.id.btn6:
                marcar(grupos.get(6).getId(),grupos.get(6).getPosX(),grupos.get(6).getPosY());
                break;
            case R.id.btn7:
                marcar(grupos.get(7).getId(),grupos.get(7).getPosX(),grupos.get(7).getPosY());
                break;
            case R.id.btn8:
                marcar(grupos.get(8).getId(),grupos.get(8).getPosX(),grupos.get(8).getPosY());
                break;
            case R.id.btn9:
                marcar(grupos.get(9).getId(),grupos.get(9).getPosX(),grupos.get(9).getPosY());
                break;
            case R.id.btn10:
                marcar(grupos.get(10).getId(),grupos.get(10).getPosX(),grupos.get(10).getPosY());
                break;
            case R.id.btn11:
                marcar(grupos.get(11).getId(),grupos.get(11).getPosX(),grupos.get(11).getPosY());
                break;
            case R.id.btn12:
                marcar(grupos.get(12).getId(),grupos.get(12).getPosX(),grupos.get(12).getPosY());
                break;
            case R.id.btn13:
                marcar(grupos.get(13).getId(),grupos.get(13).getPosX(),grupos.get(13).getPosY());
                break;
            case R.id.btn14:
                marcar(grupos.get(14).getId(),grupos.get(14).getPosX(),grupos.get(14).getPosY());
                break;
            case R.id.btn15:
                marcar(grupos.get(15).getId(),grupos.get(15).getPosX(),grupos.get(15).getPosY());
                break;
            case R.id.btn16:
                marcar(grupos.get(16).getId(),grupos.get(16).getPosX(),grupos.get(16).getPosY());
                break;
            case R.id.btn17:
                marcar(grupos.get(17).getId(),grupos.get(17).getPosX(),grupos.get(17).getPosY());
                break;
            case R.id.btn18:
                marcar(grupos.get(18).getId(),grupos.get(18).getPosX(),grupos.get(18).getPosY());
                break;
            case R.id.btn19:
                marcar(grupos.get(19).getId(),grupos.get(19).getPosX(),grupos.get(19).getPosY());
                break;
            case R.id.btn20:
                marcar(grupos.get(20).getId(),grupos.get(20).getPosX(),grupos.get(20).getPosY());
                break;
            case R.id.btn21:
                marcar(grupos.get(21).getId(),grupos.get(21).getPosX(),grupos.get(21).getPosY());
                break;
            case R.id.btn22:
                marcar(grupos.get(22).getId(),grupos.get(22).getPosX(),grupos.get(22).getPosY());
                break;
            case R.id.btn23:
                marcar(grupos.get(23).getId(),grupos.get(23).getPosX(),grupos.get(23).getPosY());
                break;
            case R.id.btn24:
                marcar(grupos.get(24).getId(),grupos.get(24).getPosX(),grupos.get(24).getPosY());
                break;
            case R.id.btn25:
                marcar(grupos.get(25).getId(),grupos.get(25).getPosX(),grupos.get(25).getPosY());
                break;
            case R.id.btn26:
                marcar(grupos.get(26).getId(),grupos.get(26).getPosX(),grupos.get(26).getPosY());
                break;
            case R.id.btn27:
                marcar(grupos.get(27).getId(),grupos.get(27).getPosX(),grupos.get(27).getPosY());
                break;
            case R.id.btn28:
                marcar(grupos.get(28).getId(),grupos.get(28).getPosX(),grupos.get(28).getPosY());
                break;
            case R.id.btn29:
                marcar(grupos.get(29).getId(),grupos.get(29).getPosX(),grupos.get(29).getPosY());
                break;
            case R.id.btn30:
                marcar(grupos.get(30).getId(),grupos.get(30).getPosX(),grupos.get(30).getPosY());
                break;
            case R.id.btn31:
                marcar(grupos.get(31).getId(),grupos.get(31).getPosX(),grupos.get(31).getPosY());
                break;
            case R.id.btn32:
                marcar(grupos.get(32).getId(),grupos.get(32).getPosX(),grupos.get(32).getPosY());
                break;
            case R.id.btn33:
                marcar(grupos.get(33).getId(),grupos.get(33).getPosX(),grupos.get(33).getPosY());
                break;
            case R.id.btn34:
                marcar(grupos.get(34).getId(),grupos.get(34).getPosX(),grupos.get(34).getPosY());
                break;
            case R.id.btn35:
                marcar(grupos.get(35).getId(),grupos.get(35).getPosX(),grupos.get(35).getPosY());
                break;
        }
    }

    private void marcar(int id, int x, int y){
        Grupo g = getGrupo(x,y);
        botones.get(g.getNumero()).setBackgroundColor(Color.rgb(0,0,255));

    }
    private Grupo getGrupo(int x, int y){
        Boolean validar = false;
        Grupo g = new Grupo();
        for(int i=0;i<35;i++){
            if(grupos.get(i).getPosX() == x && grupos.get(i).getPosY() == y){
                g=grupos.get(i-1);
            }
        }
        return g;
    }
}