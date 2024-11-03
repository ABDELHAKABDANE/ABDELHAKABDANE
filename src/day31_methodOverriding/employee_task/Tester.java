package day31_methodOverriding.employee_task;

public class Tester extends Employee{
    public Tester(String name, int age, String employeeID, double salary, String companyName) {
        super(name, age, employeeID, "Tester", salary, companyName);
    }

    @Override
    public void work() {
        super.work();
        System.out.println(" is testing");
    }
}

/*
3. Create the following subclasses of Employee:
   2.1 Tester:
       - work(): Displays "[jobTitle] [name] is testing".
 */