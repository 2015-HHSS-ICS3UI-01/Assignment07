
import java.util.Scanner;

/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * Write a program to create and populate an array that contains only two integer elements, outputting the integers in ascending order. 
 * 
 * - The program will ensure the elements are placed in ascending order, once the array has been populated. 
 * - For example the program accept a series of numbers.
 * - Then it will interchange the values so that the resulting modified array is in ascending order.
 * - The sorted values are then outputted. 
 * 
 * @author richj0985
 */
public class A7Q3 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // create a program that will store two numbers and output in ascending order
        
        // create a scanner for input
        Scanner input = new Scanner(System.in);
        
        // create an array that will store 2 numbers
        int [] aryA = new int[2];
        
        // ask the user to enter two integers and store these two numbers below
        System.out.print("Enter to integers to sort in ascending order:");
        aryA[0] = input.nextInt();
        aryA[1] = input.nextInt();
            
        // if the number within position 0 is larger then the number within position 1
        // then they should switch in order to order the numbers properly
        if(aryA[0] > aryA[1]){
            // swap the values in positions 0 and 1
            // create a temporary variable to store position 0 in the array
            int temporaryA = aryA[0];
            aryA[0] = aryA[1];
            aryA[1] = temporaryA;
        }
        
        // output the order
        System.out.println("The numbers in ascending order are " + aryA[0] + " " + aryA[1]);
        
        // close scanner
        input.close();
    }
}
