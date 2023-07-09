package com.hillel.vehicleFactory.vehicle;

import com.hillel.vehicleFactory.factory.CarFactory;
import com.hillel.vehicleFactory.motor.Motor;

public class ElectricalCar extends CarFactory {

    private String model;
    private int battery;
    private int maxRange;
    private int mileage;

    private Motor motor;

    public ElectricalCar(String brand, int price, String bodyType, String fuelType, String model, int battery, int maxRange, int mileage, Motor motor) {
        super(brand, price, bodyType, fuelType);
        this.model = model;
        this.battery = battery;
        this.maxRange = maxRange;
        this.mileage = mileage;
        this.motor = motor;
    }

    public String getModel() {
        return model;
    }

    public int getBattery() {
        return battery;
    }

    public int getMaxRange() {
        return maxRange;
    }

    public int getMileage() {
        return mileage;
    }

    public Motor getMotor() {
        return motor;
    }

    @Override
    public int calculateVehiclePrice() {
        int price = getPrice();
        if (this.mileage > 3000) {
            int decreasePrice = this.mileage / 3000;
            for (int i = 0; i < decreasePrice; i++) {
                price -= price * 0.01;
                setPrice(price);
            }

        }
        return price;
    }

    @Override
    public String toString() {
        return "ElectricalCar:" +
                " brand = " + getBrand() +
                " price = " + getPrice() +
                " body type = " + getBodyType() +
                " fuel type = " + getFuelType() +
                " model = " + model +
                " battery = " + battery +
                " maxRange = " + maxRange +
                " mileage = " + mileage +
                " motor = " + motor +
                '.';
    }
}
