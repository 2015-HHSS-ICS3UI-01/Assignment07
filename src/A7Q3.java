
import java.util.Scanner;

/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
/**
 *
 * @author hadik9595
 */
public class A7Q3 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        //generates scanner
        Scanner in = new Scanner(System.in);
        // since we know it's 2 integers, I plugged in 2
        int[] digits = new int[2];
        //asks for integers
        System.out.println("Enter two integers:");
        // counted loop assigning integers to 1 and 2 ( 0 and 1 in java's perspective)
        for (int i = 0; i < 2; i++) {
            int digit = in.nextInt();
            // formula of assigning digits to numbers
            digits[i] = digit;

        }
        // A variable known as temp, created to not cause overridings 
        int temp = digits[0];
        // if condition only functions/executes when first number is larger than second
        if (temp > digits[1]) {
            // Swaps first number's value with digit #2 (In java: 1)
            digits[0] = digits[1];
            // Swaps second number's value with digit #1 (In java: 0)
            digits[1] = temp;
        }
        System.out.print("The integers in ascending order are:");
        // counted loop counting up and printing accordingly
        for (int i = 0; i < 2; i++) {
            // Prints out numbers (digit[0],digit[1])
            System.out.print(digits[i] + " ");

            // This is to make sure BUILD SUCCESSFUL isn't merged with previous line
            if (i == 1) {
                System.out.println("");
            }
        }

    }

}
