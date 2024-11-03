package day16_nestedLoop;

public class Triangle {

    public static void main(String[] args) {

        for(int i = 0; i < 10; i++){
            System.out.print("\t\t");
            for(int j = 0; j <= i; j++){ // this is for each star on each line
               // System.out.println(i + " " + j);
                System.out.print("* ");
            }
            System.out.println();
        }


    }

}
/*
7. Create a class named Triangle and use a nested loop to display the following shape on the console:

				*
				* *
				* * *
				* * * *
				* * * * *
				* * * * * *
				* * * * * * *
				* * * * * * * *
				* * * * * * * * *
				* * * * * * * * * *
 */