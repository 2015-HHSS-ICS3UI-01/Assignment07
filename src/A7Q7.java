/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author moore3607
 */
public class A7Q7 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here

        //set array with 1000 numbers (because 0 is counted as a number)
        int[] nums = new int[1001];
        //loop through 1000 times 
        for (int e = 2; e < 1001; e++) {
            nums[e] = e;   //the numbers are enetred into the array
        }

        //make the integer and set the value to zero
        int k = 0;
        //count (or repeat up to 999 from 2) for the int i
        for (int i = 2; i < 1000; i++) {
            //count (or repeat up to 999 from 2) for the in w
            for (int w = 2; w < 1000; w++) {
                k = i * w;
                //if k is less than 1001
                if (k < 1001) {
                    //make the value a negative 
                    nums[k] = k * -1;
                }
            }
        }//tell user the prime numbers 
        System.out.println("The prime numbers are  ");
        //loop up to 999 
        for (int p = 0; p < 1000; p++) {
            //if the number is greater than zero 
            if (nums[p] > 0) {
                //prints out all the numbers to the user 
                System.out.print("(" + nums[p] + ")" + " ");
            }
        }
    }
}
