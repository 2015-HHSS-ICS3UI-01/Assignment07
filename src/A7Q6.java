
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

        //new scanner
        Scanner input = new Scanner(System.in);

        //asks user to enter the number of students in a class
        System.out.print("How many students in the class? ");
        int students = input.nextInt();

        //asks for all the students marks
        System.out.println("What are the marks of each student? ");
        //makes array of the amount of students in class
        int[] nums = new int[students];
        //gets users input for all the students
        for (int i = 0; i < nums.length; i++) {
            nums[i] = input.nextInt();
        }//loops through all marks
        //rearanges and puts them in ascending order
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
        //prints out all the marks in ascending order
        System.out.print("Marks in ascending order are: ");
        System.out.print(nums[0]);
        for (int i = 1; i < nums.length; i++) {
            System.out.print(", " + nums[i]);
        }
        //leaves a blank line
        System.out.println();

        //prints out lowest mark from position [0]
        System.out.println("Lowest mark: " + nums[0] + "%");
        //prints out highest mark at final position
        System.out.println("Highest mark: " + nums[students - 1] + "%");

        double average = 0;
        //adds up all the marks
        for (int i = 0; i < nums.length; i++) {
            average = average + nums[i];
        }
        //finds average by dividing total by students
        average = average / students;
        //roundeds to nearest hundreth place value
        average = Math.round(average * 10) / 10;
        //prints out the average mark
        System.out.println("The average for the class is " + average + "%");
    }
}
