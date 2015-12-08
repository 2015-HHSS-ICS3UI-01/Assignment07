import java.util.Scanner;

/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
/**
 *
 * @author iorgs3184
 */
public class A7Q5 {

    public static void main(String[] args) {
        
        Scanner input = new Scanner(System.in);
                     
        System.out.print("Please enter the number of marks: ");        
        int number = input.nextInt();
        
        int[] nums = new int[number];
        
        System.out.println("Please enter all the Marks: ");
        for (int i = 0; i < nums.length; i++) {
            nums[i] = input.nextInt();
        }
        for (int i = 0; i < nums.length; i++) {
            for (int s = 0; s < nums.length; s++) {
                if (nums[i] < nums[s]) {
                    int x = nums[i];
                    int y = nums[s];
                    nums[s] = x;
                    nums[i] = y;
                }
            }
        }       
        System.out.print("Marks in ascending order are ");
        for (int i = 0; i < nums.length; i++) {
            System.out.print(nums[i] + ", ");
        }
        System.out.println();       
        
        if (nums.length % 2 == 0) {
            number = ((int) nums[nums.length / 2] + (int) nums[nums.length / 2 - 1]) / 2;
        } else {
            number = (int) nums[nums.length / 2];
        }           
        System.out.println("The median is " + number);
    }
}