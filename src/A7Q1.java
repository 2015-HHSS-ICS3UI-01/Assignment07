
import java.util.Scanner;

/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
/**
 *
 * @author tatad6701
 */
public class A7Q1 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // Create new scanner
        Scanner input = new Scanner(System.in);
        double total = 0;
        // Ask the user how many students there are in the class
        System.out.println("How many students are there in the class?");
        // Save the user's input to variable 'studentNum'
        int studentNum = input.nextInt();
        // Create new array, involving studentNum
        int[] marks = new int[studentNum];
        // Ask the user to enter the student's marks
        System.out.println("Enter the marks of the students.");
        // For loop created to go through array
        for (int i = 0; i < marks.length; i++) {
            marks[i] = input.nextInt();
            total = total + marks[i];
        }
        // Calculate the total average and round to the nearest hundreth decimal place
        double avg = Math.round((total / marks.length) * 100d) / 100d;
        // Print the test results 
        System.out.println("The class average is " + avg + "%.");
    }
}
