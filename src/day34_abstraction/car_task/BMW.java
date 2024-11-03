package day34_abstraction.car_task;

public class BMW extends Car{

    public BMW(String model, int year, double price, String color) {
        super("BMW", model, year, price, color);
    }

    @Override
    public void start() {
        System.out.println("Starting loudly");
    }

    @Override
    public void drive() {
        System.out.println("Driving loudly");
    }
}

//7. Create a Subclass of Car Named 'BMW'.