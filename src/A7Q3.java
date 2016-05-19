
import java.util.Scanner;

/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
/**
 *
 * @author halll7908
 */
public class A7Q3 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Scanner input = new Scanner(System.in);

        int[] A = new int[2]; // create array with two int elements *count from 0, not including 3
        
        System.out.println("Please enter the two integers on separate lines.");
        for (int i = 0; i < A.length; i++) {
          A[i] = input.nextInt();  // set variable values
        }
        
        // sort if not in ascending order already
        if (A[1] < A[0]) {
            int a0 = A[0];
            int a1 = A[1];
            A[1] = a0;
            A[0] = a1;
        }
        
        // output variable in correct order
        System.out.println("The integers in ascending order are: " + A[0] + ", " + A[1]);
    }
}
