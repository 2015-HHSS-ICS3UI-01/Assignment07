/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package arrays;

/**
 *
 * @author godie2014
 */
public class A7Q7 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        
   // boolean array
       boolean[] prime = new boolean[1001];


       // numbers in array are true


       for (int a = 0; a < 1001; a++) {

           prime[a] = true;


           }   

       for (int p = 2; p < 1001; p++){  
           for (int r = 2*p; r < prime.length; r = r + p){


               prime[r] = false;


           }


       }for (int r = 2; r < 1001; r++){


           if (prime[r] == true){


               System.out.println(r);


           }


       }




    }}
