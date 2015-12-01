
import java.util.Scanner;

/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
/**
 *
 * @author sevcm7279
 */
public class A7Q2 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // make a scanner
        Scanner input = new Scanner(System.in);

        //enter the number of people that are being measured
        System.out.println("Enter the number of people being measured.");
        int a = input.nextInt();

        //create a double to store the heights
        int[] heights = new int[a];

        //create a loop to enter all of the heights
        for (int i = 0; i < heights.length; i++) {
            System.out.println("Please enter the height (in cm).");
            heights[i] = input.nextInt();
        }
        //determine th average height
        int total = 0;
        for (int i = 0; i < heights.length; i++) {
            total = total + heights[i];

        }
        //calculate the average
        int average = total / a;

        System.out.println("The heights that are above average are:");
        //check to see if any of the heights are above average
        for (int i = 0; i < heights.length; i++) {
            if (heights[i] > average);
            System.out.println(heights[i]);
        }
    }
}