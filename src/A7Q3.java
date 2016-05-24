
import java.util.Scanner;

/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
/**
 *
 * @author tatad6701
 */
public class A7Q3 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // Create new scanner 
        Scanner input = new Scanner(System.in);
        // Create array 'A' with two elements
        int[] A = new int[2];
        // Ask the user to enter two integers
        System.out.println("Enter two integers.");
        // Store the integers in the array using for loop
        for (int i = 0; i < 2; i++) {
            A[i] = input.nextInt();
        }
        // Check if the integer in space 1 is larger than the integer in space 0
        if (A[1] > A[0]) {
            // If the statement above is true, the numbers have been entered in ascending order 
            // The program will then output space 0 first, then space 1
            System.out.println("The integers in ascending order are: " + A[0] + "," + A[1] + ".");
        } else {
            // If the statement above is not true, the program will print the second digit first and then the first digit  
            System.out.println("The integers in ascending order are: " + A[1] + "," + A[0] + ".");
        }
    }
}
