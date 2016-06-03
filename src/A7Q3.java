
import java.util.Scanner;

/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
/**
 *
 * @author howen2217
 */
public class A7Q3 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        //input the two intgers
        Scanner input = new Scanner(System.in);
        int[] A = new int[2];
        for (int i = 0; i < A.length; i++) {
            System.out.println("Enter an interger " + (i + 1));
            A[i] = input.nextInt();
        }
        //change the order of integers
        if (A[0] > A[1]) {
            int greater = A[1];
            A[1] = A[0];
            A[0] = greater;
        }
        //output integers
        System.out.println("The intergers in ascending order are " + A[0] + " " + A[1]);



    }
}
