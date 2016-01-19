
import java.util.Scanner;

/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author watsk8668
 */
public class A7Q7 {
    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // import scanner
        Scanner input = new Scanner(System.in);
        
        // how many numbers?
        System.out.println("Enter how many numbers: ");
        int amount = input.nextInt();
        
        //create an array
        boolean[] n = new boolean[amount];
        //mark number 1 as false
        n[0] = false;
        
        //add the numbers to the array
        //mark all as true
        for (int p = 1; p < amount; p++) {
            n[p] = true;
        }
        
        //count up in increments of p and mark each of these numbers greater than p
        for (int p = 2; p <= amount; p++) {
            
            //if the number hasnt been crossed off
            if(n[p-1] == true){
                //if it is a prime number print it to the screen
                System.out.println(p);
                
                //cross off multiples of p
                for(int i = p*p; i <= amount; i += p){
                    n[i-1] = false;
                }
            }
        }
    }
}