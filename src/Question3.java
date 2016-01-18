
import java.util.Scanner;

/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author preej0747
 */
public class Question3 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        //make a scanner to collect user input
        Scanner input = new Scanner(System.in);
        
        //make array
        int[] nums = new int[2];
        
        //get integers
        for(int integer = 0; integer < nums.length; integer++){
            System.out.println("Please enter an integer");
            nums[integer] = input.nextInt();
        }
        
        //determine if first int is bigger than second int
        if(nums[0] > nums[1]){
            int a = nums[0];
            nums[0] = nums[1];
            nums[1] = a;
            for(int integer = 0; integer < nums.length; integer++){
                System.out.println(nums[integer]);
            }
        }else{
        for(int integer = 0; integer < nums.length; integer++){
            System.out.println(nums[integer]);
        }
    }
        
            }
        }
    

