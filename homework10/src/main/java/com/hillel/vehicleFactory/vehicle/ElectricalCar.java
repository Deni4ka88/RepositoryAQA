package com.hillel.vehicleFactory.vehicle;

import com.hillel.vehicleFactory.factory.CarFactory;
import com.hillel.vehicleFactory.motor.Motor;

public class ElectricalCar extends CarFactory {

    private String model;
    private int battery;
    private int maxRange;
    private int mileage;

    private Motor motor;

    public ElectricalCar(String brand, int price, String bodyType, String fuelType, String model, int battery, int maxRange, int mileage, Motor motor) {
        super(brand, price, bodyType, fuelType);
        this.model = model;
        this.battery = battery;
        this.maxRange = maxRange;
        this.mileage = mileage;
        this.motor = motor;
    }

    public String getModel() {
        return model;
    }

    public int getBattery() {
        return battery;
    }

    public int getMaxRange() {
        return maxRange;
    }

    public int getMileage() {
        return mileage;
    }

    public Motor getMotor() {
        return motor;
    }
    //    public void printElectricCar() {
//        System.out.printf("Brand: %1s%n Body: %2s%n Fuel: %3s%n Model: %4s%n Battery: %d%n Range: %s%n", getBrand(), getBodyType(), getFuelType(), model, battery, maxRange);
//        System.out.println();
//    }
}
