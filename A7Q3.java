/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package arrays;

import java.util.Scanner;

/**
 *
 * @author godie2014   
 */
public class A7Q3 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
//input scanner
        Scanner input = new Scanner(System.in);

//tell user to enter an integer
        System.out.println(" Please enter an integer");
        int i = input.nextInt();
        // tell user to enter another integer
        System.out.println("Please enter another integer");
        int ii = input.nextInt();

        int[] n = new int[2];

        n[0] = i;       
        n[1] = ii;    

        //create a loop
        if (n[1] > n[0]) {
            n[0] = ii;
            n[1] = i;
            System.out.println(n[0]);
            System.out.println(n[1]);

        } else {
            if (n[0] > n[1]) {
                //tell user the integers in assending order
                System.out.println("The integers in assending order are:");
                System.out.println(n[0]);
                System.out.println(n[1]);
           

            }
        }
    }
}
