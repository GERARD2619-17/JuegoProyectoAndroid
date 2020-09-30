package com.example.juego.clases;

import android.widget.Button;

public class Grupo {
    private int id;
    private int posX;
    private int posY;
    private int cantidad;
    private int numero;
    private Button btn;

    public Grupo(int I, int X, int Y, int C, int N, Button btn){
        this.id = I;
        this.posX = X;
        this.posY = Y;
        this.cantidad = C;
        this.numero = N;
        this.btn = btn;
    }

    public Grupo(){}
    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public int getPosX() {
        return posX;
    }

    public void setPosX(int posX) {
        this.posX = posX;
    }

    public int getPosY() {
        return posY;
    }

    public void setPosY(int posY) {
        this.posY = posY;
    }

    public int getCantidad() {
        return cantidad;
    }

    public void setCantidad(int cantidad) {
        this.cantidad = cantidad;
    }

    public void setNumero(int numero) {
        this.numero = numero;
    }

    public int getNumero() {
        return numero;
    }

    public Button getBtn() {
        return btn;
    }

    public void setBtn(Button btn) {
        this.btn = btn;
    }
}