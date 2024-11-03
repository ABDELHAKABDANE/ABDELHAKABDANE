package day34_abstraction.device_task;

public final class Iphone extends Phone implements AppleApps {

    public Iphone(String model, double price, String color) {
        super("iPhone", model, price, color);
    }

    @Override
    public void downloadApp() {
        System.out.println(getBrand() + " " + getModel() + " is downloading apps from " + APP_STORE_NAME);
    }
}