
import java.util.Scanner;

/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
/**
 *
 * @author moraj0721
 */
public class A7Q3 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here

        //Make the scanner
        Scanner input = new Scanner(System.in);

        //ask the user for the 2 integers 
        int[] nums = new int[2];
        System.out.println("Enter the first integer.");
        int firstInt = input.nextInt();

        System.out.println("Enter the second integer.");
        int secInt = input.nextInt();

        nums[0] = firstInt;
        nums[1] = secInt;

        //if the first number is bigger than the second number
        if (nums[1] < nums[0]) {
            //store the first number in a temporary variable
          int temp = nums[0];
          //make the position position equal the second
          nums[0] = nums[1];
          //make the second position equal the variable with the stored number
          nums[1] = temp;
        } 
        
        System.out.println("The integers in acsending order are " + nums[0] + ", " + nums[1]);
    }
}
