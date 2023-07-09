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

    @Override
    public int calculateVehiclePrice() {
        int price = getPrice();
        if (getMileage() > 3000) {
            int decreasePrice = getMileage() / 3000;
            for (int i = 0; i < decreasePrice; i++) {
                price -= price * 0.02;
                setPrice(price);
            }

        }
        return price;
    }

    @Override
    public String toString() {
        return "HybridCar:" +
                " brand = " + getBrand() +
                " price = " + getPrice() +
                " body type = " + getBodyType() +
                " fuel type = " + getFuelType() +
                " electric range = " + electricRange +
                " fuel efficiency = " + fuelEfficiency +
                '.';
    }
}
