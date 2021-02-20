package com.main;

public abstract class Instance {
    protected int viata;
    protected int putere;
    protected int aparare;
    protected int viteza;
    protected int noroc;

    public Instance(int hp, int pw, int def, int sp, int luck) {

        this.viata = hp;
        this.putere = pw;
        this.aparare = def;
        this.viteza = sp;
        this.noroc = luck;

    }

    public int getAparare() {
        return aparare;
    }

    public int getNoroc() {
        return noroc;
    }

    public int getPutere() {
        return putere;
    }

    public int getViata() {
        return viata;
    }

    public int getViteza() {
        return viteza;
    }

    public void setAparare(int aparare) {
        this.aparare = aparare;
    }

    public void setNoroc(int noroc) {
        this.noroc = noroc;
    }

    public void setPutere(int putere) {
        this.putere = putere;
    }

    public void setViata(int viata) {
        this.viata = viata;
    }

    public void setViteza(int viteza) {
        this.viteza = viteza;
    }
}
