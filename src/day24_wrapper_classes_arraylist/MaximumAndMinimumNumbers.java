package day24_wrapper_classes_arraylist;

import java.util.ArrayList;
import java.util.Arrays;

public class MaximumAndMinimumNumbers {

    public static void main(String[] args) {

        ArrayList<Integer> nums = new ArrayList<>(Arrays.asList(1,2,3,4,5));

        int min = nums.get(0);
        int max = nums.get(0);

        for(int each : nums){
            if(each > max){
                max = each;
            }

            if(each < min){
                min = each;
            }
        }

        System.out.println("Maximum number is " + max);
        System.out.println("Minimum number is " + min);


    }

}

/*
7. Create a class called MaximumAndMinimumNumbers and write a program with the following specifications:
   7.1 Given an ArrayList of integers, find and display the maximum and minimum numbers without using any sorting.

			Example:
				list = [1,2,3,4,5];

			output:
			    Maximum number is 5
			    Minimum number is 1
 */
