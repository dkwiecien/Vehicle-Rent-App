package com.example.vehiclecarrentapp.model;

import java.util.UUID;

public class Car extends Vehicle {
    private int numberOfSeats;
    public Car(UUID id, double weight, String color, double price, int numberOfSeats) {
        super(id, weight, color, price);
        this.numberOfSeats = numberOfSeats;
    }

    public int getNumberOfSeats() {
        return numberOfSeats;
    }

    public void setNumberOfSeats(int numberOfSeats) {
        this.numberOfSeats = numberOfSeats;
    }
}
