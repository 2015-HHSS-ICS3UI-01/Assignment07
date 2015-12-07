
import java.util.Scanner;

/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author kulla6503
 */
public class A7Q2 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // create a scanner
        Scanner input = new Scanner(System.in);
        
        int[] nums = new int[5]; 
        
         for(int i = 0; i < nums.length; i++) {
           System.out.println("How many Students are there in the class? ");
           nums[i] = input.nextInt(); 
           System.out.println("Enter the Marks: ");
        }
         
         
       
        
       
    }
}
