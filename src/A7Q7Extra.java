
import java.util.Scanner;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Administrator
 */
public class A7Q7Extra {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        //generates a scanner
   Scanner in = new Scanner(System.in);
   
        // an initial variable set as 0
        int zero = 0;
        // there are 1000 numbers to scan through ( java reads 1000 as 1001 because of 0 being first)
        int[] array = new int [1001];
        
        // A counted loop that assigns every number to a certain array (e.g array[34] takes 34)
        for(int i = 0; i <= 1000; i++ ){
            array[i] = i;
        }
        
        System.out.println("The prime numbers in range of 2-1000..");
        
        //A counted loop used for increment that goes up to 31 to ensure EVERY number won't have multiples other than itself
        for( int p = 2; p <= 31; p++ ){
            // a counted loop used for adjusting/adding increments to number
            for(int multiples = 0; multiples <=1000;multiples = p + multiples){
                // A handy dandy tip Mr Lamont taught me, having increment itself as an inital value
                int temp = array[p];
                // assigns the adjusted values to the arrays
            array[multiples] = multiples;
            
            // An if condition stating anything over the inital value (temp) becomes zero.    
            if(array[multiples] >= temp){
                array[multiples] = zero;
            }
            // Prints out the inital increments (e.g 2,3,5...)
            if(array[p] != 0){
                System.out.println(temp);}
          
            }
        // a counted loop printing out every number that wasn't converted to zero (e.g 101, 211.. so on)
        }for(int i = 2; i < 1000; i++){
             if(array[i] != 0){
                System.out.println(array[i]);
             }
    }
}
}


        
