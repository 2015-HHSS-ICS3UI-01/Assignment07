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
public class A7Q4 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        //input scanner
        Scanner input = new Scanner(System.in);
    
        //create an array
        int[] m = new int[10];

        //create a loop to enter marks
        for (int i = 0; i < m.length; i++) {
            System.out.println("Enter a mark");
            m[i] = input.nextInt();
        }
        //loop for every number 
        for (int a = 0; a < m.length - 1; a++) {


            for (int e = a + 1; e < m.length; e++) {
                int x = m[a];
                int y = m[e];

                if (m[a] > m[e]) {
                    m[a] = y;
                    m[e] = x;
                }
            }
        }
        System.out.println("");
        for (int t = 0;  t < m.length; t++) {
            System.out.println(m[t]);
        }
    }
}
