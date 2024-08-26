package com.example.vehiclecarrentapp.model;

public class Address {
    private String city;
    private int postCode;
    private String streetName;
    private int streetNumber;

    public Address(String city, int postCode, String streetName, int streetNumber) {
        this.city = city;
        this.postCode = postCode;
        this.streetName = streetName;
        this.streetNumber = streetNumber;
    }

    public String getCity() {
        return city;
    }

    public int getPostCode() {
        return postCode;
    }

    public String getStreetName() {
        return streetName;
    }

    public int getStreetNumber() {
        return streetNumber;
    }
}
