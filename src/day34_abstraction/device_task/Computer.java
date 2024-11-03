package day34_abstraction.device_task;

public abstract class Computer extends Device {

    public Computer(String brand, String model, double price, String color) {
        super(brand, model, price, color);
    }

    @Override
    public void turnOn() {
        System.out.println("Press the power-button to turn on the computer " + getBrand() + " " + getModel());
    }

    @Override
    public void turnOff() {
        System.out.println("Press the power-button to turn off the computer " + getBrand() + " " + getModel());
    }

}

/*
3. Create a Child Abstract Class of Device Named 'Computer':
    - Add extra methods as needed.
 */