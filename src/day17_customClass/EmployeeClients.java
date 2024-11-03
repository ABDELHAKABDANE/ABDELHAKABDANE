package day17_customClass;

public class EmployeeClients {

    public static void main(String[] args) {

        Employee employee1 = new Employee();
        employee1.name = "James Bond";
        employee1.age = 45;
        employee1.gender = 'M';
        employee1.jobTitle = "Secret Agent";
        employee1.salary = 1_000_000;

        System.out.println(employee1);
        employee1.work();

        Employee employee2 = new Employee();
        System.out.println(employee2);
        employee2.name = "Anna Smith";
        employee2.age = 27;
        employee2.gender = 'F';
        employee2.jobTitle = "CEO";
        employee2.salary = 10_000_000;
        System.out.println(employee2);

    }
}
