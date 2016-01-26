
import java.util.Scanner;

/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author alled7036
 */
public class Question5 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        //making a scanner
         Scanner input = new Scanner(System.in);
         
         //asking how many people thweyre are
        System.out.println("How many people are there? ");
       int number = input.nextInt();
        
        int[] nums = new int[number];
        //enters grades 
        System.out.println("Enter your Grades ");
        for(int i = 0; i < nums.length; i++){
            nums[i] = input.nextInt();
        }
        //order of which the numbers accure.
        for(int i = 0; i < nums.length; i++){
            for(int d = 0; d < nums.length; d ++){
                if(nums [d] > nums [i]){
                    int x = nums[i];
                    int y = nums[d];
                    nums[d] = x;
                    nums[i] = y;
                }
          }
     }
        //displaying the numbers from lowest to highest
        System.out.println("Your marks from lowest to highest are ");
        System.out.print(nums[0]);
         for(int i = 1; i < nums.length; i++){
             System.out.print(", " + nums[i]);
        
         } 
         // the math behind figuring out what the median is
         if(nums.length % 2 == 0){
             number = ((int) nums[nums.length/2] + (int) nums[nums.length /2 -1 ])/2 ;
         }else {
         number = (int) nums[nums.length /2]; 
             
         }
         //showing the median
         System.out.println("The median is " + number + "%");
    } 
    

}
