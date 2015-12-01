
import java.util.Scanner;

/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author butlj9437
 */
public class A7Q3 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        int[] nums = new int[2];
        System.out.println("Enter two numbers.");
        Scanner input = new Scanner(System.in);
        nums[0] = input.nextInt();
        nums[1] = input.nextInt();
        if(nums[0]>nums[1]){
            int hold = nums[0];
            nums[0] = nums[1];
            nums[1] = hold;
        }
        System.out.println("Your numbers in acesnding order are.");
        System.out.println(nums[0] + ", " + nums[1]);
    }
}
