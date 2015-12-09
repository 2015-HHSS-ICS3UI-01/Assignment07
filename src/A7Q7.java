/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author whitb0039
 */
public class A7Q7 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here

        //create an array
        int[] sieve = new int[1001];

        for (int i = 2; i < 1001; i++) { //loop 1000 times
            sieve[i] = i; //enter the number 1, 2, 3, 4... into the array
        }

        //make the integer y
        int y = 0;

        for (int p = 2; p < 1000; p++) { //loop 999 times

            for (int x = 2; x < 1000; x++) { //loop 999 times
                y = p * x; //find what x*p is 
                if (y < 1001) { //if the y value is less than 1001
                    sieve[y] = y * -1; //mark the value by making it negative
                }
            }
        }
        System.out.println("The prime numbers are as follows: "); //output "The prime numbers are as follows: "
        for (int a = 0; a < 1000; a++) { //loop 999 times
            if (sieve[a] > 0) { //if the number is positive
                System.out.print(sieve[a] + ", "); //output the number
            }
        }
    }
}
