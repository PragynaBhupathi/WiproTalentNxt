package com.automobile.twowheeler;

import com.automobile.Vehicle;

public class Honda extends Vehicle {

    @Override
    public String getModelName() {
        return "Honda Shine";
    }

    @Override
    public String getRegistrationNumber() {
        return "AP39CD5678";
    }

    @Override
    public String getOwnerName() {
        return "Pragyna";
    }

    public int getSpeed() {
        return 90;
    }

    public void cdplayer() {
        System.out.println("CD Player is ON.");
    }
}