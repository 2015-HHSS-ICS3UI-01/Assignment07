
import java.util.Scanner;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
/**
 *
 * @author RARES
 */
public class A7Q4 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here

        //Create a scanner to recieve input
        Scanner input = new Scanner(System.in);

        //Make the amount of numbers equal to the amount of numbers that are inputed
        int[] digits = new int[10];

        //When r < the number of spaces in the numbers allow the input of a number
        for (int r = 0; r < digits.length; r++) {
            //Ask for the marks
            System.out.println("Please enter the marks ");
            //Allow input of numbers
            digits[r] = input.nextInt();

        }

        //Create a loop that that repeats as long as x < 9
        for (int a = 0; a < 9 - 1; a++) {
            //The y integer begins above the x variable as long as x < 9
            for (int b = a + 1; b < 10; b++) {
                if (digits[a] > digits[b]) {
                    //Make an integer to store the number for y
                    int secondNum = digits[b];
                    //Set number in the y location equal to the one in the x location
                    digits[b] = digits[a];
                    //Make the number in spot x to the secondNum integer  
                    digits[a] = secondNum;

                }
            }
        }
        //Output the numbers from least to greatest
        System.out.println("The numbers in ascending order are");
        for (int i = 0; i < digits.length; i++) {
            System.out.println(digits[i]);
        }
    }

}
