
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
        double average = 0;
        for(int i = 0; i < nums.length; i++){
            average = average + nums[i];
        }
        average = average / people;
        average = Math.round(average * 10)/10;
        System.out.println("The average height is " + average + "cm");   
    }
}
