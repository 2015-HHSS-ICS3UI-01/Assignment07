
import java.util.Scanner;

/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
/**
 *
 * @author moraj0721
 */
public class A7Q4 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here

        //Make the scanner
        Scanner input = new Scanner(System.in);

        //ask for integers to put in array
        int[] nums = new int[10];
        for (int i = 0; i < 10; i++) {
            System.out.println("Enter integer " + i);
            int swittch = input.nextInt();

            nums[i] = swittch;
        }
        //have it go up the array. if the spot it is on is bigger than the nect position, switch them, if not, move on
        for (int loops0 = 0; loops0 < 9; loops0++) {

            for (int loops1 = loops0 + 1; loops1 < 10; loops1++) {

                if (nums[loops0] > nums[loops1]) {
                    int temp = nums[loops0];
                    nums[loops0] = nums[loops1];
                    nums[loops1] = temp;


                }


            }



        }
        System.out.println("The integers in ascending order are");
        for (int loops3 = 0; loops3 < 10; loops3++) {
            System.out.println(nums[loops3] + ",");

        }


    }
}