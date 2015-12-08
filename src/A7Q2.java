
import java.util.Scanner;

/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author iorgs3184
 */
public class A7Q2 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {

    Scanner input = new Scanner(System.in);
    
        System.out.print("How many people are there? ");
        int people = input.nextInt();
                        
        System.out.println("Enter the heights(In centimetres): ");
        int[] nums = new int[people];
        for(int i = 0; i < nums.length; i++){
            nums[i] = input.nextInt();         
        }
        int total = 0;
        for(int i = 0; i < nums.length; i++){
            total = total + nums[i];
        }
        int average = total / people;
        System.out.println("The average height is " + average + "cm");   
    }
}
