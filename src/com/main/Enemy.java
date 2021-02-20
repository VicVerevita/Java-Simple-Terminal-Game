package com.main;

import java.util.Random;

public class Enemy extends Instance{


    public Enemy(int hp, int pw, int def, int sp, int luck) {
        super(hp, pw, def, sp, luck);
    }

    public int scutulFermecat() {

        return getPutere()/2;

    }

    @Override
    public String toString() {
        return "La sfarsitul acestei ture, inamicul are:\n" +
                super.toString();
    }
}
