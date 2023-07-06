package com.hillel.vehicleFactory.vehicle;

import com.hillel.vehicleFactory.motor.Motor;

public class HybridCar extends GasolineCar {
    public double electricRange;
    public double fuelEfficiency;

    public HybridCar(String brand, String bodyType, String fuelType, boolean grm, Motor motorModel, double electricRange, double fuelEfficiency) {
        super(brand, bodyType, fuelType, grm, motorModel);
        this.electricRange = electricRange;
        this.fuelEfficiency = fuelEfficiency;
    }

    public void printHybrid() {
        System.out.printf("Brand: %1s%n Body: %2s%n Fuel: %3s%n GRM: %4s%n Motor: %5s%n Range: %6f%n Efficiency: %7f%n", getBrand(), getBodyType(), getFuelType(), getGrm(), motorModel.printMotor(), electricRange, fuelEfficiency);
        System.out.println();
    }
}
