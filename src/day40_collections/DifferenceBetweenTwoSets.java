package day40_collections;


import java.util.Arrays;
import java.util.LinkedHashSet;
import java.util.Set;

public class DifferenceBetweenTwoSets {
    public static void main(String[] args) {

        Set<Integer> nums1 = new LinkedHashSet<>(Arrays.asList(1, 2, 3, 5));
        Set<Integer> nums2 = new LinkedHashSet<>(Arrays.asList(2, 3, 4));

        Set<Integer> difference = new LinkedHashSet<>();
        difference.addAll(nums1); //1, 2, 3, 5
        difference.removeAll(nums2);

        System.out.println(difference);

        // approach 2

        Set<Integer> difference2 = new LinkedHashSet<>(); // 1, 5
        for(int each : nums1){
            if(!nums2.contains(each)){
                difference2.add(each);
            }
        }

        System.out.println(difference2);

    }
}

/*
4. Create a class named DifferenceBetweenTwoSets and write a program that calculates the difference between two sets of integers (elements in the first set but not in the second) and displays the result.

         Example:
            Set1 = {1, 2, 3, 5}
            Set2 = {2, 3, 4}

         Output:
            {1, 5}
 */
