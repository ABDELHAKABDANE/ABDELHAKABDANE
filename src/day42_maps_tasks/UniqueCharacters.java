package day42_maps_tasks;

import java.util.LinkedHashMap;
import java.util.Map;

public class UniqueCharacters {
    public static void main(String[] args) {

        String str = "aabcccdeeeefzzzzyuum";
        Map<Character, Integer> map = new LinkedHashMap<>();
        String checked = "";

        /*
        map =
           b = 1
           c = 1

           checked = abc
         */

        for(int i = 0; i < str.length(); i++){
            char key = str.charAt(i);
            if(!checked.contains("" + key) && !map.containsKey(key)){
                map.put(key, 1);
                checked += key;
            } else {
                map.remove(key);
            }
        }

        System.out.println(map);

    }
}

/*
5. Create a class named UniqueCharacters and write a program that returns the unique characters from a given
string as a map, with each character's frequency as the value. This should be done without using nested loops.

         Example:
               string = "aabcccdeeeef"

         Output:
               {b=1, d=1, f=1}
 */
