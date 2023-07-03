package com.hillel.vehicleFactory;

public class DieselCar extends CarFactory {
    Motor motorValue;

    int euroStandard;

    public DieselCar(String brand, String bodyType, String fuelType, Motor motorValue, int euroStandard) {
        super(brand, bodyType, fuelType);
        this.motorValue = motorValue;
        this.euroStandard = euroStandard;
    }
}
