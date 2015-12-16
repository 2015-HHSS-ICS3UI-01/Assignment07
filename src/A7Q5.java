
import java.util.Scanner;

/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
/**
 *
 * @author moore3607
 */
public class A7Q5 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        //created a new scanner called input
        Scanner input = new Scanner(System.in);
        //asks the user how many marks they are going to enter
        System.out.println("How many marks are you going to enter?");
        //number is equal to the input from the user
        int number = input.nextInt();
        //the number of spots the the "nums" array is equal to "number"
        int nums[] = new int[number];
        //created variables "marks" and "temp" and made them equal to 0
        int marks = 0;
        int temp = 0;
        //divides the number of marks by 2 and calls it "median"
        int median = number / 2;
        //adds one to median
        int checkone = 1 + median;
        //subtracts median from "number"
        int checktwo = number - median;
//tells the user to enter the marks
        System.out.println("Enter the marks.");
        for (marks = 0; marks < number; marks++) {
            nums[marks] = input.nextInt();
        }

//moves the lowest numbers to the start of the array 
//(in order from least to greatest) and stops when it gets 
//to the end of the array
        for (int i = 0; i < number; i++) {

            for (int n = 0; n < number; n++) {
                if (nums[i] < nums[n]) {
                    temp = nums[i];
                    nums[i] = nums[n];
                    nums[n] = temp;
                }
            }
        }
        //prints the new number order (least to greatest) onto the screen
        System.out.println("Here is the new number order.");
        for (int finale = 0; finale < number; finale++) {
            System.out.println(nums[finale]);
        }
        //if checkone is equal to checktwo, then median is printed to the screen
        if (checkone == checktwo) {
            System.out.println("The median is " + nums[median]);
            //if they are not equal, they are both printed onto the screen
        } else {
            System.out.println("The medians are " + checkone + " and " + checktwo);
        }
    }
}
