
import java.util.Scanner;

/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author agott2059
 */
public class Question5 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {

        //create scanner
        Scanner input = new Scanner(System.in);
        System.out.println("How many marks do you want to enter? ");
        int numMarks = input.nextInt();

        //create array that holds requested number of integers
        int[] marks = new int[numMarks];
        //request marks from user
        System.out.println("Enter " + numMarks + " marks: ");
        //populate array using input from user (for loop goes through every spot in array)
        for (int i = 0; i < numMarks; i++) {
            marks[i] = input.nextInt();
        }
        /*use loop to go through all marks (moving up a space in the array  
         each time to rearrange all the marks in ascending order*/
        for (int i = 0; i < numMarks; i++) {
            for (int k = 0; k < numMarks; k++) {
                int x = marks[i];
                int y = marks[k];

                if (marks[i] < marks[k]) {
                    marks[i] = y;
                    marks[k] = x;
                }
            }
        }
        /*FOR TEST..
         System.out.println("Marks in increasing order are: ");
         for (int i = 0; i < numMarks; i++) {
         System.out.println(marks[i]);
         }*/

        //check if number of number of marks inputed is odd (1=odd, 0=even)
        int oddEven = numMarks % 2;
        //divide number of marks by 2 so next part of program can get to appropriate spot in array
        int numDivTwo = numMarks / 2;
        //check if number is odd
        if (oddEven == 1) {
            int median = marks[numDivTwo];
            System.out.println("The median is: " + median);
            //if number isn't odd..
        } else {
            //num1 is first "middle number" in array
            int num1 = marks[numDivTwo - 1];
            //num2 is second "middle number"
            int num2 = marks[numDivTwo];
            //find sum of two middle numbers
            double sum = num1 + num2;
            //find media
            double median = sum / 2;
            //output median to user
            System.out.println("The median is: " + median);
        }

    }
}
