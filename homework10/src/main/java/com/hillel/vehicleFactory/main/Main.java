package com.hillel.vehicleFactory.main;

import com.hillel.vehicleFactory.motor.Motor;
import com.hillel.vehicleFactory.vehicle.DieselCar;
import com.hillel.vehicleFactory.vehicle.ElectricalCar;
import com.hillel.vehicleFactory.vehicle.GasolineCar;
import com.hillel.vehicleFactory.vehicle.HybridCar;

public class Main {
    public static void main(String[] args) {
        ElectricalCar electricalCar = new ElectricalCar("AUDI", "SUV", "electric", "E-TRON", 12000, 600);
        electricalCar.printElectricCar();

        Motor motor = new Motor(3, 320, 6);
        DieselCar dieselCar = new DieselCar("AUDI", "sedan", "diesel", motor, 6);
        dieselCar.printDieselVehicle();

        Motor motor1 = new Motor(5, 750, 8);
        GasolineCar gasolineCar = new GasolineCar(null, "cope", "gas", true, motor1);
        gasolineCar.printGasoline();

        HybridCar hybridCar = new HybridCar("Toyota", "sedan", "hybrid", true, motor1, 130, 4.5);
        hybridCar.printHybrid();
    }
}