
import java.util.Scanner;

/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * Create a program that will determine all of the prime numbers between 2 and 1000. You will use a 
 * process called "The Sieve of Eratosthenes" 
 * 
 * A  Sieve of Eratosthenes works in the following manner:
 *  - Create a list of consecutive integers from 2 to n: (2, 3, 4, ..., n).  This is the sieve.
 *  - Initially, let p equal 2, the first prime number.
 *  - Starting  from p, count up in increments of p and mark each of these numbers greater than p 
 *    itself in the list. These will be multiples of p: 2p, 3p, 4p, etc.; note that some of them 
 *    may have already been marked.
 *  - Find the first number greater than p in the list that is not marked. If there was no 
 *    such number,stop. Otherwise, let p now equal this number (which is the next prime), and repeat from step 3.
 * 
 * All the numbers not marked in the list are prime. You can use a boolean array to mark as true (it is a prime) or false(it is not a prime). The index of the array will correspond to the number you are investigating as a prime (i.e., the spot 5 in the boolean array would determine if 5 was prime or not).
 *
 * @author richj0985
 */
public class A7Q7 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // create a program that will output all the prime numbers from 0 - 1000

        // create a scanner for input
        Scanner input = new Scanner(System.in);
        
        System.out.println("The prime numbers are: ");
        
        // create variable to store if the numbers are prime or not between 2-1000
        // for convenience we will make the array 1001 positions to account for 
        // arrays being 0 based and by having 1001 entries we can allow each 
        // array position to represent that cooresponding integer number and if it is prime or not
        // right up to 1000. 
        boolean [] aryPrime = new boolean[1001];
        
        // create for loop to start all the positions in the loop as true
        for(int index = 0; index < aryPrime.length; index = index + 1){
            aryPrime[index] = true;
        }
        
        // create for loop to determine if the numbers are prime numbers or not
        // the loop will start at 2 since 1 and 0 are factors that don't apply determining prime numbers
        // the number will increase by one checking all numbers until reaching 1000
        for(int primeNum = 2; primeNum <= 1000; primeNum = primeNum + 1){
            
            // Look for next prime number and if one is found then set all it's multiples up to 
            // 1000 to not be a prime number.   
            if(aryPrime[primeNum] == true){
                
                // create for loop to find all the multiples of the prime number that is already determined
                // the multiples are then entered in as false into the array
                for(int multPrimeNum = 2; primeNum * multPrimeNum <= 1000; multPrimeNum = multPrimeNum + 1){
                    aryPrime[primeNum * multPrimeNum] = false;
                }
            }
        }
        
        // create for loop to output only the prime numbers
        for(int index2 = 2; index2 <= 1000; index2 = index2 + 1){
            if(aryPrime[index2] == true){
                System.out.println(index2);
            }
        }
        
        // close scanner
        input.close();
    }
}
