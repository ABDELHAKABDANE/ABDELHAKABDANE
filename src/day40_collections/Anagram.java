package day40_collections;

import java.util.Arrays;
import java.util.Set;
import java.util.TreeSet;

public class Anagram {
    public static void main(String[] args) {

        String str1 = "abcd";
        String str2 = "ccddabaa";

        Set<String> set1 = new TreeSet<>(Arrays.asList(str1.split("")));
        Set<String> set2 = new TreeSet<>(Arrays.asList(str2.split("")));

        System.out.println(set1);
        System.out.println(set2);

        System.out.println(set1.equals(set2) ? "Anagram" : "Not Anagram");

    }
}

/*
5. Create a class named Anagram and write a program that checks if two strings are anagrams of each other, considering only the distinct characters in each string (ignoring duplicates).

         Example1:
            str1 = "abcd"
            str2 = "ccddabaa"

         Output:
            true


         Example2:
            str1 = "xyze"
            str2 = "xyzd"

         Output:
            false

 */
