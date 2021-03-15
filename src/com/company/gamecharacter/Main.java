package com.company.gamecharacter;

public class Main {
    public static void main(String[] args) {


        Hero hero= new Hero(100, 10);
        NonPlayerCharacter enemy1 = new NonPlayerCharacter (100, 2);
        enemy1.atack(hero);
        hero.atack(enemy1);
        System.out.println(hero.getViata() + " " +  hero.getPutereDeAtac());
        System.out.println(enemy1.getViata() + " " +  enemy1.getPutereDeAtac());
    }
}
