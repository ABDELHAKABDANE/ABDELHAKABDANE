package day31_methodOverriding.employee_task;

public class Driver extends Employee {

    public Driver(String name, int age, String employeeID, double salary, String companyName) {
        super(name, age, employeeID, "Driver", salary, companyName);
    }

    @Override
    public void work() {
        System.out.println(getName() + " is driving");
    }
}

/*

3. Create the following subclasses of Employee:
   2.4 Driver:
       - work(): Displays "[name] is driving".
 */