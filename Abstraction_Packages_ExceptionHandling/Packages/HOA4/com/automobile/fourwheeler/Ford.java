package com.automobile.fourwheeler;

import com.automobile.Vehicle;

public class Ford extends Vehicle {

    public String getModelName() {
        return "Ford EcoSport";
    }

    public String getRegistrationNumber() {
        return "AP39GH2222";
    }

    public String getOwnerName() {
        return "Pragyna";
    }

    public int speed() {
        return 160;
    }

    public int tempControl() {
        return 1;
    }
}