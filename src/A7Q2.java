
import java.util.Scanner;

/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
/**
 *
 * @author watsk8668
 */
public class A7Q2 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        //input scanner
        Scanner input = new Scanner(System.in);

        //how many people
        System.out.println("How many people?");
        int people = input.nextInt();

        // make an array of ints with the # of people as the # of spots
        int[] nums = new int[people];

        //enter all the heights
        for (int i = 0; i < nums.length; i++) {
            System.out.println("Enter the heights:");
            nums[i] = input.nextInt();
        }

        //adding up all the heights in the array
        int total = 0;
        for (int i = 0; i < nums.length; i++) {
            total = total + nums[i];
        }

        //calculate the average
        double average = total / people;

        int i = 0;
        while (nums[i] == nums[i]) {
            i++;
            if (nums[i] > average) {
                System.out.println(nums[i]);
            }
        }


    }
}
