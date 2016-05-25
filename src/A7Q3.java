
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
public class A7Q3 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here

        //Create an integer to store two variables
        int[] digits = new int[2];

        //Create a new scanner to recieve input 
        Scanner input = new Scanner(System.in);
        {
            //as long as r is grater les than the amout of spaces avalible in nuimbers allow user to enter a number 
            //When r < the number of spaces in the numbers allow the input of a number
            for (int r = 0; r < digits.length; r++) {
                //Ask the person to input two numbers
                System.out.println("Please enter two numbers");
                //Allow input of numbers
                digits[r] = input.nextInt();

            }
            //If the number in the first position is > the number in the second position, interchange the two
            if (digits[0] > digits[1]) {
                //Create variable to store number in the first position 
                int secondNum = digits[1];
                //Make the number in the second position equal to that of the first position
                digits[1] = digits[0];
                //Make the number in the first position equal to the number in the second postiotn
                digits[0] = secondNum;

            }
            //Output the numbers fron least to greatest 
            System.out.println("The numbers from least to greatest are " + digits[0] + ", " + digits[1]);
        }

    }

}
