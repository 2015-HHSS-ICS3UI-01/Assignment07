
import java.util.Scanner;

/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
/**
 *
 * @author tatad6701
 */
public class A7Q5 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // Create new scanner
        Scanner input = new Scanner(System.in);
        // Ask the user the number of the student marks in the class
        System.out.println("How many student marks are there in the class?");
        // Save the user's input to variable 'marksNums'
        int marksNum = input.nextInt();

        // Create new array involving the marks of the students
        double[] marks = new double[marksNum];
        // Ask the user to input the marks
        System.out.println("Please enter the student marks.");

        // For loop that goes through array 
        for (int i = 0; i < marks.length; i++) {
            marks[i] = input.nextInt();
        }
        // For loop that goes through to array to arrange the numbers in ascending order
        // For loop goes through all marks, moving up a space (character) in the array each time to rearange in ascending order 
        for (int i = 0; i < marks.length; i++) {
            for (int k = 0; k < marks.length; k++) {
                double x = marks[i];
                double y = marks[k];
                if (marks[i] < marks[k]) {
                    marks[i] = y;
                    marks[k] = x;
                }
            }
        }
        // Print all the numbers from greatest to lowest order
        System.out.println("The student marks from lowest to highest are: ");
        for (int i = 0; i < marks.length; i++) {
            System.out.println(marks[i]);
        }

        // Print to the user the median of all the marks
        // If statement that print median and calculates the median if needed to
        if (marks.length % 2 == 0) {
            // Calculates the median with even amount of marks
            int mid = marks.length / 2;
            int mid2 = mid - 1;
            double median = (marks[mid] + marks[mid2]) / 2;
            // Print the median
            System.out.println("The median of the student marks is " + median + ".");
        } else {
            // Calculates the median with odd amount of numbers
            int mid = marks.length / 2;
            double median = marks[mid];
            System.out.println("The median of the marks is " + median + ".");
        }
    }
}
