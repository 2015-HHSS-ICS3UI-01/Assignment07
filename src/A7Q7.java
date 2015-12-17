
import java.util.Scanner;

/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
/**
 *
 * @author kulla6503
 */
public class A7Q7 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // create a scanner
        Scanner in = new Scanner(System.in);

        
        // an initial variable set as 0
        int zeroNum = 0;

        
        // Scanner has to scan 1000 numbers 
        int[] aryNum = new int[1001];

        
        // Each number has a specific array
        for (int i = 0; i <= 1000; i++) {
            aryNum[i] = i;
        }
        
        // Output our sentence to the user letting them know what they entered
        System.out.println("All the Prime Numbers from 2 to 1000");

        
        // Loop used to make sure the numbers are factored out of the following 
        for (int Prime = 2; Prime <= 1000; Prime++) {

            
            // a counted loop used for adjusting/adding increments to number
            for (int factor = 0; factor <= 1000; factor = Prime + factor) {

                
                // making variable for the intial result 
                int result = aryNum[Prime];

                
                // Each array gets a value 
                aryNum[factor] = factor;

                
                // An if condition stating anything over the inital value (temp) becomes zero.    
                if (aryNum[factor] >= result) {
                    aryNum[factor] = zeroNum;
                }
                
                // Prints out the intial numbers
                if (aryNum[Prime] != 0) {
                    System.out.println(result);
                }
            }
            
            // Prints out the numbers that arnt zero
        }
        for (int i = 2; i < 1000; i++) {
            if (aryNum[i] != 0) {
                System.out.print(aryNum[i] + ",");
            }
        }








    }
}
