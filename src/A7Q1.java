
import java.util.Scanner;

/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
/**
 *
 * @author sevcm7279
 */
public class A7Q1 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        //make a scanner
        Scanner input = new Scanner(System.in);

        //enter the number of people in the class
        System.out.println("Enter the number of students.");
        int a = input.nextInt();

        //create an array
        double[] marks = new double[a];

        //create a for loop to enter all of the grades
        for (int i = 0; i < marks.length; i++) {
            System.out.println("Please enter the grade.");
            marks[i] = input.nextInt();

        }
        //add up all of the grades
        double total = 0;
        for (int i = 0; i < marks.length; i++) {
            total = total + marks[i];
        }
        //calculate the average
        double average = total / a;
        //round to the nearest hundredth
        average = Math.round(average * 100) / 100.0;

        //display the average
        System.out.println("The average grade of the class is " + average);
    }
}
