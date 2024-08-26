package com.example.vehiclecarrentapp.model;

import java.util.UUID;

public abstract class Vehicle {
    private UUID id;
    private double weight;
    private String color;
    private double price;
    private boolean isRented;

    public Vehicle(UUID id, double weight, String color, double price) {
        this.id = id;
        this.weight = weight;
        this.color = color;
        this.price = price;
    }

    public UUID getId() {
        return id;
    }

    public double getWeight() {
        return weight;
    }

    public String getColor() {
        return color;
    }

    public double getPrice() {
        return price;
    }

    public boolean isRented() {
        return isRented;
    }

    public void setRented(boolean rented) {
        isRented = rented;
    }
}
