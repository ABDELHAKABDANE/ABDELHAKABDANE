package day34_abstraction.car_task;

public class Tesla extends Car implements AutoPark, AutoPilot{

    public Tesla(String model, int year, double price, String color) {
        super("Tesla", model, year, price, color);
    }

    @Override
    public void selfDrive() {
        System.out.println("Driving while you sleep");
    }

    @Override
    public void autoPark() {
        System.out.println("Parking on its own");
    }

    @Override
    public void start() {
        System.out.println("Start with face");
    }

    @Override
    public void drive() {
        System.out.println("Drive quietly");
    }
}

//9. Create two Subclasses of Car ('Tesla' and 'Nio') that Implement both AutoPark and AutoPilot Interfaces.