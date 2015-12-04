
import java.util.Scanner;

/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
/**
 *
 * @author stahc1596
 */
public class A7Q6 {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        //The user enters in the size oof the class.
        int amount = input.nextInt();
        int[] nums = new int[amount];
        System.out.println("Please input all the marks");
        for (int i = 0; i < nums.length; i++) {
            //The user tells the cmputer what all the marks are.
            nums[i] = input.nextInt();
        }
        //The numbers are then sorted from least to greatest to aid in finding the
        //lowest and highest mark.
        for (int i = 0; i < nums.length; i++) {
            for (int e = 0; e < nums.length; e++) {
                if (nums[i] < nums[e]) {
                    int x = nums[i];
                    int y = nums[e];
                    nums[e] = x;
                    nums[i] = y;
                }
            }
        }
        //The computer tells the user the lowest and highest mark.
        System.out.println("Lowest: " + nums[0]);
        System.out.println("Highest: " + nums[amount - 1]);
        int answer = 0;
        for (int i = 0; i < nums.length; i++) {
            //All the marks are then added together.
            answer = answer + nums[i];
        }
        //All the marks added together are then divided by the amount of students
        //in the class to get the class average which is then printed out.
        answer = answer / amount;
        System.out.println("average: " + answer);

    }
}
