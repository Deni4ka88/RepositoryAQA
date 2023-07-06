package com.hillel.vehicleFactory.vehicle;

import com.hillel.vehicleFactory.motor.Motor;

public class HybridCar extends GasolineCar {
    private double electricRange;
    private double fuelEfficiency;

    public HybridCar(String brand, int price, String bodyType, String fuelType, int mileage, Motor motorModel, double electricRange, double fuelEfficiency) {
        super(brand, price, bodyType, fuelType, mileage, motorModel);
        this.electricRange = electricRange;
        this.fuelEfficiency = fuelEfficiency;
    }

    public double getElectricRange() {
        return electricRange;
    }

    public double getFuelEfficiency() {
        return fuelEfficiency;
    }

    //    public void printHybrid() {
//        System.out.printf("Brand: %1s%n Body: %2s%n Fuel: %3s%n GRM: %4s%n Motor: %5s%n Range: %6f%n Efficiency: %7f%n", getBrand(), getBodyType(), getFuelType(), getGrm(), motorModel.printMotor(), electricRange, fuelEfficiency);
//        System.out.println();
//    }
}
