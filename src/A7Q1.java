
import java.util.Scanner;

/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
/**
 *
 * @author guanv6321
 */
public class A7Q1 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Scanner input = new Scanner(System.in);
        // user input for how many students
        System.out.println("How many students in the class?");
        int ppl = input.nextInt();
        // creates array depending on number of people
        int[] marks = new int[ppl];
        // new variable to store marks
        int total = 0;
        // for loop
        for (int i = 0; i < marks.length; i++) {
            // user input for marks
            System.out.println("Enter the marks:");
            marks[i] = input.nextInt();
            total = total + marks[i];
        }
        // finding average
        double avg = total/ppl;
        // output to screen
        System.out.println("The class average is " + avg + "%");        
    }
}

