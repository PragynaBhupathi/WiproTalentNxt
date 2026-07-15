package com.automobile;

import com.automobile.twowheeler.Hero;
import com.automobile.twowheeler.Honda;

public class HOA3 {

    public static void main(String[] args) {

        Hero hero = new Hero();

        System.out.println("------ HERO ------");
        System.out.println("Model : " + hero.getModelName());
        System.out.println("Registration : " + hero.getRegistrationNumber());
        System.out.println("Owner : " + hero.getOwnerName());
        System.out.println("Speed : " + hero.getSpeed());
        hero.radio();

        System.out.println();

        Honda honda = new Honda();

        System.out.println("------ HONDA ------");
        System.out.println("Model : " + honda.getModelName());
        System.out.println("Registration : " + honda.getRegistrationNumber());
        System.out.println("Owner : " + honda.getOwnerName());
        System.out.println("Speed : " + honda.getSpeed());
        honda.cdplayer();
    }
}