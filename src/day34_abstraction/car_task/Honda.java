package day34_abstraction.car_task;

public class Honda extends Car{

    public Honda(String model, int year, double price, String color) {
        super("Honda", model, year, price, color);
    }

    @Override
    public void start() {
        System.out.println("Starting quickly");
    }

    @Override
    public void drive() {
        System.out.println("Driving okay");
    }
}

//6. Create a Subclass of Car Named 'Honda'.

