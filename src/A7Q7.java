
import java.util.Scanner;

/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author richj0985
 */
public class A7Q7 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // create a scanner for input
        Scanner input = new Scanner(System.in);
        
        System.out.println("The prime numbers are: ");
        
        boolean [] aryPrime = new boolean[1001];
        for(int index = 0; index < aryPrime.length; index = index + 1){
            aryPrime[index] = true;
        }
        
        for(int primeNum = 2; primeNum <= 1000; primeNum = primeNum + 1){
            if(aryPrime[primeNum] != false){
                for(int sleve = 2; sleve * primeNum <= 1000; sleve = sleve + 1){
                    aryPrime[primeNum * sleve] = false;
                }
            }
        }
        
        for(int index2 = 2; index2 <= 1000; index2 = index2 + 1){
            if(aryPrime[index2] == true){
                System.out.println(index2);
            }
        }
        
        // close scanner
        input.close();
    }
}
