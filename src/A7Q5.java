
import java.util.Scanner;

/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
/**
 *
 * @author rahmf8586
 */
public class A7Q5 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Scanner input = new Scanner(System.in);

        System.out.println("How many people in the group?");
        int ppl = input.nextInt();

        int marks[] = new int[ppl];

        System.out.println("What are their marks:");

        for (int i = 0; i < marks.length; i++) {
            marks[i] = input.nextInt();
        }

        boolean flag = true;
        int num;

        while (flag == true) {
            flag = false;
            for (int i = 0; i < marks.length - 1; i++) {
                if (marks[i] > marks[i + 1]) {
                    num = marks[i];
                    marks[i] = marks[i + 1];
                    marks[i + 1] = num;
                    flag = true;
                }
            }
        }
        System.out.println("The marks in ascending order are:");
        for (int i = 0; i < marks.length; i++) {
            System.out.println(marks[i]);
        }

        if ((ppl % 2) != 0) {
            System.out.println("The median is " + marks[marks.length / 2]);
        }

        if ((ppl % 2) == 0) {
            int mid = marks.length / 2;
            int mid2 = mid - 1;
            double median = (marks[mid] + marks[mid2] * 1.0) / 2.0;
            System.out.println("The median is " + median);
        }
    }
}