
import java.util.Scanner;

/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author preej0747
 */
public class Question2 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        //make a scanner to collect user input
        Scanner input = new Scanner(System.in);
     
        //determine average height
        double average = 5.5;
        
        //find out many people are recording their height
        System.out.println("How many people will be recording their height?");
        int amount = input.nextInt();
        
        //make an array
        double[] nums = new double[amount];
        
        //get heights
        for(int height = 0; height < nums.length; height++){
            System.out.println("What is your height?");
            nums[height] = input.nextDouble();
            if(nums[height] >= average){
                System.out.println(nums[height] + " is above average height");
            }else{
                System.out.println(nums[height] + " is below average height");
            }
        }
        
        
                
                
        
    }
}
