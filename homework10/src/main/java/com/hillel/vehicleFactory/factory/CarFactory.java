package com.hillel.vehicleFactory.factory;

public abstract class CarFactory {
    private String brand;
    private int price;
    private String bodyType;
    private String fuelType;


    public CarFactory(String brand, int price, String bodyType, String fuelType) {
        setBrand(brand);
        this.price = price;
        this.bodyType = bodyType;
        this.fuelType = fuelType;
    }

    public String getBrand() {
        return brand;
    }

    public int getPrice() {
        return price;
    }

    public void setPrice(int price) {
        this.price = price;
    }

    public String getBodyType() {
        return bodyType;
    }

    public String getFuelType() {
        return fuelType;
    }

    public void setBrand(String brand) {
        if (brand != null) {
            this.brand = brand;
        } else {
            System.out.println("Brand should be added");
        }
    }

    public abstract int calculateVehiclePrice ();
}


