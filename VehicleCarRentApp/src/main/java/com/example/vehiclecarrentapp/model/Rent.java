package com.example.vehiclecarrentapp.model;

import java.util.UUID;

public class Rent {
    private UUID id;
    private double price;
    private Client client;
    private Vehicle vehicle;

    public Rent(UUID id, double price, Client client, Vehicle vehicle) {
        this.id = id;
        this.price = price;
        this.client = client;
        this.vehicle = vehicle;
    }

    public UUID getId() {
        return id;
    }

    public double getPrice() {
        return price;
    }

    public Client getClient() {
        return client;
    }

    public Vehicle getVehicle() {
        return vehicle;
    }
}
