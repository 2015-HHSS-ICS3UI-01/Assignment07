
import java.util.Scanner;

/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
/**
 *
 * @author farrb0382
 */
public class A7Q3 {

    public static void main(String[] args) {

        int numbers[] = new int[2];

        Scanner input = new Scanner(System.in); // inputting the scanner 

        System.out.println("Input the two integers.");      // asking for the two integers

        for (int i = 0; i < numbers.length; i++) {      // for loop
            int order = input.nextInt();        // inputting the integers 
            numbers[i] = order;                 // the array numbers[i] is equal to the input of order
        }

        if (numbers[0] > numbers[1]) {      // if number 1 is more then 2 do the following (takes the numbers if they are out of order and flips them around)
            int alternate = numbers[0];     // integer alternate is equal to the first number
            numbers[0] = numbers[1];        // the first number is equal to the second number
            numbers[1] = alternate;         // the second number is equal to the value of the integer alternate
        }

        System.out.println("The integers in ascending order are: ");        // telling the user the numbers are...
        for (int i = 0; i < numbers.length; i++) {      // for loop
            System.out.println(numbers[i]);     // outputting the numbers that were inputted in the correct order
        }
    }
}
