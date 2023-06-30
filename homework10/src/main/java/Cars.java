public class Cars extends Motors {
    String carBrand;
    int year;
    Motors motor;


    public Cars(String oilName, int oilValue, boolean oilFilter, boolean airFilter, String model, double value, String carBrand, int year, Motors motor) {
        super(oilName, oilValue, oilFilter, airFilter, model, value);
        this.carBrand = carBrand;
        this.year = year;
        this.motor = motor;
    }

    public String printCarServiceInfo(){
        return String.format("Brand: %1$s%nYear: %2$s%nMotor: %3$s%n",carBrand,year,motor.printMotorModel());
    }
}


