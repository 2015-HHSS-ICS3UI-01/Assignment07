
import java.util.Scanner;

/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
/**
 *
 * @author kulla6503
 */
public class A7Q4 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // create a scanner
        Scanner in = new Scanner(System.in);

        // to make an array of int
        int[] aryNums = new int[10];

        // User Enters 2 numbers
        System.out.println("Enter the 10 Grades: ");

        // To determine the population of the array
        for (int i = 0; i < 10; i++) {
            //
            int grade = in.nextInt();
            aryNums[i] = grade;
        }

        // Used to put the numbers in accending order
        for (int order = 0; order < 10; order++) {
            // Putting each specific number in accending with the number after it
            for (int i = 0; i < 9; i++) {

                // The number after the previous number that is being swapped
                int nextNum = i + 1;
                
                // The new number in the proper accending form
                int newNum;

                // Used to swap the two 
                if (aryNums[i] > aryNums[nextNum]) {
                    newNum = aryNums[i];
                    aryNums[i] = aryNums[nextNum];
                    aryNums[nextNum] = newNum;
                }
            }
        }
        // Output our sentence to the user letting them know what they entered
        System.out.println("The Marks in accending order are: ");
        
        // Used to print out the numbers in proper accending order
        for (int accending = 0; accending < 10; accending++) {
            System.out.println(aryNums[accending]);
        }



    }
}
