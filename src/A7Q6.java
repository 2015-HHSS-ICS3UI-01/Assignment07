
import java.util.Scanner;

/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author butlj9437
 */
public class A7Q6 {

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
        System.out.println("Lowest number is: ");
        System.out.println(nums[0]);
        double med;
        if(length%2==1){
            med = nums[length/2];
        }else{
            int spot = length/2;
            med = (nums[spot] + nums[spot-1]);
            med = med/2;
        }
        System.out.println("Average is: ");
        System.out.println(med);
        System.out.println("Highest number is: ");
        System.out.println(nums[length-1]);
    }
}
