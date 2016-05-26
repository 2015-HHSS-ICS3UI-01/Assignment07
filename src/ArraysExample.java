
import java.util.Scanner;

/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
/**
 *
 * @author tatad6701
 */
public class ArraysExample {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // Create new scanner
        Scanner input = new Scanner(System.in);
        // Make an integer array size of 5
        int[] marks = new int[5];
        int[] outOf = new int[5];

//        System.out.println("What did you get?");
//        marks[0] = input.nextInt();
//        System.out.println("What was it out of?");
//        outOf[0] = input.nextInt();
// 
//        System.out.println("What did you get?");
//        marks[1] = input.nextInt();
//        System.out.println("What was it out of?");
//        outOf[1] = input.nextInt();
        // For loop to go through array 
        for (int i = 0; i < marks.length; i++) {
            System.out.println("What was test " + (i + 1) + " out of?");
            outOf[i] = input.nextInt();
            System.out.println("What was your mark?");
            marks[i] = input.nextInt();
        }
        int total = 0;
        // Calculating each test average 
        // Outout test results to screen
        for (int i = 0; i < marks.length; i++) {
            int avg = marks[i] * 100 / outOf[i];
            total = total + avg;
            System.out.println("Test " + (i + 1) + ":" + avg + "%");
        }
        System.out.println("Overall Average: " + (total / marks.length) + "%");
    }
}
