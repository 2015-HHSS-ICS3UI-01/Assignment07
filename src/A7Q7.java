
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
public class A7Q7 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // Why can't we just use remainders and a while loop to find prime numbers
        // Plan is to find first multiples of numbers < 10 and cross out those multiples over 10, then print out whats left.
        Scanner in = new Scanner(System.in);
        
        int zero = 0;
        int[] array = new int [1001];
        
        for(int i = 0; i <= 1000; i++ ){
            array[i] = i;
            System.out.println(array[i]);
        }
        
        int i = 2;
        for( i = 2; i <= 1000; i++ ){
            for(int multiples = 2; multiples <=1000; ){
                multiples = i + multiples;
            array[i] = multiples;
            System.out.println(array[i]);
            }
         
           
        }
        }
           
        }
    
    

