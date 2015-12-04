
import java.util.Scanner;

/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
/**
 *
 * @author sevcm7279
 */
public class A7Q6 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        //create a scanner
        Scanner input = new Scanner(System.in);

        //user input class size
        System.out.println("Enter the size of the class.");
        int c = input.nextInt();

        //create an array
        int[] classMarks = new int[c];

        //create a loop to enter marks in the array
        for (int e = 0; e < classMarks.length; e++) {
            System.out.println("Please enter a mark.");
            classMarks[e] = input.nextInt();

        }
        //order the marks from lowest to highest
        for (int i = 0; i < classMarks.length - 1; i++) {

            for (int a = i + 1; a < classMarks.length; a++) {
                int x = classMarks[i];
                int y = classMarks[a];

                if (classMarks[i] > classMarks[a]) {
                    classMarks[i] = y;
                    classMarks[a] = x;
                }
            }
        }
        //find the highest mark
        int highestMark = classMarks[classMarks.length];
        System.out.println("The highest mark in the class is " + highestMark);
    }
}
