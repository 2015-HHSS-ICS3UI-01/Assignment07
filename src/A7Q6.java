
import java.util.Scanner;

/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author iorgs3184
 */
public class A7Q6 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {

    Scanner input = new Scanner(System.in);
        
        System.out.print("How many students in the class? ");
        int students = input.nextInt();
    
        System.out.println("What are the marks of each student? ");
        int[] nums = new int[students];
        for(int i = 0; i < nums.length; i++){
            nums[i] = input.nextInt();         
        }
        for (int i = 0; i < nums.length; i++) {
            for (int s = 0; s < nums.length; s++) {
                if (nums[i] < nums[s]) {
                    int x = nums[i];
                    int y = nums[s];
                    nums[s] = x;
                    nums[i] = y;
                }
            }
        }
        System.out.print("Marks in ascending order are: ");
        for (int i = 0; i < nums.length; i++) {
            System.out.print(nums[i] + ", ");
        }
        System.out.println();
        
        System.out.println("Lowest mark: " + nums[0]);
        System.out.println("Highest mark: " + nums[students - 1]);
        
        double average = 0;
        for(int i = 0; i < nums.length; i++){
            average = average + nums[i];
        }
        average = average / students;
        average = Math.round(average * 10)/10;
        System.out.println("The average for the class is " + average  + "%");
    }
}
