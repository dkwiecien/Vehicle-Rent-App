package com.example.vehiclecarrentapp.managers;

import com.example.vehiclecarrentapp.model.*;
import org.junit.Assert;
import org.junit.Test;

import java.util.UUID;

public class RentManagerTest {

    @Test
    public void testAddRent() {
        RentManager rm = new RentManager();

        Address address = new Address("Warsaw", 12345, "Złota", 39);
        Client client = new Client(UUID.randomUUID(), "Dominik", "Kwiecień", address);

        Vehicle car = new Car(UUID.randomUUID(), 500.0, "Black", 2500.0, 5);

        rm.addRent(client, car);

        Assert.assertEquals(1, client.getCurrentRents().size());
        Assert.assertEquals(1, rm.getAllRents().size());
        Assert.assertEquals(1, rm.getClients().size());
        Assert.assertEquals(0, rm.getArchiveRents().size());
    }

    @Test
    public void testAddRent_tooManyRents_throwsError() {
        RentManager rm = new RentManager();

        Address address = new Address("Warsaw", 12345, "Złota", 39);
        Client client = new Client(UUID.randomUUID(), "Dominik", "Kwiecień", address);

        Vehicle car = new Car(UUID.randomUUID(), 500.0, "Black", 2500.0, 5);
        Vehicle bicycle = new Bicycle(UUID.randomUUID(), 500.0, "Black", 2500.0, true);
        Vehicle motorcycle = new Motorcycle(UUID.randomUUID(), 500.0, "Black", 2500.0, 0);

        rm.addRent(client, car);
        rm.addRent(client, bicycle);

        Assert.assertThrows("Too many rents on your account", Error.class, () -> rm.addRent(client, motorcycle));
    }

    @Test
    public void testAddRent_vehicleAlreadyRented_throwsError() {
        RentManager rm = new RentManager();

        Address address = new Address("Warsaw", 12345, "Złota", 39);
        Client client = new Client(UUID.randomUUID(), "Dominik", "Kwiecień", address);

        Vehicle car = new Car(UUID.randomUUID(), 500.0, "Black", 2500.0, 5);

        rm.addRent(client, car);

        Assert.assertThrows("This vehicle is already rented", Error.class, () -> rm.addRent(client, car));
    }

    @Test
    public void testDeleteRent() {
        RentManager rm = new RentManager();

        Address address = new Address("Warsaw", 12345, "Złota", 39);
        Client client = new Client(UUID.randomUUID(), "Dominik", "Kwiecień", address);

        Vehicle car = new Car(UUID.randomUUID(), 500.0, "Black", 2500.0, 5);

        Rent rent = rm.addRent(client, car);

        rm.deleteRent(rent.getId());

        Assert.assertEquals(0, client.getCurrentRents().size());
        Assert.assertEquals(1, rm.getAllRents().size());
        Assert.assertEquals(0, rm.getClients().size());
        Assert.assertEquals(1, rm.getArchiveRents().size());
    }
}