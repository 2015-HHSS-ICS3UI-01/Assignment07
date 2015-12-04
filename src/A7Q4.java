
import java.util.Scanner;

/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
/**
 *
 * @author stahc1596
 */
public class A7Q4 {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int[] nums = new int[10];
        System.out.println("Please input 10 marks");
        for (int i = 0; i < 10; i++) {
            //The user enters in 10 marks
            nums[i] = input.nextInt();
        }
        //The marks are then sorted through a very complicated formula and are
        //arranged from least to greatest
        for (int i = 0; i < 10; i++) {
            for (int e = 0; e < 10; e++) {
                if (nums[i] < nums[e]) {
                    int x = nums[i];
                    int y = nums[e];
                    nums[e] = x;
                    nums[i] = y;
                }
            }
        }
        //All the marks are then outputed in the order they are in.
        for (int i = 0; i < 10; i++) {
            System.out.print(nums[i] + ", ");
        }
    }
}
