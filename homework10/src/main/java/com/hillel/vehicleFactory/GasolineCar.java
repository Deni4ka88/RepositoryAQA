package com.hillel.vehicleFactory;

public class GasolineCar  extends CarFactory{

    double motorValue;

    Motor motorModel;

    public GasolineCar(String brand, String bodyType, String fuelType, double motorValue, Motor motorModel) {
        super(brand, bodyType, fuelType);
        this.motorValue = motorValue;
        this.motorModel = motorModel;
    }
}
