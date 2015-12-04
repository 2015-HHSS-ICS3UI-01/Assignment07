
import java.util.Scanner;

/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
/**
 *
 * @author sevcm7279
 */
public class A7Q5 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        //create a scanner
        Scanner input = new Scanner(System.in);

        //tell the user to enter the number of students
        System.out.println("Enter the number of marks.");
        int k = input.nextInt();

        //create an array
        int[] marks = new int[k];

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
        //determine the median
        //if k has more than one digit
        if (k < 9) {
            int q = 10 % k;
            //if k is even, find the avergae between the middle marks
            if (q == 0 || q == 2 || q == 4 || q == 6 || q == 8) {
                int mediaOne = marks[k / 2];
                int mediaTwo = marks[(k / 2) - 1];
                double media = mediaTwo / mediaOne;
                System.out.println("The media is " + media);
                //if k is odd, find the middle mark
            } else {
                int median = marks[k / 2];
                System.out.println("The median is " + median);
            }
        //if k has one digit
        } else if (k >= 9) {
            int q = k;

            //if k is even, find the avergae between the middle marks
            if (q == 0 || q == 2 || q == 4 || q == 6 || q == 8) {
                int mediaOne = marks[k / 2];
                int mediaTwo = marks[(k / 2) - 1];
                double media = mediaTwo / mediaOne;
                System.out.println("The media is " + media);
                //if k is odd, find the middle mark
            } else {
                int median = marks[k / 2];
                System.out.println("The median is " + median);

            }
        }
    }
}
