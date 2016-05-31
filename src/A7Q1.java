
import java.util.Scanner;

/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
/**
 *
 * @author farrb0382
 */
public class A7Q1 {

    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);     // input the scanner

        System.out.println("How many students are in the class?"); // asking for the number of students 
        int n = input.nextInt();        // input the number of students
        int[] marks = new int[n];       // the int is equal to the array 

        System.out.println("Enter the marks.");     // asking for the marks 

        double avg = 0;     // creating the double for average
        
        for (int i = 0; i < marks.length; i++) {        // for loop - do the following
            marks[i] = input.nextInt();     // input all the marks 
            avg =  avg + marks[i];      // the average is equal to 0 + the inputted marks 
        }

        double total = (avg / n);       // the total is the average divided by the number of marks
            
        System.out.println("The class average is " + total + "%");      // outputting the average 
        
    }
}
