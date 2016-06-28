
import java.util.Scanner;

/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
/**
 *
 * @author pintm1551
 */
public class A7Q4 {

    public static void main(String[] args) {
        System.out.println("Input 10 elements");                                //Asks to input elements
        Scanner input = new Scanner(System.in);                                 //Create Scanner
        int[] A = new int[10];                                                  //creates array with 10 values
        int c = 10;                                                             //creates a count
        while (c > 0) {
            c = c - 1;                                                          //counts                                    
            A[c] = input.nextInt();                                             //assignes array values
        }
        boolean s = false;                                                      //sets sorted to false
        int x = 0;                                                              //sets variables to 0
        int y = 0;
        while (s == false) {                                                    //while array isnt sorted
            s = true;                                                           //set sorted to true
            c = 10;                                                             //resets count
            while (c > 1) {                                                     //while count is greater then 1
                c = c - 1;                                                      //counts down
                if (A[c] > A[c - 1]) {                                          //swaps variables if they are out of order
                    x = A[c];
                    y = A[c - 1];
                    A[c] = y;
                    A[c - 1] = x;
                    s = false;                                                  //if it has to swap variables then it isnt sorted
                }
            }
        }
        System.out.println("The elements in order are: ");                      //prints elements back in order
        c = 10;
        while (c > 0) {
            c = c - 1;
            System.out.println(A[c]);
        }
    }
}
