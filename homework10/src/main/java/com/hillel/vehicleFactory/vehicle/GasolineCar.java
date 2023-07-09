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

    @Override
    public int calculateVehiclePrice() {
        int price = getPrice();
        if (this.mileage > 3000) {
            int decreasePrice = this.mileage / 3000;
            for (int i = 0; i < decreasePrice; i++) {
                price -= price * 0.02;
                setPrice(price);
            }

        }
        return price;
    }

    @Override
    public String toString() {
        return "GasolineCar:" +
                " brand = " + getBrand() +
                " price = " + getPrice() +
                " body type = " + getBodyType() +
                " fuel type = " + getFuelType() +
                " mileage = " + mileage +
                " motor model = " + motorModel +
                '.';
    }
}