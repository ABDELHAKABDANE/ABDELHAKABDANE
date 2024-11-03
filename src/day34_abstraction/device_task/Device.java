package day34_abstraction.device_task;

public abstract class Device {

    public static boolean hasBattery = true;
    public static boolean hasPowerButton = true;

    private final String brand;
    private final String model;
    private double price;
    private String color;

    public Device(String brand, String model, double price, String color) {
        this.brand = brand;
        this.model = model;
        this.price = price;
        this.color = color;
    }

    public abstract void turnOn();

    public abstract void turnOff();

    public String getBrand() {
        return brand;
    }

    public String getModel() {
        return model;
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    @Override
    public String toString() {
        return "Device{" +
                "brand='" + brand + '\'' +
                ", model='" + model + '\'' +
                ", price=" + price +
                ", color='" + color + '\'' +
                '}';
    }
}

/*
1. Create an Abstract Class Named 'Device':
    - Variables:
        - final brand
        - final model
        - price
        - color
        - (static) hasBattery
        - (static) hasPowerButton
    - Encapsulate all fields.
    - Constructor: Initializes all fields.
    - Abstract Methods:
        - turnOn()
        - turnOff()
    - Non-Abstract Method:
        - toString()
 */