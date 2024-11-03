package day28_encapsulation_tasks;

public class ItemClients {
    public static void main(String[] args) {

        Item book = new Item("Book", 4.99, 3);
        System.out.println(book);

        Item pen = new Item(null, -9, -1);
        System.out.println(pen);

    }
}
