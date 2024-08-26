package com.example.vehiclecarrentapp;

import com.example.vehiclecarrentapp.managers.RentManager;
import com.example.vehiclecarrentapp.model.*;

import java.util.UUID;

public class VehicleCarRentAppApplication {

    public static void main(String[] args) {
        RentManager rm = new RentManager();

        Address address = new Address("Warsaw", 12345, "Złota", 39);
        Client client = new Client(UUID.randomUUID(), "Dominik", "Kwiecień", address);

        Vehicle car = new Car(UUID.randomUUID(), 500.0, "Black", 2500.0, 5);

        Rent rent = rm.addRent(client, car);

        rm.printAllCurrentRents();

        rm.deleteRent(rent.getId());

        rm.printAllCurrentRents();
    }

}
