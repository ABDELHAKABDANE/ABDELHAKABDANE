package day34_abstraction.device_task;

public class DeviceShop {
    public static void main(String[] args) {

        Iphone iphone = new Iphone("X", 999.99, "Gold");
        System.out.println(iphone);
        iphone.turnOn();
        iphone.turnOff();
        iphone.downloadApp();
        iphone.call(9919244414L);

        System.out.println("-----------------------");

        Samsung samsung = new Samsung("S20", 1050, "Black");
        System.out.println(samsung);
        samsung.turnOn();
        samsung.turnOff();
        samsung.downloadApp();
        samsung.call(9919244414L);

        System.out.println("-----------------------");

        Google google = new Google("Pixel 10", 850, "Silver");
        System.out.println(google);
        google.turnOn();
        google.turnOff();
        google.downloadApp();
        google.call(9919244414L);

        System.out.println("-----------------------");

        Desktop desktop = new Desktop("HP", "230 Series", 1300, "Black");
        System.out.println(desktop);
        desktop.turnOn();
        desktop.turnOff();

        System.out.println("-----------------------");

        Laptop laptop = new Laptop("Windows", "Surface", 1700, "Silver");
        System.out.println(laptop);
        laptop.turnOn();
        laptop.turnOff();


    }
}
