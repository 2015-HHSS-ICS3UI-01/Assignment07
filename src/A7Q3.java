
import java.util.Scanner;

/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author mitrm7692
 */
public class A7Q3 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        //Create a scanner
        Scanner input = new Scanner(System.in);
        //Make 2 spots in the array
        int[] nums = new int[2];
        //Asks user for 2 numbers
        System.out.println("Please Enter two numbers:");
        //loop 2 times becasue only two numbers are to be entered
        for (int a = 0; a < 2; a++) {
            int number = input.nextInt();
            //nums[a] is equal to the number put in by the user
            nums[a]=number;
    }
        
        //Makes int A1 equal the first spot in the array
        int A1 = nums[0];
        //if A1 is greater than nums[1] 
        if (A1 > nums[1]) {
            //then nums[0] will be equal to nums[1]
            nums[0] = nums[1];
            //and nums[1] will be equal to the variable
            nums[1] = A1;
        }
        //outputs "The numbers from lowest to highest order are: "
        System.out.print("The numbers from lowest to highest are: ");
        //loop 2 times becasue only two numbers are entered
        for (int a = 0; a < 2; a++) {
            // Outputs the number with a blank space
            System.out.print(nums[a] + " ");
            //If a is equal to one it prints out a blank space
            if (a == 1) {
                System.out.println("");
            }
        }
    }
}
