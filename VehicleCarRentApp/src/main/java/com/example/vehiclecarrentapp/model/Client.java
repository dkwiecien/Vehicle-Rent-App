package com.example.vehiclecarrentapp.model;

import java.util.*;

public class Client {
    private UUID personalId;
    private String firstName;
    private String lastName;
    private Address address;
    private ArrayList<Rent> currentRents = new ArrayList<>();

    public Client(UUID personalId, String firstName, String lastName, Address address) {
        this.personalId = personalId;
        this.firstName = firstName;
        this.lastName = lastName;
        this.address = address;
    }

    public void addRent(Rent rent) {
        currentRents.add(rent);
    }

    public void deleteRent(Rent rent) {
        currentRents.remove(rent);
    }

    public UUID getPersonalId() {
        return personalId;
    }

    public List<Rent> getCurrentRents() {
        return currentRents;
    }

    public String getFirstName() {
        return firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public Address getAddress() {
        return address;
    }
}
