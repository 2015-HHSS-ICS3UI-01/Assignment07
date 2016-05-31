
import java.util.Scanner;

/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
/**
 *
 * @author rahmf8586
 */
public class A7Q1 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Scanner input = new Scanner(System.in);

        System.out.println("How many students in the class?");
        int students = input.nextInt();

        int[] marks = new int[students];

        for (int i = 0; i < students; i++) {
            System.out.println("Enter a mark:");
            marks[i] = input.nextInt();
        }

        double total = 0;

        for (int i = 0; i < students; i++) {
            int avg = marks[i];
            total = total + avg;
        }
        double average = Math.round(total * 100.0 / students) / 100.0;

        System.out.println("The class average is: " + average + "%");
    }
}
