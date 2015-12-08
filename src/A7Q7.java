/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author sevcm7279
 */
public class A7Q7 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {

        //create a boolean array
        boolean[] prime = new boolean[1001];

        //make all of the numbers in the array true
        for (int e = 0; e < 1001; e++) {
            prime[e] = true;
            }
        
        for (int p = 2; p < 1001; p++){
            for (int i = 2*p; i < prime.length; i = i + p){
                prime[i] = false;
            }
        }for (int r = 2; r < 1001; r++){
            if (prime[r] == true){
                System.out.println(r);
            }
        }
        
        
        
            }
        }
    

