package day30_inheritance_tasks.phone_tasks;

public class PhoneClients {

    public static void main(String[] args) {

        IPhone iphone = new IPhone("IPhone X", "16'", 1000, "Gold");
        System.out.println(iphone);
        iphone.faceTime(2414124144L);
        iphone.call(2414124144L);
        iphone.text(2414124144L);
        iphone.setPrice(950);
        System.out.println(iphone);

        Samsung samsung = new Samsung("Note", "15'", 1000, "Black");
        System.out.println(samsung);

        Nokia nokia = new Nokia( "V10", "17'", 800, "Silver");
        System.out.println(nokia);

    }

}

/*
5. Create a class named "PhoneClients":
   - Create multiple objects representing different phones.
   - Test the methods and variables of each object.
 */