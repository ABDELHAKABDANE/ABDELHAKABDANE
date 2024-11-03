package day30_inheritance_tasks.phone_tasks;

public class Nokia extends Phone{
    public Nokia(String model, String size, double price, String color) {
        super("Nokia", model, size, price, color);
    }
}

/*
4. Create a class named 'Nokia' with these specifications:
   Attributes:
       - Same as Phone.

   Encapsulation:
       - Same conditions as Phone.

   Constructor:
       - Same as Phone.

   Actions:
       - call(phoneNumber): Display "calling the number [phoneNumber]".
       - text(phoneNumber): Display "texting to the number [phoneNumber]".
       - toString(): Prints the information of the Nokia object.
 */
