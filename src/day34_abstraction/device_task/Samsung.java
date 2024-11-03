package day34_abstraction.device_task;

public final class Samsung extends Phone implements AndroidApps {
    public Samsung(String model, double price, String color) {
        super("Samsung", model, price, color);
    }

    @Override
    public void downloadApp() {
        System.out.println(getBrand() + " " + getModel() + " is downloading apps from " + APP_STORE_NAME);
    }
}