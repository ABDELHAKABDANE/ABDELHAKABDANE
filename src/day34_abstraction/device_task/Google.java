package day34_abstraction.device_task;

public final class Google extends Phone implements AndroidApps{

    public Google(String model, double price, String color) {
        super("Google", model, price, color);
    }

    @Override
    public void downloadApp() {
        System.out.println(getBrand()+" "+getModel()+" is downloading apps from "+ APP_STORE_NAME);
    }

}
