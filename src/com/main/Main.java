package com.main;

import java.util.Random;

public class Main {

    static boolean lupta(int viataHero, int viataEnemy){

        if(viataEnemy <= 0 || viataHero <= 0){
            return false;
        }
        else return true;

    }

    static void tura(Hero hero, Enemy enemy) {

        int damage = 0;
        int attacker = 0;
        int norocel = new Random().nextInt(100);
        int abilitate1 = new Random().nextInt(100);
        int abilitate2 = new Random().nextInt(100);
        boolean ab1 = false;
        boolean ab2 = false;
        boolean enemyLuck = true;
        boolean heroLuck = true;

        if(hero.getViteza() == enemy.getViteza()) {
            if(hero.getNoroc() > enemy.getNoroc()) {

                if(abilitate1 < 10) {
                    damage = hero.fortaDragonului() - enemy.getAparare();
                    ab1 = true;
                }
                else {
                    damage = hero.getPutere() - enemy.getAparare();
                }

                attacker = 1;

            }
            else {

                if(abilitate2 < 20) {
                    damage = enemy.scutulFermecat() - hero.getAparare();
                    ab2 = true;
                }
                else {
                    damage = enemy.getPutere() - hero.getAparare();
                }
                attacker = 0;

            }
        }
        else if(hero.getViteza() > enemy.getViteza()) {

            if(abilitate1 < 10) {
                damage = hero.fortaDragonului() - enemy.getAparare();
                ab1 = true;
            }
            else {
                damage = hero.getPutere() - enemy.getAparare();
            }

            attacker = 1;

        }
        else {

            if(abilitate2 < 20) {
                damage = enemy.scutulFermecat() - hero.getAparare();
                ab2 = true;
            }
            else {
                damage = enemy.getPutere() - hero.getAparare();
            }
            attacker = 0;

        }

        if(attacker == 1) {

            if(damage < 0)
                damage = 0;
            else if(damage > 100)
                damage = 100;

            if(norocel > enemy.getNoroc()) {
                enemyLuck = false;
                enemy.setViata(enemy.getViata() - damage);
            }

            damage = enemy.scutulFermecat() - hero.getAparare();
            if(damage < 0)
                damage = 0;
            else if(damage > 100)
                damage = 100;

            norocel = new Random().nextInt(100);
            if(norocel > hero.getNoroc()) {
                heroLuck = false;
                hero.setViata(hero.getViata() - damage);
            }

        }

        if(attacker == 0) {

            if(damage < 0)
                damage = 0;
            else if(damage > 100)
                damage = 100;

            if(norocel > hero.getNoroc()) {
                heroLuck = false;
                hero.setViata(hero.getViata() - damage);
            }

            if(abilitate1 < 10) {
                damage = hero.fortaDragonului() - enemy.getAparare();
                ab1 = true;
            }
            else {
                damage = hero.getPutere() - enemy.getAparare();
            }
            if(damage < 0)
                damage = 0;
            else if(damage > 100)
                damage = 100;

            norocel = new Random().nextInt(100);
            if(norocel > enemy.getNoroc()) {
                enemyLuck = false;
                enemy.setViata(enemy.getViata() - damage);
            }

        }

        if(ab1 == true && ab2 == true) {
            System.out.println("Tura aceasta s-au folosit abilitatile: Forta Dragonului si Scutul Fermecat.");
        }
        else if(ab1 == true) {
            System.out.println("Tura aceasta s-a folosit abilitatea: Forta Dragonului.");
        }
        else if(ab2 == true) {
            System.out.println("Tura aceasta s-a folosit abilitatea: Scutul Fermecat");
        }
        else {
            System.out.println("Tura aceasta nu s-a folosit nicio abilitate.");
        }


        if(heroLuck == true) {
            System.out.println("Tura aceasta, eroul a avut noroc, iar inamicul a ratat!");
        }
        if(enemyLuck == true) {
            System.out.println("Tura aceasta, inamicul a avut noroc, iar eroul a ratat!");
        }

    }

    public static void main(String[] args) {

        Hero Carl = new Hero(new Random().nextInt(30) + 65, new Random().nextInt(10) + 60, new Random().nextInt(10) + 40,new Random().nextInt(10) + 40, new Random().nextInt(20) + 10);
        Enemy bestie = new Enemy(new Random().nextInt(25) + 55, new Random().nextInt(30) + 50, new Random().nextInt(20) + 35, new Random().nextInt(20) + 40, new Random().nextInt(15) + 25);

        int nrTure = 0;

        while(lupta(Carl.getViata(), bestie.getViata())) {

            System.out.println();
            nrTure++;
            System.out.println();
            System.out.println("Tura " + nrTure + ": ");
            System.out.println();
            tura(Carl, bestie);
            System.out.println();

        }

        if(Carl.getViata() < 0)
            System.out.println("Din pacate, inamicul a castigat, iar eroul a fost invins.");

        if(bestie.getViata() < 0)
            System.out.println("Eroul a castigat lupta!");

        if(nrTure > 20) {
            System.out.println("Lupta nu are niciun castigator.");
        }

    }

}
