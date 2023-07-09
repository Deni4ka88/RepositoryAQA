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
        setEuroStandard(euroStandard);
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
        if (euroStandard <= 5) {
            System.out.println("You should passing emission control every 10000 km");
        }
        this.euroStandard = euroStandard;
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
        return "DieselCar:" +
                " brand = " + getBrand() +
                " price = " + getPrice() +
                " body type = " + getBodyType() +
                " fuel type = " + getFuelType() +
                " motor = " + motor +
                " mileage = " + mileage +
                " euroSstandard = " + euroStandard +
                '.';
    }
}