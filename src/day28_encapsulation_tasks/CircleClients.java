package day28_encapsulation_tasks;

public class CircleClients {
    public static void main(String[] args) {

        Circle circle = new Circle(3.6);
        System.out.println(circle);

        circle.setRadius(-3.1);
        System.out.println(circle);

        circle.setRadius(8.9);
        System.out.println(circle);

        Circle circle2 = new Circle(-8);
        System.out.println(circle2);

    }
}
