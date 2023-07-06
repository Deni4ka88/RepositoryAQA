package com.hillel.vehicleFactory.motor;

public class Motor {
    public double motorValue;
    public int horsePower;
    public int cylinderQuantity;

    public Motor(double motorValue, int horsePower, int cylinderQuantity) {
        this.motorValue = motorValue;
        this.horsePower = horsePower;
        this.cylinderQuantity = cylinderQuantity;
    }

    public String printMotor() {
        return String.format("Value: %f%n Power: %d%n Cylinder: %d%n", motorValue, horsePower, cylinderQuantity);
    }
}
