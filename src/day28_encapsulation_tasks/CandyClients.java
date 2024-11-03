package day28_encapsulation_tasks;

public class CandyClients {
    public static void main(String[] args) {

        Candy twix = new Candy("Twix", 5, 2.99, true);
        System.out.println(twix);

        Candy hershey = new Candy("Hershey", 10, 0, false);
        System.out.println(hershey);

        hershey.setQuantity(20);

        System.out.println(hershey);

    }
}