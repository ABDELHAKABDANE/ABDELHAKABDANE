package day15_loop_tasks;

public class FactorialNumber {

    public static void main(String[] args) {

        int num = 10;
        int factorial = 1;

        while(num > 1){
            System.out.print(num + " * ");
            factorial *= num--; // factorial = factorial * num
        }

        System.out.println();
        System.out.println(factorial);

    }

}
/*
5. Write a program that can return the factorial number of any given number.

				Example:
					  num = 5

				Output:
					  120

			(because: 5! = 5 * 4 * 3 * 2 * 1 = 120 )
 */