
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
        int amount = input.nextInt();
        int[] nums = new int[amount];
        System.out.println("Please input all the marks");
        for (int i = 0; i < nums.length; i++){
            nums[i] = input.nextInt();
        }
        for (int i = 0; i < nums.length; i++){
            for (int e = 0; e < nums.length; e++){
                if (nums[i] < nums[e]){
                    int x = nums[i];
                    int y = nums[e];
                    nums[e] = x;
                    nums[i] = y;
                }
            }
        }
        System.out.println("Lowest: " + nums[0]);
        System.out.println("Highest: " + nums[amount - 1]);
        int answer = 0;
        for (int i = 0; i < nums.length; i++){
            answer = answer + nums[i];
        }
        answer = answer/amount;
        System.out.println("average: " + answer);
        
    }
}
