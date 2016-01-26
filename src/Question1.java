
import java.util.Scanner;

/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author alled7036
 */
public class Question1 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here 
           Scanner input = new Scanner(System.in);
           
           //Listing the numbers
            int[] nums = new int[5];
         for(int i = 0; i < nums.length; i++){
             System.out.println("Enter marks ");
             nums[0] = input.nextInt();
             nums[1] = input.nextInt();
             nums[2] = input.nextInt();
             nums[3] = input.nextInt();
             nums[4] = input.nextInt();
             
             //Average 
             double average = ((nums[0] + nums[1] + nums[2] + nums[3] + nums[4])/5) ;
             System.out.println("Your average is " + average);
             break;
         }   
    }
    
    
}
