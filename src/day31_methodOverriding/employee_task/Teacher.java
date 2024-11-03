package day31_methodOverriding.employee_task;

public class Teacher extends Employee {

    public Teacher(String name, int age, String employeeID, double salary, String companyName) {
        super(name, age, employeeID, "Teacher", salary, companyName);
    }

    @Override
    public void work() {
        System.out.println(getName() + " is teaching");
    }
}
/*
3. Create the following subclasses of Employee:
   2.3 Teacher:
       - work(): Displays "[name] is teaching".
 */