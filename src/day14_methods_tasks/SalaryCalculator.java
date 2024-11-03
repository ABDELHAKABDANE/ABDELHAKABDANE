package day14_methods_tasks;

public class SalaryCalculator {

    public static void main(String[] args) {
        System.out.println(salary(45, 40));
    }

    public static double salary(double hourlyRate, int weeklyHours){
        return hourlyRate * weeklyHours * 52;
    }

}
/*
4. Create a class named SalaryCalculator and create a method named salary that takes hourly rate (double)
and weekly hours (int) and returns the salary.

			Example:
				double income = salary(45, 40);

			Output:
				93600.0
 */