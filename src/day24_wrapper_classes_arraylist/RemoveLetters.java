package day24_wrapper_classes_arraylist;


import java.util.ArrayList;
import java.util.Arrays;

public class RemoveLetters {

    public static void main(String[] args) {

        ArrayList<Character> chars = new ArrayList<>(Arrays.asList('$', 'A', 'B', 'z', 'Y', '1', '2', 'c', 'd', '@', '!', '3', '4', '*'));

        chars.removeIf(p -> Character.isLetter(p));

        System.out.println(chars);


    }

}

/*
10. Create a class called RemoveLetters and write a program with the following steps:
    10.1 Given an ArrayList of characters, remove all the letters.

			Example:
				list = {'$', 'A', 'B', '1', '2', 'c', 'd', '@', '!', '3', '4'}

			output:
				['$',  '1', '2', '@', '!', '3', '4']
 */