
import java.util.Scanner;

/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
/**
 *
 * @author tatad6701
 */
public class A7Q2 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // Create new scanner
        Scanner input = new Scanner(System.in);
        double total = 0;
        // Ask the user the number of the students in the class
        System.out.println("How many students are there in the class?");
        // Save the user's input to variable 'studentNum'
        int studentNum = input.nextInt();
        // Create new array, involving student heights
        int[] heights = new int[studentNum];
        // Ask the user to enter the student heights
        System.out.println("Enter the student heights in centimeters.");
        // For loop to go through array
        for (int i = 0; i < heights.length; i++) {
            heights[i] = input.nextInt();
            total = total + heights[i];
        }

        // Calculate the total average height of the entire class
        double avg = Math.round((total / heights.length) * 100) / 100;
        // Output the class height average
        System.out.println("The class height avarage is: " + avg + "cm.");

        // Output to the users which students are above the class height average
        System.out.println("The following number(s) are the students who are above the class height average.");
        // Find which height is above average by using for loop to go through the entire array
        for (int i = 0; i < heights.length; i++) {
            if (heights[i] > avg) {
                // Print the numbers which are above average
                System.out.println(heights[i]);
            }
        }
    }
}
