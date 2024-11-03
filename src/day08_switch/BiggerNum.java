package day08_switch;

public class BiggerNum {
    /*
    3. Create a class called BiggerNum, write a program that checks for the bigger of 3 numbers.

        you get 3 int variables with DIFFERENT values: n1 , n2 and n3

            if n1 is biggest output: "n1 is bigger"
            if n2 is biggest output: "n2 is bigger"
            if n3 is biggest output: "n3 is bigger"

         NOTE: MUST USE TERNARY
     */

    public static void main(String[] args) {

        int n1 = 51;
        int n2 = 100;
        int n3 = 90;

        // this version prints the number value
        System.out.println( (n1 > n2 && n1 > n3 ? n1 : n2 > n1 && n2 > n3 ? n2 : n3 ) + " is bigger");

        // this version prints the variable name
        System.out.println( (n1 > n2 && n1 > n3 ? "n1" : n2 > n1 && n2 > n3 ? "n2" : "n3" ) + " is bigger");

    }
}
