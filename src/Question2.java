
import java.util.Scanner;

/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author agott2059
 */
public class Question2 {

    
    public static void main(String[] args) {

        //create sanner
        Scanner input = new Scanner(System.in);
        //get number of people from user
        System.out.println("How many people? ");
        //store number of people in integer
        int numPeople = input.nextInt();
        //create array as large as number of people
        int[] heights = new int[numPeople];
        //get heights, store in array using for loop
        //for loop asks for height as many times as variable "numPeople"
        System.out.println("Enter heights: ");
        for (int i = 0; numPeople > i; i = i + 1) {
            heights[i] = input.nextInt();
        }
        //create variable for sum
        double sum = 0;
        //add all numbers together using for loop
        for (int i = 0; i < heights.length; i++) {
            sum = sum + heights[i];
        }
        //find average of heights
        double average = sum / heights.length;
        //output average height
        System.out.println("The average height is: " + average);
        //output heights above average
        System.out.println("Heights above the average are: ");
        /*find which heights are above average by going through each number in array and
        checking it against the average*/
        for (int i = 0; i < heights.length; i++) {
            if (heights[i] > average) {
                System.out.println(heights[i]);
            }

        }

    }
}
