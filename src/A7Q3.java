
import java.util.Scanner;

/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
/**
 *
 * @author iorgs3184
 */
public class A7Q3 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {

        //new scannmer
        Scanner input = new Scanner(System.in);

        int numbers = 0;
        //makes array of 2
        int[] nums = new int[2];

        //asks user for two numbers
        System.out.print("Enter two numbers: ");
        //gets input twice from user
        for (int i = 0; i < nums.length; i++) {
            numbers = input.nextInt();
            nums[i] = numbers;
        }
        //sees if first nuber is bigger
        //if it is than puts in last position
        if (nums[0] > nums[1]) {
            System.out.println("Your numbers in ascending order are "
                    + nums[1] + ", " + nums[0]);
        }//if first number isnt bigger than its put in first number position 
        else {
            System.out.println("Your numbers in ascending order are "
                    + nums[0] + "," + nums[1]);
        }
    }
}
