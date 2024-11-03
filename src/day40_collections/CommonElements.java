package day40_collections;

import java.util.Arrays;
import java.util.HashSet;
import java.util.Set;
import java.util.TreeSet;

public class CommonElements {
    public static void main(String[] args) {

        Set<Integer> nums1 = new HashSet<>(Arrays.asList(10, 8, 11, 20, 5, 0));
        Set<Integer> nums2 = new HashSet<>(Arrays.asList(30, 0, 20, 40, 50, 10, 60));
        Set<Integer> common = new TreeSet<>();

        for(int each : nums1){
            if(nums2.contains(each)){
                common.add(each);
            }
        }

        System.out.println(common);

    }
}

/*
3. Create a class named CommonElements and write a program that identifies the common elements in two given sets of integers and returns a third set containing these common elements.

         Example:
            set1 = {10, 8, 11, 20, 5, 0}
            set2 = {30, 0, 20, 40, 50, 10, 60}

         Output:
            set3 = {0, 10, 20}
 */
