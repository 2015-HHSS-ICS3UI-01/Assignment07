
import java.util.Scanner;

/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
/**
 *
 * @author kulla6503
 */
public class A7Q6 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // create a scanner
        Scanner in = new Scanner(System.in);

        // Output our sentence to the user letting them know what they entered
        System.out.println("How many students are in the class? ");
        int i = in.nextInt();

        // to make an array of int
        int[] aryNums = new int[i];

        // variable used to add all the grades consistently  
        double last = 0;
        System.out.println("Enter the following Marks for each student: ");

        // adding up all the numbers in the array 
        for (int students = 0; students < i; students++) {
            int mark = in.nextInt();
            aryNums[students] = mark;

            // formula used to add all the grades used 
            last = mark + last;

            // After marks are added u then the average is found 
            if (students == (i - 1)) {
                // Calculates the average 
                double result = ((last) / i);

                // Used to round the final number 
                result = Math.round(result * 100) / 100.0;

                // Output our sentence to the user letting them know what they entered
                System.out.println("The Average Mark is: " + result + "%");
            }
        }
        //assign first element of an array to largest and smallest
        int smallest = aryNums[0];
        int largest = aryNums[0];

        // Figuring out the greatest and least number
        for (i = 1; i < aryNums.length; i++) {
            if (aryNums[i] > largest) {
                largest = aryNums[i];
            } else if (aryNums[i] < smallest) {
                smallest = aryNums[i];
            }

        }
        // Output 
        System.out.println("The Lowest Mark is : " + smallest + "%");
        System.out.println("The Highest Mark is : " + largest + "%");

    }
}
