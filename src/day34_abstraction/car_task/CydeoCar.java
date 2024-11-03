package day34_abstraction.car_task;

public class CydeoCar extends Car implements AutoPark, AutoPilot, Flyable{

    public CydeoCar(String model, int year, double price, String color) {
        super("CydeoCar", model, year, price, color);
    }

    @Override
    public void fly() {
        System.out.println("In Fly mode");
    }

    @Override
    public void selfDrive() {
        System.out.println("Drive by AI");
    }

    @Override
    public void autoPark() {
        System.out.println("Park in the sky");
    }

    @Override
    public void start() {
        System.out.println("Start by thinking");
    }

    @Override
    public void drive() {
        System.out.println("Start self drive");
    }
}

//10. Create a Subclass of Car Named 'CydeoCar' that Implements AutoPark, AutoPilot, and Flyable Interfaces.
