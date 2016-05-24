
import java.util.Scanner;

/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
/**
 *
 * @author pintm1551
 */
public class A7Q3 {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);                                 //Create Scanner
        int[] A = new int[2];                                                   //creates array with 2 values
        int c = 2;                                                              //creates a count variable
        System.out.println("Input elements");                                   //asks to input elements
        while (c > 0) {                                                         //creates count
            c = c - 1;
            A[c] = input.nextInt();
        }
        if (A[1] > A[2]) {                                                      //if element 1 is greater
            System.out.println(A[1]);                                           //element 1 first
            System.out.println(A[2]);
        } else {
            System.out.println(A[2]);                                           //else element 2 goes first
            System.out.println(A[1]);
        }
    }
}
