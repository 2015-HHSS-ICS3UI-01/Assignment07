
import java.util.Scanner;

/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
/**
 *
 * @author iorgs3184
 */
public class A7Q5 {

    public static void main(String[] args) {

        //new scanner
        Scanner input = new Scanner(System.in);

        //asks user to enter the number of marks
        System.out.print("How many marks are going to be entered?: ");
        int number = input.nextInt();

        //makes an array of number of marks entered
        int[] nums = new int[number];

        //asks user to enter marks
        System.out.println("Please enter all the Marks: ");
        //user enters marks
        for (int i = 0; i < nums.length; i++) {
            nums[i] = input.nextInt();
        }
        //loops through all marks
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
        //prints out marls in ascending order
        System.out.print("Marks in ascending order are: ");
        System.out.print(nums[0]);
        for (int i = 1; i < nums.length; i++) {
            System.out.print(", " + nums[i]);
        }
        //leaves a blank line
        System.out.println();

        //sees if there median has two middle numbers
        //adds middle numbers then divides by 2
        if (nums.length % 2 == 0) {
            number = ((int) nums[nums.length / 2] + (int) nums[nums.length / 2 - 1]) / 2;
        }//if not then it find the middle number in the marks 
        else {
            number = (int) nums[nums.length / 2];
        }
        //prints out the median
        System.out.println("The median is " + number + "%");
    }
}
