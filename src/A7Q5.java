
import java.util.Scanner;

/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
/**
 *
 * @author farrb0382
 */
public class A7Q5 {

    public static void main(String[] args) {        // main method

        Scanner input = new Scanner(System.in);     // creating scanner
        int swap;       // creating the integer swap
        System.out.println("How many marks will there be?");        // asking for the number of marks
        int c = input.nextInt();        // inputting the number of marks
        int order[] = new int[c];       // the array order is equal to the integer c 

        System.out.println("What are the marks?");      // asking for the marks
        for (int i = 0; i < c; i++) {       // for loop - do the following 
            order[i] = input.nextInt();     // inputting the marks into the array 
        }

        for (int i = 0; i < c; i++) {       // for loop - do the following 
            for (int a = 0; a < c - i - 1; a++) {       // for loop - do the following        

                if (order[a] > order[a + 1]) {      // if this is true do the following 
                    swap = order[a];        // the swap integer is equal to the order[a]
                    order[a] = order[a + 1];        // order[a] is equal to order[a + 1]
                    order[a + 1] = swap;        // the final value is equal to the integer swap
                }
            }
        }
        System.out.println("The marks in ascending order are: ");       // outputting the marks in ascending order
        for (int i = 0; i < c; i++)     // for loop - do the following      
            System.out.println(order[i]);       // output the marks in ascending order

        System.out.print("The median is: ");        // output the medium after the following is finished 
        if (order.length % 2 == 0) {        // if the numbers are even do the following 
            int mid = order[c / 2];     // divide array by 2
            int mid2 = order[mid - 1];      // take the number below it         
            double median = ((c / 2 + mid2) / 2.0); // add them together then divide by 2
            System.out.println(median);     // output the final median
        } else {        // if that isnt the case do the following 
            int median = order[c / 2];      // if the number of marks is odd
            System.out.println(median);     // output the middle number (median)            
        }
    }
}
