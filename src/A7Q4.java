
import java.util.Scanner;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
/**
 *
 * @author iorgs3184
 */
public class A7Q4 {

    public static void main(String[] args) {

        //new scanner
        Scanner input = new Scanner(System.in);

        //makes an array of 10 spots
        int[] nums = new int[10];

        //asks user to enter 10 marks
        System.out.println("Type in 10 marks: ");
        for (int i = 0; i < 10; i++) {
            nums[i] = input.nextInt();
        }
        //loops through all 10 marks
        //rearanges and puts them in ascending order
        for (int i = 0; i < 10; i++) {
            for (int s = 0; s < 10; s++) {
                if (nums[i] < nums[s]) {
                    int x = nums[i];
                    int y = nums[s];
                    nums[s] = x;
                    nums[i] = y;
                }
            }
        }
        //prints out marks un ascending order
        System.out.print("The marks in ascending order are: ");
        System.out.print(nums[0]);
        for (int i = 1; i < nums.length; i++) {
            System.out.print(", " + nums[i]);
        }
    }
}
