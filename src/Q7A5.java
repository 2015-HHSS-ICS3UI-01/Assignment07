
import java.util.Scanner;

/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
/**
 *
 * @author kangh4484
 */
public class Q7A5 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        while (true) {
            //ask number of marks
            System.out.println("How many marks??");
            int num = input.nextInt();
            //make array using number inputed
            double marks[] = new double[num];
            //ask to put number
            System.out.println("Please input the marks");
            for (int i = 0; i < marks.length; i++) {
                //record marks
                marks[i] = input.nextInt();
            }
            for (int i = 0; i < marks.length - 1; i++) {
                for (int a = i + 1; a < marks.length; a++) {
                    if (marks[i] > marks[a]) {
                        //compare every number and changed number if 1st num is higher than next num
                        double x = marks[i];
                        double y = marks[a];
                        marks[i] = y;
                        marks[a] = x;
                    }
                }
            }
            int med = num;
            //if remainder is 0 which means even number
            if (med % 2 == 0) {
                //calculate 2 number in the middle and add them and divid into 2
                double avg = (((marks[marks.length / 2]) + (marks[(marks.length / 2) - 1])) / 2);
                //print out average
                System.out.println("Median mark is " + avg);
            } else {
                //or print out odd number
                System.out.println("Median mark is " + marks[med / 2]);
            }
        }
    }
}
