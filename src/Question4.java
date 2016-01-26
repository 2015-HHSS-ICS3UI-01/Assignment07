
import java.util.Scanner;

/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author alled7036
 */
public class Question4 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        
        //creating scanner
        
        Scanner input = new Scanner(System.in);
    
        int[] nums = new int[10];
        //entering the grades
        System.out.println("Enter your Grades ");
        for(int i = 0; i < 10; i++){
            nums[i] = input.nextInt();
        }
        //the amount of grades and the order of which they occur
        for(int i = 0; i < 10; i++){
            for(int d = 0; d < 10; d ++){
                if(nums [d] > nums [i]){
                    int x = nums[i];
                    int y = nums[d];
                    nums[d] = x;
                    nums[i] = y;
                    
                            
                }
                    
            }
        
        }
        //displaying the marks from lowst to highest
        System.out.println("Your marks from lowest to highest are ");
        System.out.print(nums[0]);
         for(int i = 1; i < nums.length; i++){
             System.out.print(", " + nums[i]);
        
         }
      }  
}

    