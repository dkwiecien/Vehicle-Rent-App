package com.example.vehiclecarrentapp.model;

import java.util.UUID;

public class Bicycle extends Vehicle {
    private boolean helperWheels;
    public Bicycle(UUID id, double weight, String color, double price, boolean helperWheels) {
        super(id, weight, color, price);
        this.helperWheels = helperWheels;
    }

    public boolean isHelperWheels() {
        return helperWheels;
    }

    public void setHelperWheels(boolean helperWheels) {
        this.helperWheels = helperWheels;
    }
}
