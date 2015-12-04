
import java.util.Scanner;

/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
/**
 *
 * @author stahc1596
 */
public class A7Q5 {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Please input the amount of marks");
        //The user enters in the amount of marks.
        int amount = input.nextInt();
        int[] nums = new int[amount];
        for (int i = 0; i < nums.length; i++) {
            //The user enters in all the marks they have.
            nums[i] = input.nextInt();
        }
        //The marks are then sorted from least to greatest.
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
        //The marks are outputed in the order they are in.
        for (int i = 0; i < nums.length; i++) {
            System.out.print(nums[i] + ", ");
        }
        //The median of the marks are found and outputed to the user.
        amount = amount / 2;
        System.out.println("The median is " + nums[amount]);

    }
}
