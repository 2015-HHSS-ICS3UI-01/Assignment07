/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author lalim9800
 */
public class A7Q7 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        //set array with 1000 numbers (because 0 is counted as a number)
         int[] primenumber = new int[1001];
        //loop through 1000 times 
        for (int i = 2; i < 1001; i++) { 
            primenumber[i] = i;   //the numbers are enetred into the array
        }

        //make the integer and set the value to zero
        int k = 0;
        //count (or repeat up to 999 from 2) for the int z
        for (int z = 2; z < 1000; z++) {  
        //count (or repeat up to 999 from 2) for the in x
            for (int x = 2; x < 1000; x++) { 
                k = z * x; 
                //if k is less than 1001
                if (k < 1001) {   
                    //make the value a negative 
                   primenumber [k] = k * -1; 
                }
            }
        }//tell user the prime numbers 
        System.out.println("The prime numbers are  "); 
        //loop up to 999 
        for (int t = 0; t < 1000; t++) { 
            //if the number is greater than zero (posotive)
            if (primenumber[t] > 0) { 
                //out put all the numbers to the user 
                System.out.print("("+primenumber[t]+")" + " "); 
            }
        }
    }
}


