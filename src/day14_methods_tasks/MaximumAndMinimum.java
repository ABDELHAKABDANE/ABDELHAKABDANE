package day14_methods_tasks;

public class MaximumAndMinimum {

    public static void main(String[] args) {
        System.out.println(max(3, 8));
        System.out.println(max(1.2, 0.8));
        System.out.println(min(5, 10));
        System.out.println(min(8.1, 3.4));
    }

    public static int max(int n1, int n2){
        return n1 > n2 ? n1 : n2;
    }

    public static double max(double n1, double n2){
        return n1 > n2 ? n1 : n2;
    }

    public static int min(int n1, int n2){
       if(n1 < n2){
           return n1;
       } else {
           return n2;
       }
    }

    public static double min(double n1, double n2){
        if(n1 < n2){
            return n1;
        } else {
            return n2;
        }
    }

}
/*
2. Create a class named MaximumAndMinimum:

	2.1 Create a method named max that returns the maximum number between two integer numbers.

	2.2 Create a method named max that returns the maximum number between two double numbers.

	2.3 Create a method named min that returns the minimum number between two integer numbers.

	2.4 Create a method named min that returns the minimum number between two double numbers.


			Example1:
				double n = max(10.5, 30.2);

			Output:
				30.2

			Example2:
				int m = min(100, 200);

			Output:
				100

 */