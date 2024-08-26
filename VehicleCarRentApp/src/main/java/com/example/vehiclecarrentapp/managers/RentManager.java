package com.example.vehiclecarrentapp.managers;

import com.example.vehiclecarrentapp.model.Client;
import com.example.vehiclecarrentapp.model.Rent;
import com.example.vehiclecarrentapp.model.Vehicle;

import java.util.List;
import java.util.UUID;

public class RentManager {
    private final int MAX_RENTS = 2;
    private List<Rent> archiveRents;

    public RentManager() {

    }

    public boolean addRent(Client client, Vehicle vehicle) {
        if (client.getCurrentRents().size() >= MAX_RENTS) return false;
        if (vehicle.isRented()) return false;

        Rent newRent = new Rent(UUID.randomUUID(), client, vehicle);

        client.addRent(newRent);
        vehicle.setRented(true);

        return true;
    }

    public boolean deleteRent(Client client, UUID id) {
        for (Rent currentRent : client.getCurrentRents()) {
            if (currentRent.getId() == id) {
                currentRent.getVehicle().setRented(false);
                currentRent.getClient().deleteRent(currentRent);
                archiveRents.add(currentRent);
                return true;
            }
        }
        return false;
    }
}
