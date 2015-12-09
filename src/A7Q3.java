
import java.util.Scanner;

/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author watsk8668
 */
public class A7Q3 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // inport scanner
        Scanner input = new Scanner(System.in);
        
        //create array with 2 places
        int[] A = new int[2];
        
        //enter 2 integers
        System.out.println("Enter 2 integers: ");
        A[0] = input.nextInt();
        A[1] = input.nextInt();
        
        //put them in order from smallest to largest
        int first = A[0];
        int second = A[1];
        if (A[0] > A[1]) {
              A[0] = second;
              A[1] = first;
        }
        
        //The integers in ascending order are 
        System.out.println("The integers in ascending order are: " + A[0] + " " + A[1]);
    }
}
