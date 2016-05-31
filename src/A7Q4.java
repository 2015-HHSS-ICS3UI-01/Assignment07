
import java.util.Scanner;

/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
/**
 *
 * @author farrb0382
 */
public class A7Q4 {

    public static void main(String[] args) {        // main method 

        Scanner input = new Scanner(System.in);     // creating the scanner

              // the integer or order is equal to int 10

        int c = 10;     // the integer c is equal to 10

        int order[] = new int[c];       // the array order is equal to c's value
        
        System.out.println("What are the 10 marks?");       // asking for the 10 marks
        for (int i = 0; i < c; i++) {            // inputting the marks into a for loop
        order[i] = input.nextInt();                  // inputting the marks               
        }

        for (int i = 0; i < 10; i++) {      // for loop
            for (int a = 0; a < 10 - i - 1; a++) {      // for loop

                if (order[a] > order[a + 1]) {      // if this is true do the following (sorting through the numbers arranging them)
                    c = order[a];       // the c int is equal to the array order               
                    order[a] = order[a + 1];        // the order is equal to the order + 1
                    order[a + 1] = c;       // the final value is equal to the int c
                }
            }
        }
        System.out.println("The marks in ascending order are: ");       // saying the final numbers in order are...
        for (int i = 0; i < 10; i++)        // for loop
            System.out.println(order[i]);       // outputting the final list of numbers in the correct order
        
    }
}