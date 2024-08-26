package com.example.vehiclecarrentapp.model;

import java.util.*;

public class Client {
    private UUID personalId;
    private String firstName;
    private String lastName;
    private Address address;
    private List<Rent> currentRents;

    public Client(UUID personalId, String firstName, String lastName, Address address, List<Rent> currentRents) {
        this.personalId = personalId;
        this.firstName = firstName;
        this.lastName = lastName;
        this.address = address;
        this.currentRents = currentRents;
    }

    public UUID getPersonalId() {
        return personalId;
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

    public List<Rent> getCurrentRents() {
        return currentRents;
    }

    public void setPersonalId(UUID personalId) {
        this.personalId = personalId;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public void setAddress(Address address) {
        this.address = address;
    }

    public void setCurrentRents(List<Rent> currentRents) {
        this.currentRents = currentRents;
    }
}
