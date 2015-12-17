
import java.util.Scanner;

/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
/**
 *
 * @author kulla6503
 */
public class A7Q2 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // create a scanner
        Scanner in = new Scanner(System.in);

        // Output our sentence to the user letting them know what they entered
        System.out.println("How many people are there? ");
        int i = in.nextInt();

        // to make an array of int
        int[] aryNums = new int[i];

        // variable used to add all the heights consistently  
        double last = 0;
        System.out.println("Enter the heights of these people(feet): ");

        // adding up all the numbers in the array 
        for (int people = 0; people < i; people++) {
            int height = in.nextInt();
            aryNums[people] = height;

            // formula used to add all the heights of the people
            last = height + last;

            // After marks are added, then the average is found 
            if (people == (i - 1)) {
                // Calculates the average 
                double result = ((last) / i);

                // Used to round the final number 
                result = Math.round(result * 100) / 100.0;

                // Output our sentence to the user letting them know what they entered
                System.out.println("The Average Height is: " + result + " Feet");

                // Used to figure out and state the heights in accending order. 
                for (height = people; height > 0; height--) {

                    // If the height is above avergae than it is listed below
                    if (result < aryNums[height]) {
                        System.out.println("The Heights that are above average are: " + aryNums[height]);
                    } 

                }



            }



        }

    }
}
