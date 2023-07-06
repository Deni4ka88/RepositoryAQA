package com.hillel.vehicleFactory.vehicle;

import com.hillel.vehicleFactory.factory.CarFactory;
import com.hillel.vehicleFactory.motor.Motor;

public class GasolineCar extends CarFactory {

    private boolean grm;

    public Motor motorModel;

    public GasolineCar(String brand, String bodyType, String fuelType, boolean grm, Motor motorModel) {
        super(brand, bodyType, fuelType);
        this.grm = grm;
        this.motorModel = motorModel;
    }

    public boolean getGrm() {
        return grm;
    }

    public void printGasoline(){
        System.out.printf("Brand: %1s%n Body: %2s%n Fuel: %3s%n GRM: %4s%n Motor: %5s%n",getBrand(),getBodyType(),getFuelType(),grm,motorModel.printMotor());
    }
}