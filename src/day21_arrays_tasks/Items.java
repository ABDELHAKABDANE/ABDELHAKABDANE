package day21_arrays_tasks;

public class Items {

    public static void main(String[] args) {
        String[] items = {"Shoes", "Jacket", "Gloves", "AirPods", "iPad", "iPhone 12 case"};
        double[] prices = {99.99, 150.0, 9.99, 250.0, 439.50, 39.99};
        int[] itemIDs = {12345, 12346, 12347, 12348, 12349, 12350};

        int indexOfGlove = -1;
        for(int i = 0; i < items.length; i++){
            if(items[i].equalsIgnoreCase("gloves")){
                indexOfGlove = i;
                break;
            }
        }

        System.out.println(indexOfGlove);

        System.out.println("----------------");

        boolean containsIpad = false;
        for(String each : items){
            if(each.equalsIgnoreCase("ipad")){
                containsIpad = true;
                break;
            }
        }

        System.out.println(containsIpad);

        System.out.println("----------------");

        for(int i = 0; i < items.length; i++){
            System.out.println(items[i] + " - " + prices[i] + " - #" + itemIDs[i]);
        }

    }

}

/*
5. Create a class named Items and write a program with the following specifications:
	5.1 Given arrays with the same length:
		String[] items  = {"Shoes", "Jacket",  "Gloves", "AirPods", "iPad", "iPhone 12 case" };
		double[] prices = {99.99,      150.0,  9.99,     250.0 ,    439.50,  39.99};
		int[] itemIDs =   {12345 ,     12346,  12347,    12348,     12349,    12350};

   5.2 Find the first index number of "Gloves".
   5.3 Check if "iPad" is contained in the item list.
   5.4 Print the report for each shopping item in the format:
   				name - price - #ID

 */