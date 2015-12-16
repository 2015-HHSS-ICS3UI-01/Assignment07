
import java.util.Scanner;

/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author snowc4636
 */
public class A7Q7 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // Input a scanner
        Scanner input = new Scanner(System.in);
        
        
        // how many slots you want in the array
        boolean [] prime = new boolean [1001];
        // find if it is true
        for(int pos = 0; pos < 1001; pos++){
            prime[pos] = true;
            
        }
        // see if the number is even
        for(int number = 2; number <= 1000; number = number +1){
            
            
            if(prime[number] == true){
                
       // see if you multiply them it equals a non prime number        
       for(int pri = 2; number*pri <= 1000; pri = pri + 1){
           prime[number * pri] = false;
       }         
            }
        
    }
        // it is a prime number
        for(int multiple = 2; multiple <= 1000; multiple = multiple +1){
            if(prime[multiple] == true){
                System.out.println(multiple);
            }
        }
    }
}
