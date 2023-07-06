package com.hillel.vehicleFactory.vehicle;

import com.hillel.vehicleFactory.factory.CarFactory;
import com.hillel.vehicleFactory.motor.Motor;

public class DieselCar extends CarFactory {
    public Motor motor;

    public int euroStandard;

    public DieselCar(String brand, String bodyType, String fuelType, Motor motor, int euroStandard) {
        super(brand, bodyType, fuelType);
        this.motor = motor;
        this.euroStandard = euroStandard;
    }

    public void printDieselVehicle() {
        System.out.printf("Brand: %1s%n Body: %2s%n Fuel: %3s%n Motor: %4s Euro standard: %d%n", getBrand(), getBodyType(), getFuelType(), motor.printMotor(), 6);
        System.out.println();
    }
}
