
import java.util.Scanner;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
/**
 *
 * @author Sami
 */
public class A7Q4 {

    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        int[] nums = new int[10];

        System.out.print("Type in 10 marks: ");
        for (int i = 0; i < 10; i++) {
            nums[i] = input.nextInt();
        }
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
        for (int i = 0; i < 9; i++) {
            System.out.print(nums[i] + ", ");
        }
    }
}
