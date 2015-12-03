
import java.util.Scanner;

/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author butlj9437
 */
public class A7Q5 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        System.out.println("How many numbers to you want?");
        Scanner input = new Scanner(System.in);
        int length = input.nextInt();
        if(length<1){
            while(length<1){
                System.out.println("Invald number enter again.");
                length = input.nextInt();
            }
        }
        int[] nums = new int[length];
        System.out.println("Enter " + length + " numbers.");
        for(int i = 0; i < length; i++){
            nums[i] = input.nextInt();
        }
        int hold;
        for(int i = 0; i < length-1; i++){
            for(int ii = 1+i; ii < length; ii++){
                if(nums[i]>nums[ii]){
                    hold = nums[ii];
                    nums[ii] = nums[i];
                    nums[i] = hold;
                }
            }
        }
        System.out.println("Here are your numbers from Least to Greates.");
        for(int i = 0; i < length; i++){
            System.out.println(nums[i]);
        }
        int med;
        if(length%2==1){
            med = nums[(length-1)/2];
        }else{
            
        }
        System.out.println("Your medein is.");
        System.out.println(med);
    }
}
