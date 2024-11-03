package day21_arrays_tasks;

import java.util.Arrays;

public class MoveTheZeros {

    public static void main(String[] args) {

        int[] nums = {10, 0, 5, 0, 1, 0};
        int[] moved = new int[nums.length]; // [10, 5, 1, 0, 0, 0]

        // i is to read from nums, y is to store to moved
        for(int i = 0, y = 0; i < nums.length; i++){
            if(nums[i] != 0){
                moved[y++] = nums[i];
            }
        }

        System.out.println(Arrays.toString(moved));


    }

}

/*
9. Create a class named MoveTheZeros and write a program that can move all the zeros to the end of the array.

			Example:
				array = {10, 0, 5, 0, 1, 0};

			Output:
				{10, 5, 1, 0, 0, 0};
 */