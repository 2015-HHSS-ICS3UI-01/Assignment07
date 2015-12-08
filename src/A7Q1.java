
import java.util.Scanner;

/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author iorgs3184
 */
public class A7Q1 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        
        Scanner input = new Scanner(System.in);
    
        System.out.print("How many students in the class? ");
        int students = input.nextInt();
                        
        System.out.println("Enter the marks: ");
        int[] nums = new int[students];
        for(int i = 0; i < nums.length; i++){
            nums[i] = input.nextInt();         
        }
        double average = 0;
        for(int i = 0; i < nums.length; i++){
            average = average + nums[i];
        }
        average = average / students;
        average = Math.round(average * 10)/10;
        System.out.println("The class average is " + average + "%");    
    }
}
