
import java.util.Scanner;

/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
/**
 *
 * @author halll7908
 */
public class A7Q5 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Scanner input = new Scanner(System.in);

        System.out.println("How many marks are being entered?");
        int marksNum = input.nextInt();
        int marks[] = new int[marksNum];

        System.out.println("Please enter the " + marksNum + " marks on separate lines.");
        for (int i = 0; i < marks.length; i++) { // set array's variable values
            marks[i] = input.nextInt();
        }

        // code comparing the smallest
        for (int ii = 0; ii < marks.length; ii++) {
            for (int i = 0; i < (marksNum - 1); i++) {
                int nxt = i + 1; // takes next variable
                int order; // holds variable
                if (marks[i] > marks[nxt]) { // ascending sort
                    order = marks[i]; // swap elements
                    marks[i] = marks[nxt];
                    marks[nxt] = order;
                }
            }
        }

        // print out in ascending order
        System.out.println("Least to Greatest: ");
        for (int asc = 0; asc < marksNum; asc++) {
            System.out.println(marks[asc]);
        }

        System.out.println("The median is: "); // calculate the median
        if (marks.length % 2 == 0) { // check if there is an even or odd amt. of ints
            // EVEN
            int mid = marks[(marksNum / 2)];
            int mid2 = marks[(marksNum / 2) - 1];
            double median = ((mid + mid2) / 2.0);
            System.out.println(median);
        } else {
            // ODD
            int median = marks[(marksNum / 2)];
            System.out.println(median);
        }
    }
}
