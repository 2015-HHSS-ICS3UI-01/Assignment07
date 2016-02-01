
import java.util.Scanner;

/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
/**
 *
 * @author fitws6356
 */
public class A7Q3 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        //user will enter two integers
        System.out.println("Enter an integer.");
        int integers = input.nextInt();
        System.out.println("Enter a second integer.");
        int integers2 = input.nextInt();
        //create program that checks if a number is higher than the other
        int[] arrays = new int[integers + integers2];
        if (integers >= integers2) {
            System.out.println("Integers in ascending order: " + integers2 + " " + integers);
        } else if (integers2 >= integers) {
            System.out.println("Integers in ascending order: " + integers + " " + integers2);
        } else if (integers <= -1) {
            System.out.println("Integers in ascending order: " + integers + " " + integers2);
        
        } else if (integers2 <= -1) {
            System.out.println("Integers in ascending order: " + integers2 + " " + integers);
        } 

    }
}
