
import java.util.Scanner;

/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
/**
 *
 * @author agott2059
 */
public class Question6 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        //create scanner
        Scanner input = new Scanner(System.in);
        //request number of students, store number in variable
        System.out.println("Enter number of students: ");
        int numStud = input.nextInt();
        //create array as large as class
        int[] marks = new int[numStud];
        //get appropriate number of marks and store them in an array using for loop
        System.out.println("Enter marks for each student: ");
        for (int i = 0; i < numStud; i++) {
            marks[i] = input.nextInt();
        }
        /*use loop to go through all marks (moving up a space in the array  
         each time to rearrange all the marks in ascending order*/
        for (int i = 0; i < numStud; i++) {
            for (int k = 0; k < numStud; k++) {
                int x = marks[i];
                int y = marks[k];

                if (marks[i] < marks[k]) {
                    marks[i] = y;
                    marks[k] = x;
                }
            }
        }
        //"numStud - 1" because array starts at 0 (numStud out of array range
        int highest = marks[numStud - 1];
        //lowest mark is first in array since the array has been arranged
        int lowest = marks[0];
        //create variable out of for loop so it's useable out of for loop
        double sum = 0;

        //go through the array as many time as it is large and add each number to sum
        for (int i = 0; i < numStud; i++) {
            //store every number in sum
            sum = sum + marks[i];
        }
        //calculate avg. and store in variable
        double average = sum / marks.length;
        //output results
        System.out.println("The highest marks is: " + highest);
        System.out.println("The lowest mark is: " + lowest);
        System.out.println("The class average is: " + average);

    }
}
