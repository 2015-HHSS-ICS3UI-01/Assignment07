
import java.util.Scanner;

/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author alled7036
 */
public class Question6 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
              Scanner input = new Scanner(System.in);
        System.out.println("How many people are there? ");
       int number = input.nextInt();
        
        int[] nums = new int[number];
        
        System.out.println("Enter your Grades ");
        for(int i = 0; i < nums.length; i++){
            nums[i] = input.nextInt();
        }
        
        //number of numbers being entered
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
        //printing out the first question
        System.out.println("Your marks from lowest to highest are ");
        System.out.print(nums[0]);
         for(int i = 1; i < nums.length; i++){
             System.out.print(", " + nums[i]);
         }
         //telling us what the highest and lowest marks are
         System.out.println(" The lowest mark is " + nums[0]);
         System.out.println(" The Higest mark is " + nums[number -1]);
         
         double average = 0;
         
         //adds all the numbers up
         for(int i = 0; i < nums.length; i++){
             average = average + nums[1];
         }
         //Calculating the average
         average = average / number;
         
         average = Math.round(average*100)/100f;
         
         System.out.println("The average for the class is " + average );
    }
}
