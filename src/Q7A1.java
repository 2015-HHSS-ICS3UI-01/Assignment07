
import java.util.Scanner;

/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
/**
 *
 * @author kangh4484
 */
public class Q7A1 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        double total = 0;
        //aske user to put how many students in the class
        System.out.println("How many students in the class?");
        int numberofstudents = input.nextInt();
        //make array using value that user input
        int[] marks = new int[numberofstudents];
        //ask user to put marks
        System.out.println("Enter the marks:");
        for (int i = 0; i < marks.length; i++) {
            marks[i] = input.nextInt();
            //add marks 1 after the other
            total = total + marks[i];
        }
        //divid total mark into number of studnents and round it to hundredth
        double avg = Math.round((total / marks.length) * 100d) / 100d;
        //print out average
        System.out.println("The class average is " + avg + "%");
    }
}
