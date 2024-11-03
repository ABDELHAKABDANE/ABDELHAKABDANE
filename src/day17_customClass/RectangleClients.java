package day17_customClass;

public class RectangleClients {

    public static void main(String[] args) {

        Rectangle rectangle = new Rectangle();
        rectangle.width = 3.5;
        rectangle.length = 5.6;
        System.out.println(rectangle);

        System.out.println(rectangle.calculateArea());
        System.out.println(rectangle.calculatePerimeter());

        Rectangle rectangle2 = new Rectangle();
        rectangle2.width = 15;
        rectangle2.length = 25.2;
        System.out.println(rectangle2);

        System.out.println(rectangle2.calculateArea());
        System.out.println(rectangle2.calculatePerimeter());

    }

}
