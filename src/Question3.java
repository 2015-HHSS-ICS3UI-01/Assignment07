
import java.util.Scanner;

/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author alled7036
 */
public class Question3 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        //making scanner
        Scanner input = new Scanner(System.in);
        //showing that theyre are only going to be 2 numbers
        int[] nums = new int[2];
        
        //printing 2 numbers
        
        System.out.println("Print 2 numbers");
        nums[0] = input.nextInt();
        nums[1] = input.nextInt();
        
        //showing numbers in accending order
        if(nums[0] > nums[1]){
            System.out.println("Your  numbers in accending order are " + nums[1] + ", " + nums[0] );
        } else if( nums[0] < nums[1]){
            System.out.println("Your numbers in accending order are " + nums[0] + ", " + nums[1]);
        }
        
    }
}
