package day31_methodOverriding.employee_task;

public class EmployeeClients {
    public static void main(String[] args) {

        Tester tester = new Tester("James Bond", 40, "M157", 1_000_000, "MI6");
        System.out.println(tester);
        tester.work();

        Developer developer = new Developer("Mehmet", 20, "I80", 200_000, "Meta", "Java");
        System.out.println(developer);
        developer.work();

        Teacher teacher = new Teacher("Anna", 25, "24", 80_000, "Elementary");
        System.out.println(teacher);
        teacher.work();

        Driver driver = new Driver("Kelly", 27, "L0324", 85_000, "Quick Rides");
        System.out.println(driver);
        driver.work();

    }
}
