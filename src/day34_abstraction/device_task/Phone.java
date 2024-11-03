package day34_abstraction.device_task;

public abstract class Phone extends Device {

    public Phone(String brand, String model, double price, String color) {
        super(brand, model, price, color);
    }

    @Override
    public void turnOn() {
        System.out.println("Press the power-button to turn on the phone " + getBrand() + " " + getModel());
    }

    @Override
    public void turnOff() {
        System.out.println("Press the power-button to turn off the phone " + getBrand() + " " + getModel());
    }

    public void call(long phoneNumber) {
        System.out.println(getBrand() + " " + getModel() + " is calling " + phoneNumber);
    }

    public void text(long phoneNumber) {
        System.out.println(getBrand() + " " + getModel() + " is texting to " + phoneNumber);
    }

}

/*
2. Create a Child Abstract Class of Device Named 'Phone':
    - Extra Non-Abstract Methods:
        - call(long phoneNum)
        - text(long phoneNum)
        - toString()
 */