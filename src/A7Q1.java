
import java.util.Scanner;

/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author watsk8668
 */
public class A7Q1 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        //input scanner
        Scanner input = new Scanner(System.in);
        
        //how many students
        System.out.println("How many students in the class?");
        int students = input.nextInt();
        
        // make an array of ints with 3 spots
        int[] nums = new int[students];
        
        //enter all the grades
        for(int i = 0; i< nums.length; i++){
        System.out.println("Enter the marks:");
            nums[i] = input.nextInt();
        }
        
        //adding up all the grades in the array
        int total = 0;
        for(int i = 0; i < nums.length; i++) {
            total = total + nums[i];
        }
        
        //calculate the average
        double average = total / students;
        
        //your average is 
        System.out.println("The class average is " + average + "%");
    }
}
