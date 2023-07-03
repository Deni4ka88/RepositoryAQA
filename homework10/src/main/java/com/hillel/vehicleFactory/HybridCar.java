package com.hillel.vehicleFactory;

public class HybridCar extends GasolineCar{
    double electricRange;
    double fuelEfficiency;

    public HybridCar(String brand, String bodyType, String fuelType, double motorValue, Motor motorModel, double electricRange, double fuelEfficiency) {
        super(brand, bodyType, fuelType, motorValue, motorModel);
        this.electricRange = electricRange;
        this.fuelEfficiency = fuelEfficiency;
    }
}
