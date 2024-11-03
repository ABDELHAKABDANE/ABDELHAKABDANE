package day26_custom_class_part2_tasks;

public class EmployeeClients {

    public static void main(String[] args) {

        Employee employee1 = new Employee("Anna");
        System.out.println(employee1);

        Employee employee2 = new Employee("James", 40, 'M');
        System.out.println(employee2);

        Employee employee3 = new Employee("Maria", 25, 'F', "SDET", 100_000);
        System.out.println(employee3);

        employee1.work();
        employee2.work();
        employee3.work();

    }

}