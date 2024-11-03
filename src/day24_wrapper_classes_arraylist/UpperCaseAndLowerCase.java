package day24_wrapper_classes_arraylist;

public class UpperCaseAndLowerCase {

    public static void main(String[] args) {
        System.out.println(upperLowerMatch("JAVA java"));
    }

    public static boolean upperLowerMatch(String str){
        int upper = 0, lower = 0;

        for(char each : str.toCharArray()){
            if(Character.isUpperCase(each)){
                upper++;
            } else if (Character.isLowerCase(each)){
                lower++;
            }
        }

        return upper == lower;
    }

}

/*
2. Create a class called UpperCaseAndLowerCase and write a program with the following specifications:
   2.1 Given a string, return true if the total number of uppercase characters is equal to the total number of lowercase characters.

	        Eamplex:
	            str = "JAVA java";

	        output:
	            true
 */