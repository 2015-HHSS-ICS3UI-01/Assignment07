
import java.util.Scanner;

/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author preej0747
 */
public class Question6 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        //make a scanner to record user input
        Scanner input = new Scanner(System.in);
        
        //find out how many people are in the class
        System.out.println("How many students are in the class?");
        int students = input.nextInt();
        
        //make array
        int[] nums = new int[students];
        
        //get students marks
        for(int marks = 0; marks < nums.length; marks++){
            System.out.println("What is your mark");
            nums[marks] = input.nextInt();
        }
        
        //get the best and worst mark
        int best = nums[0];
        int worst = nums[0];
        for(int marks = 1; marks < nums.length; marks++){
            if(nums[marks] > best){
                best = nums[marks];
            }else if(nums[marks] < worst){
                worst = nums[marks];
            }
        }
        System.out.println("The best mark in the class is " + best);
        System.out.println("The worst mark in the class is " + worst);
        
        //find average mark
        int total = 0;
        for(int marks = 0; marks < nums.length; marks++){
            total = total + nums[marks];
        }
        int average = 0;
        for(int marks = 0; marks < nums.length; marks++){
            average = total/students;
        }
        System.out.println("The average mark is " + average);
        
        
    }
}
