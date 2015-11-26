
import java.util.Scanner;

/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
/**
 *
 * @author richj0985
 */
public class A7Q1 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // create a program that will determine the average of a class based on the percentages given
                
        // create a scanner for input
        Scanner input = new Scanner(System.in);
        
        System.out.println("Enter the following information to determine the average of a computer science class.");
        
        // ask the user how many students are in the class and store this in a variable
        System.out.print("Enter how many students are in the class: ");
        int numberOfStudents = input.nextInt();
        
        // create an array to store the percentages of the students
        double[] aryMarks;
        
        // the number of variables stored is the number of students in the class
        aryMarks = new double[numberOfStudents];
        
        // create a variable to store the average
        double average = 0;
        
        // ask the user to enter the percentaages
        System.out.println("Please enter the marks of the students (1 per line): ");
        
        // count the number of variables to store a certain number of marks
        for(int index = 0; index < numberOfStudents; index = index + 1){
            aryMarks[index] = input.nextDouble();
            average = average + aryMarks[index];
        }
        
        average = average / numberOfStudents;
        
        System.out.println("The average of the class is " + average + ".");
    }
}
