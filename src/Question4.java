
import java.util.Scanner;

/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author agott2059
 */
public class Question4 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        //create scanner
        Scanner input = new Scanner(System.in);
        //get 10 marks from user
        System.out.println("Enter 10 marks: ");
        //create array that holds 10 integers
        int[] marks = new int[10];
        //populate array using input from user (for loop goes through every spot in array)
        for (int i = 0; i < 10; i++) {
            marks[i] = input.nextInt();
        }
        /*use loop to go through all 10 marks 10 times (moving up a space in the array  
        each time to rearrange all the marks in ascending order*/
        for (int i = 0; i < 10; i++) {
            for (int k = 0; k < 10; k++) {
                int x = marks[i];
                int y = marks[k];

                if (marks[i] < marks[k]) {
                    marks[i] = y;
                    marks[k] = x;
                }
            }
        }
        //output numbers in ascending order (output the array using loop)
        System.out.println("Marks in increasing order are: ");
        for (int i = 0; i < 10; i++) {
            System.out.println(marks[i]);
        }
    }
}
