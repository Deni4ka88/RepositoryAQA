package com.hillel.vehicleFactory;

public class ElectricalCar extends CarFactory {

    String model;
    int battery;
    int maxRange;

    public ElectricalCar(String brand, String bodyType, String fuelType, String model, int battery, int maxRange) {
        super(brand, bodyType, fuelType);
        this.model = model;
        this.battery = battery;
        this.maxRange = maxRange;
    }

    public void printElectricCar (){
        System.out.printf("Brand: %1s%n Body: %2s%n Fuel: %3s%n Model: %4s%n Battery: %5d%n Range: %6d%n",brand,bodyType,fuelType,model,battery,maxRange);
    }
}
