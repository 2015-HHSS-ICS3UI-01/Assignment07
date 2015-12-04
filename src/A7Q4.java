
import java.util.Scanner;

/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
/**
 *
 * @author sevcm7279
 */
public class A7Q4 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        //create a scanner
        Scanner input = new Scanner(System.in);

        //create an array
        int[] marks = new int[4];

        //create a loop to enter the marks
        for (int e = 0; e < marks.length; e++) {
            System.out.println("Please enter a mark.");
            marks[e] = input.nextInt();
        }
        //create a loop to check every number in array
        for (int i = 0; i < marks.length - 1; i++) {

            for (int a = i + 1; a < marks.length; a++) {
                int x = marks[i];
                int y = marks[a];

                if (marks[i] > marks[a]) {
                    marks[i] = y;
                    marks[a] = x;
                }
            }
        }

        System.out.println("");
        for (int o = 0; o < marks.length; o++) {
            System.out.println(marks[o]);

        }

    }
}
