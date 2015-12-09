
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
        
        //new scanner
        Scanner input = new Scanner(System.in);

        //asks user how many students in class
        System.out.print("How many students in the class? ");
        int students = input.nextInt();

        //asks user to enter marks
        System.out.println("Enter the marks: ");
        //makes array of marks entered
        int[] nums = new int[students];
        //gets number from when the user entered at students
        for (int i = 0; i < nums.length; i++) {
            nums[i] = input.nextInt();
        }
        double average = 0;
        //adds all marks together
        for (int i = 0; i < nums.length; i++) {
            average = average + nums[i];
        }
        //takes total and divides by marks entered
        average = average / students;
        //rounded to nearest hundreth place value
        average = Math.round(average * 100) / 100f;
        //prints out the average
        System.out.println("The class average is " + average + "%");
    }
}
