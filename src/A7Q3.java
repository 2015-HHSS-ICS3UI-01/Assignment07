
import java.util.Scanner;

/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
/**
 *
 * @author malcr1272
 */
public class A7Q3 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        //create scanner
        Scanner in = new Scanner(System.in);
        //create an array with 2 spots
        int nums[] = new int[2];
        //ask for 2 integers to enter
        System.out.println("Please enter 2 Integers:");
        //create for loop to enter 2 integers into the array
        for (int i = 0; i < 2; i = i + 1) {
            int order = in.nextInt();
            nums[i] = order;
        }
        //create temporary integer to switch the spots on the array
        if (nums[0] > nums[1]) {
            int temp = nums[0];
            nums[0] = nums[1];
            nums[1] = temp;
            
        }

        //output ascending orders
        System.out.println("The numbers in ascending order are: ");
        for (int i = 0; i < 2; i++) {
            System.out.println(nums[i]);
        }



    }
}
