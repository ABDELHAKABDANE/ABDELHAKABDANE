package day26_custom_class_part2_tasks;

public class Pizza {

    public String size;
    public int numberOfCheeseTopping;
    public int numberOfPepperoniTopping;

    public Pizza(String size, int numberOfCheeseTopping, int numberOfPepperoniTopping) {
        this.size = size;
        this.numberOfCheeseTopping = numberOfCheeseTopping;
        this.numberOfPepperoniTopping = numberOfPepperoniTopping;
    }

    public int calcCost() {
        int baseValue = switch (size) {
            case "Small" -> 10;
            case "Medium" -> 12;
            case "Large" -> 14;
            default -> 0;
        };

        return baseValue + 2 * (numberOfCheeseTopping + numberOfPepperoniTopping);
    }

    public String toString(){
        return "Your " + size + " pizza with " + numberOfCheeseTopping + " cheese toppings and " + numberOfPepperoniTopping + " pepperoni toppings costs a total of $" + calcCost();
    }

}

/*
1. Create a custom class named Pizza with the following specifications:

    Attributes:
		   size
		   numberOfCheeseTopping
		   numberOfPepperoniTopping

	Actions:
		calcCost(): returns the totalCost of the pizza
		toString(): returns a String containing the pizza size, quantity of each topping, and the pizza cost as calculated by calcCost()

   Pizza cost is determined by:
   		Small: $10 + $2 per topping
   		Medium: $12 + $2 per topping
   		Large: $14 + $2 per topping

    Create another class named PizzaClients, create multiple pizza objects, and test each function of the pizza object.
 */