
import java.util.Scanner;

/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author richj0985
 */
public class A7Q3 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // create a scanner for input
        Scanner input = new Scanner(System.in);
        
        double[] aryA = new double[2];
        
        System.out.print("Enter to integers to sort in acsending order:");
        aryA[0] = input.nextInt();
        aryA[1] = input.nextInt();
        double temporaryA = aryA[0];
        
        if(aryA[0] > aryA[1]){
            aryA[0] = aryA[1];
            aryA[1] = temporaryA;
        }
        
        System.out.println("The numbers in ascending order are " + aryA[0] + aryA[1]);
    }
}
