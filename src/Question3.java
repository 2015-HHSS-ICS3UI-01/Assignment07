
import java.util.Scanner;

/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author agott2059
 */
public class Question3 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        //create scanner
        Scanner input = new Scanner(System.in);
        //create array "A" with two elements
        int[] A = new int[2];
        //ask user to enter two integers
        System.out.println("Enter two integers: ");
        //store the integers in the array using a for loop
        for (int i = 0; i < 2; i++) {
            A[i] = input.nextInt();
        }
        //check is the interger in space 1 is larger than the interger in space 0
        if (A[1] > A[0]) {
            /*is above if statement is true, the numbers have been entered in ascending order,
            so output space 0 first then space 1 */
            System.out.println("The integers in ascending order are: " + A[0] + ", " + A[1]);
        } else {
            //above space is not true so output the second digit entered first
            System.out.println("The integers in ascending order are: " + A[1] + ", " + A[0]);
        }

    }
}
