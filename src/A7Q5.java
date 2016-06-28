
import java.util.Scanner;

/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
/**
 *
 * @author pintm1551
 */
public class A7Q5 {

    public static void main(String[] args) {
        System.out.println("How many elements are there to sort");              //Asks to input number of elements
        Scanner input = new Scanner(System.in);                                 //Create Scanner
        int n = input.nextInt();                                                //recieves number of elements
        System.out.println("Insert " + n + " elements");                        //Asks to input elements
        int[] A = new int[n];                                                   //creates array with n values
        int c = n;                                                              //creates a count
        while (c > 0) {
            c = c - 1;                                                          //counts                                    
            A[c] = input.nextInt();                                             //assignes array values
        }
        boolean s = false;                                                      //not sorted
        int x = 0;                                                              //assignes variables as 0
        int y = 0;
        while (s == false) {                                                    //while not sorted
            s = true;                                                           //sets to sorted
            c = n;                                                              //resets count to n
            while (c > 1) {                                                     //goes through array
                c = c - 1;
                if (A[c] > A[c - 1]) {                                          //swaps values
                    x = A[c];
                    y = A[c - 1];
                    A[c] = y;
                    A[c - 1] = x;
                    s = false;                                                  //if a value was sorted then it sets the array as unsorted
                }
            }
        }
        System.out.println("The elements in order are: ");                      //prints elements back in order
        c = n;
        while (c > 0) {
            c = c - 1;
            System.out.println(A[c]);
        }
        System.out.println("The median is: ");                                  //gets median
        double m = 0;                                                           //median value        
        if ((n % 2) > 0) {                                                      //checks for odd/even
            n = n / 2;                                                          //if odd prints middle number
            System.out.println(A[n]);
        } else {                                                                //if even averages middle numbers
            m = m + A[n / 2];
            m = m + A[(n / 2) - 1];
            m = m / 2;
            System.out.println(m);
        }
    }
}
