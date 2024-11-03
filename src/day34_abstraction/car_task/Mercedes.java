package day34_abstraction.car_task;

public class Mercedes extends Car implements AutoPark{

    public Mercedes(String model, int year, double price, String color) {
        super("Mercedes", model, year, price, color);
    }

    @Override
    public void autoPark() {
        System.out.println("Auto park enabled");
    }

    @Override
    public void start() {
        System.out.println("Start with button");
    }

    @Override
    public void drive() {
        System.out.println("Drive very smooth");
    }
}

//8. Create two Subclasses of Car ('Audi' and 'Mercedes') that Implement the AutoPark Interface.
