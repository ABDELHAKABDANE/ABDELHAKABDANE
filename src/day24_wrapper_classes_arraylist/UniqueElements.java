package day24_wrapper_classes_arraylist;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;

public class UniqueElements {

    public static void main(String[] args) {

        ArrayList<Integer> nums = new ArrayList<>(Arrays.asList(1, 1, 2, 3, 3, 4, 5, 5, 9, 9, 9, 10));
        nums.removeIf(p -> Collections.frequency(nums, p) > 1);

        System.out.println(nums);

    }

}

/*
9. Create a class called UniqueElements and write a program with the following specifications:
   9.1 Given an ArrayList, display the unique elements without using any loops.

			Example:
				list = [1, 1, 2, 3, 3, 4, 5, 5]

			output:
				[2, 4]

 */