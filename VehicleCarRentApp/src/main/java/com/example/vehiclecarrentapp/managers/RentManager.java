package com.example.vehiclecarrentapp.managers;

import com.example.vehiclecarrentapp.model.Client;
import com.example.vehiclecarrentapp.model.Rent;
import com.example.vehiclecarrentapp.model.Vehicle;

import java.util.ArrayList;
import java.util.List;
import java.util.UUID;

public class RentManager {
    private final ArrayList<Rent> archiveRents = new ArrayList<>();
    private final ArrayList<Client> clients = new ArrayList<>();
    private final ArrayList<Rent> allRents = new ArrayList<>();

    public RentManager() {

    }

    public Rent addRent(Client client, Vehicle vehicle) {
        int MAX_RENTS = 2;
        if (client.getCurrentRents().size() >= MAX_RENTS) throw new Error("Too many rents on your account");
        if (vehicle.isRented()) throw new Error("This vehicle is already rented");

        Rent newRent = new Rent(UUID.randomUUID(), client, vehicle);

        client.addRent(newRent);
        vehicle.setRented(true);
        clients.add(client);
        allRents.add(newRent);

        return newRent;
    }

    public void deleteRent(UUID rentId) {
        for (Rent currentRent : allRents) {
            if (currentRent.getId() == rentId) {
                currentRent.getVehicle().setRented(false);
                currentRent.getClient().deleteRent(currentRent);
                clients.remove(currentRent.getClient());
                archiveRents.add(currentRent);
                return;
            }
        }
        throw new Error("No rent available with this id");
    }

    public void printAllCurrentRents() {
        int rentCount = 0;
        for (Client client : clients) {
            List<Rent> clientRents = client.getCurrentRents();
            if (!clientRents.isEmpty()) {
                rentCount += clientRents.size();
                for (Rent rent : clientRents) {
                    System.out.println("RentId: " + rent.getId() + ", Client: " + rent.getClient().getFirstName() +
                            " " + rent.getClient().getLastName() + ", rented: " + rent.getVehicle().getId());
                }
            }
        }

        if (rentCount == 0) {
            System.out.println("No current rents available");
        }
    }

    public ArrayList<Rent> getAllRents() {
        return allRents;
    }

    public ArrayList<Rent> getArchiveRents() {
        return archiveRents;
    }

    public ArrayList<Client> getClients() {
        return clients;
    }
}
