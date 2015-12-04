
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
        for (int i = 0; i < 10; i++){
            nums[i] = input.nextInt();
        }
        for (int i = 0; i < 10; i++){
            for (int e = 0; e < 10; e++){
                if (nums[i] < nums[e]){
                    int x = nums[i];
                    int y = nums[e];
                    nums[e] = x;
                    nums[i] = y;
                }
            }
        }
        for (int i = 0; i < 10; i++){
        System.out.print(nums[i] + ", ");
        }
    }
}
