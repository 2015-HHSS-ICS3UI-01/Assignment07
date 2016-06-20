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
public class A7Q2 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        //input scanner
        Scanner input = new Scanner(System.in);

        //ask user to enter nu,ber of people being measured
        System.out.println("Please enter the number of people being measured");
        int n = input.nextInt();

        // double to store heights
        int[] heights = new int[n];

        // loop, ask user to enter all heights
        for (int i = 0; i < heights.length; i++) {
            System.out.println("Please enter the height in centimetres.");
            heights[i] = input.nextInt();
        }
        //calculate the average height
        int total = 0;
        for (int i = 0; i < heights.length; i++) {
            total = total + heights[i];

        }

        int average = total / n;

        System.out.println("The heights that are higher than average are,");

        for (int i = 0; i < heights.length; i++) {
            if (heights[i] > average) {
                System.out.println(heights[i]);
            }
        }}}
    


    

