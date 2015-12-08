
import java.util.Scanner;

/**
 * create a program that will determine the average of a class based on the
 * percentages given for each student
 *
 * @author richj0985
 */
public class A7Q1 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {

        // create a scanner for input
        Scanner input = new Scanner(System.in);

        System.out.println("Enter the following information to determine the average of a computer science class.");

        // ask the user how many students are in the class and store this in a variable
        System.out.print("Enter how many students are in the class: ");
        int numberOfStudents = input.nextInt();
        
        if (numberOfStudents > 0) {
            // create an array to store the percentages of the students
            // the number of variables stored is the number of students in the class
            double[] aryMarks = new double[numberOfStudents];

            // create a variable to store the average
            double average = 0;
            double sumOfMarks = 0;

            // ask the user to enter the percentaages
            System.out.println("Please enter the marks of the students (1 per line): ");

            // prompt the user for a mark for the number of students specified
            // store the students mark in an array and computer the class average
            for (int studentIndex = 0; studentIndex < numberOfStudents; studentIndex = studentIndex + 1) {
                // prompt for each students mark and store the numbers
                aryMarks[studentIndex] = input.nextDouble();

                // add the marks as we go so we can compute the  to the average
                sumOfMarks = sumOfMarks + aryMarks[studentIndex];
            }

            // calculate the class average mark to 2 decimals places and output the class average
            average = Math.round((sumOfMarks / numberOfStudents) * 100.0) / 100.0;
            System.out.println("The average of the class is " + average + "%");
        }
        // close scanner
        input.close();
    }
}
