
import java.util.Scanner;

/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
/**
 *
 * @author moore3607
 */
public class A7Q4 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        //created a scanner and called it input
        Scanner input = new Scanner(System.in);
        //the spots in the "nums" array is equal to 10
        int nums[] = new int[10];
        //created variables "marks" and "temp" and made them equal to 0
        int marks = 0;
        int temp = 0;
//tells the user to enter the marks
        System.out.println("Enter the marks.");
        for (marks = 0; marks < 10; marks++) {
            nums[marks] = input.nextInt();
        }

//pts the marks in order from least to greatest and stops when it gets 
//to the end of the array
        for (int i = 0; i < 10; i++) {

            for (int n = 0; n < 10; n++) {
                if (nums[i] < nums[n]) {
                    temp = nums[i];
                    nums[i] = nums[n];
                    nums[n] = temp;
                }
            }
        }
        //prints the new number order (least to greatest) onto the screen
        System.out.println("Here is the new number order.");
        for (int finale = 0; finale < 10; finale++) {
            System.out.println(nums[finale]);
        }


    }
}
