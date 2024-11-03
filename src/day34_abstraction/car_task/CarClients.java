package day34_abstraction.car_task;

public class CarClients {
    public static void main(String[] args) {

        Toyota toyota = new Toyota("Camry", 2022, 25000.0, "Silver");
        System.out.println(toyota);
        toyota.start();
        toyota.drive();
        toyota.stop();
        System.out.println("-----------------------------");

        Honda honda = new Honda("Civic", 2023, 22000.0, "Red");
        System.out.println(honda);
        honda.start();
        honda.drive();
        honda.stop();
        System.out.println("-----------------------------");

        BMW bmw = new BMW("3 Series", 2024, 40000.0, "Black");
        System.out.println(bmw);
        bmw.start();
        bmw.drive();
        bmw.stop();
        System.out.println("-----------------------------");

        Audi audi = new Audi("A4", 2023, 38000.0, "White");
        System.out.println(audi);
        audi.start();
        audi.drive();
        audi.stop();
        audi.autoPark();
        System.out.println("-----------------------------");

        Mercedes mercedes = new Mercedes("C-Class", 2022, 45000.0, "Blue");
        System.out.println(mercedes);
        mercedes.start();
        mercedes.drive();
        mercedes.stop();
        mercedes.autoPark();
        System.out.println("-----------------------------");

        Tesla tesla = new Tesla("Model 3", 2023, 50000.0, "Gray");
        System.out.println(tesla);
        tesla.start();
        tesla.drive();
        tesla.stop();
        tesla.autoPark();
        tesla.selfDrive();
        System.out.println("-----------------------------");

        Nio nio = new Nio("ES6", 2024, 55000.0, "Green");
        System.out.println(nio);
        nio.start();
        nio.drive();
        nio.stop();
        nio.autoPark();
        tesla.selfDrive();
        System.out.println("-----------------------------");

        CydeoCar cydeoCar = new CydeoCar("CT 100", 2050, 100_000.0, "Silver");
        System.out.println(cydeoCar);
        cydeoCar.start();
        cydeoCar.drive();
        cydeoCar.stop();
        cydeoCar.autoPark();
        cydeoCar.selfDrive();
        cydeoCar.fly();
        System.out.println("-----------------------------");


    }
}


/*
11. Create a Class Named 'CarClients':
    - Instantiate an object from each concrete class.
    - Test all functions of each object.
    - Analyze the relationships between the classes.
 */