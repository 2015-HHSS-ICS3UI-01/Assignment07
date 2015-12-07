
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
        
        for(int i=0;i<sieve.length;i++){
            sieve[i]=true;
        }
        
        for (int x = 2; x < sieve.length; x++) {
            for (int y = 2*x; y < sieve.length; y = y + x) {
                sieve[y]=false;
                }

            }
        for(int i=2;i<sieve.length;i++){
            if(sieve[i]==true){
                System.out.println(i);
            }
            
        }
        
        
        }
    }

