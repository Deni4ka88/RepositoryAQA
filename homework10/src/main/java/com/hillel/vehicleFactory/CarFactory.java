package com.hillel.vehicleFactory;

public abstract class CarFactory {
    String brand;
    String bodyType;
    String fuelType;


    public CarFactory(String brand, String bodyType, String fuelType) {
        this.brand = brand;
        this.bodyType = bodyType;
        this.fuelType = fuelType;
    }
}
