
import java.util.Scanner;

/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author pircn0556
 */
public class A7Q7 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        //create scanner
        Scanner input = new Scanner(System.in);
        
        //create array
        boolean[]sieve=new boolean[1001];
        
        //make all numbers true
        for(int i=0;i<sieve.length;i++){
            sieve[i]=true;
        }
        
        //check which numbers are false
        for (int x = 2; x < sieve.length; x++) {
            for (int y = 2*x; y < sieve.length; y = y + x) {
                sieve[y]=false;
                }

            }
        //output all true numbers
        for(int i=2;i<sieve.length;i++){
            if(sieve[i]==true){
                System.out.println(i);
            }
            
        }
        
        
        }
    }

