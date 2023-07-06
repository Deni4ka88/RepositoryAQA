package com.hillel.vehicleFactory.factory;

public abstract class CarFactory {
    private String brand;
    private String bodyType;
    private String fuelType;


    public CarFactory(String brand, String bodyType, String fuelType) {
        setBrand(brand);
        this.bodyType = bodyType;
        this.fuelType = fuelType;
    }

    public String getFuelType() {
        return fuelType;
    }

    public String getBrand() {
        return brand;
    }

    public String getBodyType() {
        return bodyType;
    }

    public void setBrand(String brand) {
        if (brand != null) {
            this.brand = brand;
        } else {
            System.out.println("Brand should be added");
        }
    }
}
