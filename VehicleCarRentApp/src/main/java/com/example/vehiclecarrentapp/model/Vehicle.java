package com.example.vehiclecarrentapp.model;

import java.util.UUID;

public abstract class Vehicle {
    private UUID id;
    private double weight;
    private String color;
    private double price;
    private boolean isRented;

    public Vehicle(UUID id, double weight, String color, double price, boolean isRented) {
        this.id = id;
        this.weight = weight;
        this.color = color;
        this.price = price;
        this.isRented = isRented;
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

    public void setId(UUID id) {
        this.id = id;
    }

    public void setWeight(double weight) {
        this.weight = weight;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    public void setRented(boolean rented) {
        isRented = rented;
    }
}
