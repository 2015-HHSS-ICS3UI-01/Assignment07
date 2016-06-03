
import java.util.Scanner;

/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
/**
 *
 * @author howen2217
 */
public class A7Q1 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        //search for inputs
        Scanner input = new Scanner(System.in);
        //get the number of students in a class
        System.out.println("Please enter the number of students in a class");
        int students = input.nextInt();
        int[] marks = new int[students];
        //input all the grades
        for (int i = 0; i < marks.length; i++) {
            System.out.println("Please enter a mark");
            marks[i] = input.nextInt();
        }
        //add all the grades together
        int addedTotal = 0;
        for (int i = 0; i < marks.length; i++) {
            addedTotal = addedTotal + marks[i];
        }
        //calculate the average and output it
        double average = addedTotal / students;
        System.out.println("The class average is " + average + " %");
    }
}
