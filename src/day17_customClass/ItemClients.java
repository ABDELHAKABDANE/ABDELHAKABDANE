package day17_customClass;

public class ItemClients {

    public static void main(String[] args) {

        Item pen = new Item();
        pen.name = "Pen";
        pen.unitPrice = 1.99;
        pen.quantity = 5;
        System.out.println(pen);

        Item notebook = new Item();
        notebook.name = "Notebook";
        notebook.unitPrice = 2.55;
        notebook.quantity = 3;
        System.out.println(notebook);

        System.out.println(notebook.calcCost());


    }

}
