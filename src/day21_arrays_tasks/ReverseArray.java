package day21_arrays_tasks;

import java.util.Arrays;

public class ReverseArray {

    public static void main(String[] args) {

        int[] nums = {1,2,3,4,5};
        int[] reversed = new int[nums.length];

        for(int i = 0, j = nums.length - 1; i < nums.length; i++, j--){
            reversed[i] = nums[j];
        }
        // i is for index -> from the beginning
        // j is for value -> from the end

        System.out.println(Arrays.toString(reversed));

        int[] reversed2 = new int[nums.length];

        for(int i = 0; i < nums.length; i++){
            reversed2[i] = nums[nums.length - 1 - i];
        }

        System.out.println(Arrays.toString(reversed2));

    }

}

/*
8. Create a class named ReverseArray and write a program to reverse an array of integers and return it as a new one.

			Example:
				array = {1,2,3,4,5};

			Output:
				reversedArray = {5,4,3,2,1};
 */