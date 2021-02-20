package com.main;

public class Hero extends Instance {

    public Hero(int hp, int pw, int def, int sp, int luck) {
        super(hp, pw, def, sp, luck);
    }

    public int fortaDragonului() {

        return getPutere()*2;

    }
}
