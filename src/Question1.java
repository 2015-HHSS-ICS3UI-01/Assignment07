
import java.util.Scanner;

/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author preej0747
 */
public class Question1 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        //make a scanner
        Scanner input = new Scanner(System.in);

        //find out how many students are in the class
        System.out.println("How many students are in the class?");
        int amount = input.nextInt();
        
        //make an array
        int[] nums = new int[amount];
            
        //get marks
        for(int mark = 0; mark < nums.length; mark++){
            System.out.println("What was your mark?");
            nums[mark] = input.nextInt();
        }
        
        //find average
        int total = 0;
        for(int mark = 0; mark < nums.length; mark++){
            total = total + nums[mark];
        }int average = 0;
        for(int mark = 0; mark < nums.length; mark++){
            average = total/amount;
        }
        System.out.println("Your average is " + average);
        }
        
        
        
        
    }    
    

