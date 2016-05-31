
import java.util.Scanner;

/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
/**
 *
 * @author farrb0382
 */
public class A7Q2 {

    public static void main(String[] args) {    // main method

        Scanner input = new Scanner(System.in);     // creating the scanner

        System.out.println("How many heights will be compared?");   // asking for the heights 
        int n = input.nextInt();        // inputting the integer for the number of heights
        int[] heights = new int[n];     // the array is equal to the number of heights 

        System.out.println("Enter the heights.");       // asking for the actual heights 

        for (int i = 0; i < heights.length; i++) {      // for loop adding +1 each time 
            heights[i] = input.nextInt();       // inputting the heights as many times until the inputs = n
        }

        int total = 0;      // the total is 0 initially 
        for (int i = 0; i < heights.length; i++) {      // for loop adding +1 each time 
            total = total + heights[i];     // the total is equal to 0 + the heights previously entered 
        }

        total = total / n;      // the total is equal to the previous total divided by the number of heights entered 
        System.out.println("The average  of all the heights are " + total + ".");       // outputting the average of all the heights 

        for (int i = 0; i < heights.length; i++) {      // for loop adding +1 each time 
            if (heights[i] > total) {       // if the heights values are more then the average output the heights that are above it 
                System.out.println("The heights that are above average are " + heights[i] + ".");       // outputting the heights that are above the average 
            }
        }
    }
}