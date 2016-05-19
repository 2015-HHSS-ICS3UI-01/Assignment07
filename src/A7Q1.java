
import java.util.Scanner;

/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
/**
 *
 * @author halll7908
 */
public class A7Q1 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        // create array integers
        System.out.println("How many students are in this class?");
        int studNum = input.nextInt();
        int[] students = new int[studNum];

        System.out.println("Please input their marks on different lines:");

        double avg = 0;
        for (int i = 0; i < students.length; i++) {
            int marksInput = input.nextInt();
            int[] marks = new int[marksInput];
            avg = avg + marksInput;
        }
            double total = (avg / students.length); // calculate average
            // ADD round to two decimals!!
            System.out.println("The class average is: " + total + "%");
    }
}
