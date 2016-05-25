
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
        // Ask the user the number of the people in the group
        System.out.println("How many people are there in the group?");
        // Save the user's input to variable 'peopleNum'
        int peopleNum = input.nextInt();
        // Create new array involving the heights of the members within the group
        int[] heights = new int[peopleNum];
        // Ask the user to enter the heights of all the members in centimeters
        System.out.println("Enter the heights of all members in centimeters.");
        // For loop to go through array
        for (int i = 0; i < heights.length; i++) {
            heights[i] = input.nextInt();
            total = total + heights[i];
        }

        // Calculate the total average height 
        double avg = Math.round((total / heights.length) * 100) / 100;
        // Output the height average
        System.out.println("The height average of this group is " + avg + "cm.");
        // Print which members are above the height average
        System.out.println("The following number(s) are the members who are above the group's height average.");
        // Find which height is above average by using for loop to go through the entire array
        for (int i = 0; i < heights.length; i++) {
            if (heights[i] > avg) {
                // Print the numbers which are above average
                System.out.println(heights[i]);
            }
        }
    }
}
