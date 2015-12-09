
import java.util.Scanner;

/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author whitb0039
 */
public class A7Q3 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        
        //inport a scanner
        Scanner in = new Scanner(System.in);
        
        //create array
        int[] A = new int[2];
        
        //ask user for the first number
        System.out.println("Please enter the two numbers");
        
        //assign the next input to A[1]
        A[0] = in.nextInt();

        //assign the next input to A[2]
        A[1] = in.nextInt();
        
        if (A[0] < A[1]){ //if the first number is greater than the second number
            //output the second number before the first
            System.out.println("The integers in ascending order are: " + A[0] + ", " + A[1]);
        }else{ //otherwise
            //output the first number first
            System.out.println("The integers in ascending order are: " + A[1] + ", " + A[0]);
        }
    }
    
}
