public class CarService {
    public static void main(String[] args) {
        Motors motors = new Motors("Mobil",5,true,false,"m52", 2.8);
        Cars car1 = new Cars("Mobile",5,true,false,"m52",2.8,"AUDI",2023,motors);
        car1.printCarServiceInfo();
        System.out.println(car1.printCarServiceInfo());
    }
}
