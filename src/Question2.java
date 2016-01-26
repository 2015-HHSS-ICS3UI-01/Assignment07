
import java.util.Scanner;

/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author alled7036
 */
public class Question2 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
          Scanner input = new Scanner(System.in);
           //number of people entering the high
          System.out.println(" How many people are entering their height? ");
          int people = input.nextInt();
          //Entering the heights
         int[] nums = new int[people];
         System.out.println("Enter the heights ");
         for(int i = 0; i < nums.length; i++){
           nums[i] = input.nextInt();
         }
          //figuring out the average
         int average = 0;
         for(int i = 0; i < nums.length; i++){
             average = average + nums[i];     
         }
         //Total average
         int total = average / people;
         System.out.println("Your average height is " + total);
         
    }
}
