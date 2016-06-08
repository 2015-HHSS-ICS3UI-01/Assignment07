/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */


import java.util.Scanner;

/**
 *
 * @author dhalt0019
 */
public class A7Q3 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here        
        Scanner input = new Scanner(System.in);
        // variable to store 2 numbers
        int [] num = new int[2];
        // ask the user for two integers and let them input them
        for (int i = 0; i < num.length; i++) {
            
            System.out.println("Please enter two integers");
            
            num[i] = input.nextInt();
        }
        // if the number in spot 0 is greater then the number in spot 1, swap the two
        if (num[1] < num[0]){
            // create a variable for spot 1
            int order = num[1];
            // spot 1 equals spot 0
            num[1]= num[0];
            // spot 0 equals the variable, order
            num [0] = order;
            
        }
        // tell them the ascending order of numbers
        System.out.println("The numbers in ascending order are " + num[0] + "," + num[1]);
    }
}
