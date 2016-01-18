
import java.util.Scanner;

/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
/**
 *
 * @author preej0747
 */
public class Question7 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        //make a boolean array 
        boolean[] nums = new boolean[1001];

        //loop through array and assume that every spot in it is true
        //true = number is prime
        for (int i = 0; i < nums.length; i++) {
            nums[i] = true;
        }

        //loop through numbers in array
        for (int a = 2; a < nums.length; a++) {
            if (nums[a] == true) {

                //loops through a set of numbers starting from 2 and multiplies them by the numbers in the array
                for (int b = 2; b < nums.length; b++) {
                    int d = a * b;

                    //eliminates numbers that go out of the array
                    if (d < 1001) {
                        nums[d] = false;
                    }

                }

            }

        }
        //output prime numbers
        for (int e = 2; e < nums.length; e++) {
            if (nums[e] == true) {
                System.out.println(e + "");
            }

        }
    }
}
