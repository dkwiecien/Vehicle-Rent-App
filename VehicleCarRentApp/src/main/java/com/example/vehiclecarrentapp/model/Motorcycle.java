package com.example.vehiclecarrentapp.model;

import java.util.UUID;

public class Motorcycle extends Vehicle {
    private int engineDisplacement;

    public Motorcycle(UUID id, double weight, String color, double price, int engineDisplacement) {
        super(id, weight, color, price);
        this.engineDisplacement = engineDisplacement;
    }

    public int getEngineDisplacement() {
        return engineDisplacement;
    }

    public void setEngineDisplacement(int engineDisplacement) {
        this.engineDisplacement = engineDisplacement;
    }
}
