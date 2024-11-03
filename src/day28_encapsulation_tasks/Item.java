package day28_encapsulation_tasks;

public class Item {

    private String name;
    private double unitPrice;
    private int quantity;

    public Item(String name, double unitPrice, int quantity) {
        setName(name);
        setUnitPrice(unitPrice);
        setQuantity(quantity);
    }

    public double calculateCost(){
        return unitPrice * quantity;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        if(name != null && !name.isBlank() && isValidName(name) && Character.isLetter(name.charAt(0))){
            this.name = name;
        }
    }

    private boolean isValidName(String str){
        str = str.replace(" ", "");
        for(int i = 0; i < str.length(); i++){
            if(!Character.isLetterOrDigit(str.charAt(i))){
                return false;
            }
        }
        return true;
    }

    public double getUnitPrice() {
        return unitPrice;
    }

    public void setUnitPrice(double unitPrice) {
        if(unitPrice > 0){
            this.unitPrice = unitPrice;
        }
    }

    public int getQuantity() {
        return quantity;
    }

    public void setQuantity(int quantity) {
        if(quantity > 0){
            this.quantity = quantity;
        }
    }

    @Override
    public String toString() {
        return "Item{" +
                "name='" + name + '\'' +
                ", unitPrice=" + unitPrice +
                ", quantity=" + quantity +
                ", total cost=" + calculateCost() +
                '}';
    }
}

/*
3. Create a custom class named Item with the following specifications:

	Attributes:
		name
		unitPrice
		quantity

	Ensure encapsulation for all fields.
		Conditions:
			The name cannot be empty or blank.
			The name cannot contain any special characters other than space.
			The name must start with letters.
			The unitPrice cannot be negative.
			The quantity cannot be negative.

	Add a constructor that enables the user to set all fields during object creation.

	Actions:
		calcCost(): Returns the total cost.
		toString(): Displays the name, unit price, quantity, and total cost calculated by calcCost() when the object is printed.

	Create another class named ItemClients, create multiple item objects, and test each function of the item object.
 */