/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package assignment07;

import java.util.Scanner;

/**
 *
 * @author fostp4040
 */
public class A7Q3 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Scanner input = new Scanner(System.in);
        System.out.print("Enter two integers:");
        int[] A=new int[2];
        for(int i=0; i<2; i++){
            A[i]=input.nextInt();
        }
        if(A[0]<A[1]){
          System.out.print("The integers in ascending order are: "+A[0]+" "+A[1]);   
        }else
            System.out.print("The integers in ascending order are: "+A[1]+" "+A[0]); 
        
    }
}
