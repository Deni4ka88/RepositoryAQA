package com.hillel.vehicleFactory.vehicle;

import com.hillel.vehicleFactory.factory.CarFactory;
import com.hillel.vehicleFactory.motor.Motor;

public class GasolineCar extends CarFactory {

    private int mileage;
    private Motor motorModel;

    public GasolineCar(String brand, int price, String bodyType, String fuelType, int mileage, Motor motorModel) {
        super(brand, price, bodyType, fuelType);
        this.mileage = mileage;
        this.motorModel = motorModel;
    }

    public int getMileage() {
        return mileage;
    }

    public Motor getMotorModel() {
        return motorModel;
    }

    //    public void printGasoline(){
//        System.out.printf("Brand: %1s%n Body: %2s%n Fuel: %3s%n GRM: %4s%n Motor: %5s%n",getBrand(),getBodyType(),getFuelType(),grm,motorModel.printMotor());
//    }
}