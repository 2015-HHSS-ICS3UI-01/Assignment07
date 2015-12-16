
import java.util.Scanner;

/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author snowc4636
 */
public class A7Q3 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // input a scanner
        Scanner input = new Scanner(System.in);
        
        int [] number = new int [2];
        // enter the first integer
        System.out.println(" Please enter a random integer ");
        int one = input.nextInt();
        // enter the second integer
        System.out.println(" Please enter another random integer ");
        int second = input.nextInt();
        // if one is less than two input this
        if( one < second){
            System.out.println(" The integers in rising order is: " + one + "," + second);
            // if one is more than two than input this
        }else if (one > second){
            System.out.println(" The integers in rising order is: " + second + "," + one);
        }
            
    }
}
