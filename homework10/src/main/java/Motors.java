public class Motors extends ServiceList {
    String model;
    double value;

    public Motors(String oilName, int oilValue, boolean oilFilter, boolean airFilter, String model, double value) {
        super(oilName, oilValue, oilFilter, airFilter);
        this.model = model;
        this.value = value;
    }

    public String printMotorModel (){
        return String.format("Model: %1$s; Value: %2$s%n",model,value);
    }
}
