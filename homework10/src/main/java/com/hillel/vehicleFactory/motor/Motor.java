package com.hillel.vehicleFactory.motor;

public class Motor {

    private String motorType;
    private double motorValue;
    private int horsePower;
    private int cylinderQuantity;

    private int quantityElectricMotors;

    public Motor(String motorType, double motorValue, int horsePower, int cylinderQuantity) {
        this.motorType = motorType;
        this.motorValue = motorValue;
        this.horsePower = horsePower;
        this.cylinderQuantity = cylinderQuantity;
    }

    public Motor(String motorType, int horsePower, int quantityElectricMotors) {
        this.motorType = motorType;
        this.horsePower = horsePower;
        this.quantityElectricMotors = quantityElectricMotors;
    }

    public Motor(String motorType, double motorValue, int horsePower, int cylinderQuantity, int quantityElectricMotors) {
        this.motorType = motorType;
        this.motorValue = motorValue;
        this.horsePower = horsePower;
        this.cylinderQuantity = cylinderQuantity;
        this.quantityElectricMotors = quantityElectricMotors;
    }

    public String getMotorType() {
        return motorType;
    }

    public double getMotorValue() {
        return motorValue;
    }

    public int getHorsePower() {
        return horsePower;
    }

    public int getCylinderQuantity() {
        return cylinderQuantity;
    }

    public int getQuantityElectricMotors() {
        return quantityElectricMotors;
    }

        //    public String printMotor() {
//        return String.format("Value: %f%n Power: %d%n Cylinder: %d%n", motorValue, horsePower, cylinderQuantity);
//    }
}
