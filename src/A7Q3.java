
import java.util.Scanner;

/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

/**
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
        double[] aryA = new double[2];
        
        // ask the user to enter two integers and store these two numbers below
        System.out.print("Enter to integers to sort in acsending order:");
        aryA[0] = input.nextInt();
        aryA[1] = input.nextInt();
        
        // create a temporary variable to store position 0 in the array
        double temporaryA = aryA[0];
        
        // if the number within position 0 is larger then the number within position 1
        // then they should switch in order to order the numbers properly
        if(aryA[0] > aryA[1]){
            aryA[0] = aryA[1];
            aryA[1] = temporaryA;
        }
        
        // output the order
        System.out.println("The numbers in ascending order are " + aryA[0] + aryA[1]);
        
        // close scanner
        input.close();
    }
}
