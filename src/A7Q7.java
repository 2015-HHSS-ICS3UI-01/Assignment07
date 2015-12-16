
import java.util.Scanner;

/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
/**
 *
 * @author moraj0721
 */
public class A7Q7 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here

        //make the scanner
        Scanner input = new Scanner(System.in);

        //ask if the users would like all the prime numbers up to a thousand 
        System.out.println("Would you like to know all the prime numbers up to 1000?");
        String sive = input.nextLine();

        //create the array
        boolean ans = true;
        boolean[] primes = new boolean[1001];

        for (int p = 0; p < 1001; p++) {
            primes[p] = true;

        }

        for (int pos = 2; pos < 1000; pos = pos + 1) {
            if (primes[pos] == true) {


                for (int pear = 2; pos * pear <= 1000; pear = pear + 1) {
                    primes[pos * pear] = false;
                }
            }
        }
        for (int jelly = 2; jelly <= 1000; jelly = jelly + 1) {
            if (primes[jelly] == true) {
                System.out.println(jelly);
            }
        }
    }
}
