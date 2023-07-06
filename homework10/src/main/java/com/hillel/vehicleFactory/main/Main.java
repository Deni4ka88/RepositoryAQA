package com.hillel.vehicleFactory.main;

import com.hillel.vehicleFactory.motor.Motor;
import com.hillel.vehicleFactory.vehicle.DieselCar;
import com.hillel.vehicleFactory.vehicle.ElectricalCar;
import com.hillel.vehicleFactory.vehicle.GasolineCar;
import com.hillel.vehicleFactory.vehicle.HybridCar;

public class Main {
    public static void main(String[] args) {

       Motor motor = new Motor("Electric",480,2 );
       ElectricalCar electricalCar = new ElectricalCar("AUDI",51899, "SUV","electric","E-Tron",12000,480,0,motor);
       System.out.println(electricalCar.getPrice());
       System.out.println(electricalCar.getMotor().getMotorType());

       Motor motor1 = new Motor("Gas",4.4,340,6);
       GasolineCar gasolineCar = new GasolineCar("BMW",43999,"sedan","gas",0,motor1);
       System.out.println(gasolineCar.getMileage());

       Motor motor2 = new Motor("Diesel",3.2,430,6);
       DieselCar dieselCar = new DieselCar("VW",32199,"variant","diesel",motor2,0,6);
       System.out.println(dieselCar.getEuroStandard());

       Motor motor3 = new Motor("Gas-Hybrid",1.5,230,4,1);
       HybridCar hybridCar = new HybridCar("Toyota",48659,"sedan","hybrid",0,motor3,50,4.4);
        System.out.println(hybridCar.getMotorModel().getQuantityElectricMotors());

    }
}