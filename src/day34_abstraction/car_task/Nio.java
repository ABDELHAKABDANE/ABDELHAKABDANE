package day34_abstraction.car_task;

public class Nio extends Car implements AutoPark, AutoPilot{

    public Nio(String model, int year, double price, String color) {
        super("Nio", model, year, price, color);
    }

    @Override
    public void selfDrive() {
        System.out.println("Nio drive mode");
    }

    @Override
    public void autoPark() {
        System.out.println("Nio park mode");
    }

    @Override
    public void start() {
        System.out.println("Start in a cool way");
    }

    @Override
    public void drive() {
        System.out.println("Driving in the Nio way");
    }
}

//9. Create two Subclasses of Car ('Tesla' and 'Nio') that Implement both AutoPark and AutoPilot Interfaces.
