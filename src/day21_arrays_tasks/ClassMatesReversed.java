package day21_arrays_tasks;

public class ClassMatesReversed {

    public static void main(String[] args) {
        String[] classmates = {"Debra Mayer", "Kenneth Schaden", "Manual Gusikowski", "Charlotte Tromp", "Lucio Stark", "Mary Bauch", "Hilda Prosacco", "Elisha Cole", "Salvatore Hermann", "Kim Cassin"};

        for(String eachName : classmates){
            String reversedName = "";
            for(int i = eachName.length() - 1; i >= 0; i--){
                reversedName += eachName.charAt(i);
            }
            System.out.println(reversedName);
        }

        for(String eachName : classmates) {
            System.out.println(reverse(eachName));
        }


    }

    public static String reverse(String str){
        String reversed = "";
        for(int i = str.length() - 1; i >= 0; i--){
            reversed += str.charAt(i);
        }
        return reversed;
    }

}

/*

6. Create a class named ClassMatesReversed and write a program with the following specifications:
   6.1 Create an array of strings named classmates.
   6.2 Store full names of 10 classmates.
   6.3 Reverse each student's name and print them on separate lines.
 */