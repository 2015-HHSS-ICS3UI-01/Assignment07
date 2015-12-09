
import java.util.Scanner;

/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author butlj9437
 */
public class A7Q4 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Enter 10 numbers.");
        int[] nums = new int[10];
        for(int i = 0; i < 10; i++){
            nums[i] = input.nextInt();
        }
        int hold;
        for(int i = 0; i < 9; i++){
            for(int ii = 1+i; ii < 10; ii++){
                if(nums[i]>nums[ii]){
                    hold = nums[ii];
                    nums[ii] = nums[i];
                    nums[i] = hold;
                }
            }
        }
        System.out.println("Here are your numbers from Least to Greates.");
        for(int i = 0; i < 10; i++){
            System.out.println(nums[i]);
        }
    }
}
