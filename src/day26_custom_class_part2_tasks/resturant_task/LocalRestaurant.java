package day26_custom_class_part2_tasks.resturant_task;

public class LocalRestaurant {

    public static void main(String[] args) {
        Server[] servers = {
                new Server("Yasin", 29, 15, false),
                new Server("Sabryne", 28, 10, false),
                new Server("Karim", 27, 12, false),
                new Server("Aysel", 26, 20, true),
                new Server("Kamal", 25, 23, true),
        };

        Chef[] chefs = {
                new Chef("Halim", 23, 35, true),
                new Chef("Habib", 22, 26, false),
                new Chef("Bojan", 21, 27, true),
        };


        Restaurant restaurant = new Restaurant("Mahdi", "McLean", 4);

        restaurant.hireServer(servers);
        restaurant.hireChef(chefs);

        System.out.println(restaurant);

        System.out.println(restaurant.servers);

        restaurant.hireServer(new Server("Mona", 30, 20, true));
        System.out.println(restaurant.servers);

        restaurant.terminateChef(22);

        System.out.println(restaurant.chefs);

        System.out.println(restaurant);
    }

}


/*
Create a class named LocalRestaurant with a main method:
	Create a Restaurant object
	Create an array of servers and chefs with their information set
	Add the initial servers and chefs to the respective ArrayLists in the Restaurant object
	Print the whole restaurant's information
 */