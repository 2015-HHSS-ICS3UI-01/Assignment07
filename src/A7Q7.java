
import java.util.Scanner;

/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
/**
 *
 * @author mitrm7692
 */
public class A7Q7 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        //creates the array with 1000 spots
        int[] sieveOfEratosthenes = new int[1001];
        //loops 1000 times
        for (int i = 2; i < 1001; i++) { 
            //i is equal to sieveOfEratosthenes and the spot in the array
            sieveOfEratosthenes[i]=i;
        }

        //Creates the int temp
        int temp = 0;
        //performs loop 999 times
        for (int prime = 2; prime < 1000; prime++) { 
            //performs loop 999 times
            for (int i = 2; i < 1000; i++) { 
                //temp is equal to prime times x
                temp = prime * i;
                //if temp is less than 1001
                if (temp < 1001) {
                    //sieveOfEratosthenes[temp] is equal to temp times -1
                    sieveOfEratosthenes[temp] = temp * -1; 
                }
            }
        }
        //outputs "The prime numbers are: "
        System.out.println("The prime numbers are: ");
        //performs loop 999 times
        for (int i = 0; i < 1000; i++) {
            //if sieveOfEratosthenes[i] is greater than 0
            if (sieveOfEratosthenes[i] > 0) {
                //then it out puts the sieveOfEratosthenes with the array
                System.out.println(sieveOfEratosthenes[i]); 
            }
        }
    }
}
