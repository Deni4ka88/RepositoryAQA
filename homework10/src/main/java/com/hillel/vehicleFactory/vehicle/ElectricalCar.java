package com.hillel.vehicleFactory.vehicle;

import com.hillel.vehicleFactory.factory.CarFactory;

public class ElectricalCar extends CarFactory {

    public String model;
    public int battery;
    public int maxRange;

    public ElectricalCar(String brand, String bodyType, String fuelType, String model, int battery, int maxRange) {
        super(brand, bodyType, fuelType);
        this.model = model;
        this.battery = battery;
        this.maxRange = maxRange;
    }

    public void printElectricCar() {
        System.out.printf("Brand: %1s%n Body: %2s%n Fuel: %3s%n Model: %4s%n Battery: %d%n Range: %s%n", getBrand(), getBodyType(), getFuelType(), model, battery, maxRange);
        System.out.println();
    }
}
