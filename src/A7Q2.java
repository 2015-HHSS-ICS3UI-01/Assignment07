/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */


import java.util.Scanner;

/**
 *
 * @author dhalt0019
 */
public class A7Q2 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Scanner input = new Scanner(System.in);
        System.out.println("How many people are being measured?");
        int people = input.nextInt();
        // make a variable to store the heights
        int[] height = new int[people];

        // let the user enter enter in the heights as long as i is greater or equal to the number of people
        for (int i = 0; i < height.length; i++) {

            System.out.println("Please enter the height of everyone");

            height[i] = input.nextInt();

        }

        int total = 0;
        for (int i = 0; i < height.length; i++) {

            total = total + height[i];
        }

        int average = total / people;

        for (int i = 0; i < height.length; i++) {

            if (height[i] < average) {

                System.out.println("Heights that are below average are " + height[i]);
            }
        }
    }
}