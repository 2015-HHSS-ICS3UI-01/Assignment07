
import java.util.Scanner;

/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
/**
 *
 * @author kangh4484
 */
public class Q7A3 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        //ask user to put 2 integers
        System.out.println("Enter two integers");
        int[] integers = new int[2];
        for (int i = 0; i < integers.length; i++) {
            //record them
            integers[i] = input.nextInt();
            integers[i + 1] = input.nextInt();
            //print out number in ascending order
            if (integers[0] > integers[1]) {
                System.out.println("The integers in ascending order are: " + integers[1] + ", " + integers[0]);
            } else {
                System.out.println("The integers in ascending order are: " + integers[0] + ", " + integers[1]);
            }
        }
    }
}