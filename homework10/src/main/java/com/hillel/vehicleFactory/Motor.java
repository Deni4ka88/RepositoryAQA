package com.hillel.vehicleFactory;

public class Motor {
    double motorValue;
    int horsePower;
    int cylinderQuantity;

    public Motor(double motorValue, int horsePower, int cylinderQuantity) {
        this.motorValue = motorValue;
        this.horsePower = horsePower;
        this.cylinderQuantity = cylinderQuantity;
    }

    public String printMotor(){
        return String.format("Value: %1f%n Power: %2d%n Cylinder: %3d%n",motorValue,horsePower,cylinderQuantity);
    }
}
