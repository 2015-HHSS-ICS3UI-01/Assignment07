
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
        // Ask the user the number of the students in the class
        System.out.println("How many marks are there?");
        // Save the user's input to variable 'marksNums'
        int marksNum = input.nextInt();

        // Create new array involving the marks of the students
        int[] marks = new int[marksNum];
        // Ask the user to input the marks
        System.out.println("Please enter the student marks.");

        // For loop that goes through array and recieve the inputs
        for (int i = 0; i < marks.length; i++) {
            marks[i] = input.nextInt();
        }
        // For loop that goes through to array to arrange the number
        for (int i = 0; i < 10; i++) {
            for (int k = 0; k < 10; k++) {
                int x = marks[i];
                int y = marks[k];

                if (marks[i] < marks[k]) {
                    marks[i] = y;
                    marks[k] = x;
                }
            }
        }
        // Print the marks in order from lowest to highest using a for loop FIX THIS PART!
    }
}
