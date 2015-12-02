
import java.util.Scanner;

/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author sevcm7279
 */
public class A7Q3 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        //make a scanner
        Scanner input = new Scanner (System.in);
        
        //tell the user to input two values for the array
        //store the int in variables
        System.out.println("Please enter an integer.");
        int a = input.nextInt();
        System.out.println("Please enter a second integer.");
        int b = input.nextInt();
        
        //create an array to store two integers in which are typed in by the user
        int[] nums = new int [2];
        //make the ints the numbers the user entered
        nums[0] = a;
        nums[1] = b;
        
        //determine if the second number is bigger than the first
        //if it is, switch them
        if (nums[1] > nums[0]){
            nums[0] = b;
            nums[1] = a;
            System.out.println(nums[0]);
            System.out.println(nums[1]);
        }//if it is not, do nothing and sout the numbers
        else if (nums[0] > nums [1]){
            System.out.println(nums[0]);
            System.out.println(nums[1]);
        }
        
    }
}
