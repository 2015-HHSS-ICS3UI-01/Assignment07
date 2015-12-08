
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

        Scanner input = new Scanner(System.in);
        
        int integers = 0;
        int[] nums = new int[2];
        
        System.out.print("Enter two numbers: ");
        for (int i = 0; i < nums.length; i++) {
            integers = input.nextInt();
            nums[i] = integers;
        }
        if (nums[0] > nums[1]) {
            System.out.println("Your numbers in ascending order are " + 
                    nums[1] + ", " + nums[0]);
        } else{
            System.out.println("Your numbers in ascending order are " + 
                    nums[0] + "," + nums[1]);
        }
    }
}
