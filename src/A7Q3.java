
import java.util.Scanner;

/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
/**
 *
 * @author kulla6503
 */
public class A7Q3 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // create a scanner
        Scanner in = new Scanner(System.in);

        // to make an array of int
        int[] aryNums = new int[2];

        // User Enters 2 numbers
        System.out.println("Enter two integers:");
        
        // To determine the population of the array
        for (int i = 0; i < 2; i++) {
            aryNums[i] = in.nextInt();
        }
        // If first number is smaller than second then does the following 
        if (aryNums[0] < aryNums[1]) {
            System.out.println("The Integers in accending order is: " + aryNums[0] + "," + aryNums[1]);
        }
        // If second number is smaller than first then does the following  
        else if (aryNums[1] < aryNums[0]) {
            System.out.println("The Integers in accending order is: " + aryNums[1] + "," + aryNums[0]);
        }




    }
}
