package day21_arrays_tasks;

public class ArrayElements {
    public static void main(String[] args) {

        // 1.1 Create an array of integers with a length of 100.
        int[] nums = new int[100];

        //  1.2 Assign values from 1 to 100 to the indexes of the array.
        for(int i = 1; i <= 100; i++){
            nums[i - 1] = i;
        }

        //nums[i - 1] -> converts the i which is the number to an index

        // 1.3 Display the array elements in a single line separated by spaces.
        for(int i = 0; i < nums.length; i++){
            System.out.print(nums[i] + " ");
        }

        System.out.println();
        // 1.4 Display the array elements in a single line in reversed order, separated by spaces.
        for(int i = nums.length - 1; i >= 0; i--){
            System.out.print(nums[i] + " ");
        }

        System.out.println();
        //1.5 Display all evenly divisible elements by 5 in a single line separated by spaces.

        for(int i = 0; i < nums.length; i++){
            if(nums[i] % 5 == 0){
                System.out.print(nums[i] + " ");
            }
        }

    }
}


/*
1. Create a class named ArrayElements and write a program with the following specifications:
   1.1 Create an array of integers with a length of 100.
   1.2 Assign values from 1 to 100 to the indexes of the array.
   1.3 Display the array elements in a single line separated by spaces.
   1.4 Display the array elements in a single line in reversed order, separated by spaces.
   1.5 Display all evenly divisible elements by 5 in a single line separated by spaces.
 */