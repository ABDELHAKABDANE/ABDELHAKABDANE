package day30_inheritance_tasks.phone_tasks;

public class IPhone extends Phone{

    public IPhone(String model, String size, double price, String color) {
        super("Apple", model, size, price, color);
    }

    public void faceTime(long phoneNumber){
        System.out.println("Facetiming with the number " + phoneNumber);
    }
}

/*
2. Create a class named 'IPhone' with these specifications:
   Attributes:
       - Same as Phone.

   Encapsulation:
       - Same conditions as Phone.

   Constructor:
       - Same as Phone.

   Actions:
       - call(phoneNumber): Display "calling the number [phoneNumber]".
       - text(phoneNumber): Display "texting to the number [phoneNumber]".
       - faceTime(phoneNumber): Display "facetiming with the number [phoneNumber]".
       - toString(): Prints the information of the IPhone object.
 */