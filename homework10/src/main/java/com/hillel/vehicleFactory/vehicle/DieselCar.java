package com.hillel.vehicleFactory.vehicle;

import com.hillel.vehicleFactory.factory.CarFactory;
import com.hillel.vehicleFactory.motor.Motor;

public class DieselCar extends CarFactory {
    private Motor motor;

    private int mileage;

    private int euroStandard;

    public DieselCar(String brand, int price, String bodyType, String fuelType, Motor motor, int mileage, int euroStandard) {
        super(brand, price, bodyType, fuelType);
        this.motor = motor;
        this.mileage = mileage;
        this.euroStandard = euroStandard;
    }

    public Motor getMotor() {
        return motor;
    }

    public int getMileage() {
        return mileage;
    }

    public int getEuroStandard() {
        return euroStandard;
    }

    public void setEuroStandard(int euroStandard) {
        if (euroStandard < 5){
            System.out.println("You should passing emission control");
        }
        this.euroStandard = euroStandard;
    }

    //    public void printDieselVehicle() {
//        System.out.printf("Brand: %1s%n Body: %2s%n Fuel: %3s%n Motor: %4s Euro standard: %d%n", getBrand(), getBodyType(), getFuelType(), motor.printMotor(), 6);
//        System.out.println();
//    }
}
