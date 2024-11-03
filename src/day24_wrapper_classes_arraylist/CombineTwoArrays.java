package day24_wrapper_classes_arraylist;

import java.util.ArrayList;
import java.util.Arrays;

public class CombineTwoArrays {

    public static void main(String[] args) {
        String[] arr1 = {"A", "B", "C", "Z"};
        String[] arr2 = {"D", "E", "F", "G", "Y"}; // i = 5 - 3 = 2
        ArrayList<String> combined = new ArrayList<>();
        combined.addAll(Arrays.asList(arr1));
        combined.addAll(Arrays.asList(arr2));

        System.out.println(combined);

        // option 2

        ArrayList<String> combined2 = new ArrayList<>();

        int totalLen = arr1.length + arr2.length; // total iteration

        for(int i = 0; i < totalLen; i++){
            if(i < arr1.length){
                combined2.add(arr1[i]);
            } else {
                combined2.add(arr2[i - arr1.length]);
            }
        }

        System.out.println(combined2);


    }

}

/*
4. Create a class called CombineTwoArrays and write a program with the following specifications:
   4.1 Given two String arrays, combine them into one ArrayList.

                Example:
                    arr1 = {"A", "B", "C"};
                    arr2 = {"D", "E", "F", "G"};

                Output:
                    list ==> {"A", "B", "C", "D", "E", "F", "G"}
 */