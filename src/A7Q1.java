
import java.util.Scanner;

/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author whitb0039
 */
public class A7Q1 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        
        //inport a scanner
        Scanner in = new Scanner(System.in);
        
        //ask how many students are in the class
        System.out.println("How many students are in the class?");
        
        //next input is the number of students
        int numberOfStudents = in.nextInt();
        
        //ask user to enter all of the marks in the class
        System.out.println("Please enter the marks");
        
        //create an array to store all of the student marks
        double[] classMarks = new double[numberOfStudents];
        
        //execute a for loop until the number of marks entered matches the number of student in the class
        for(int i = 0; i < numberOfStudents; i++){ 
            classMarks[i] = in.nextInt(); //each input will be stored in a different section of the array
        }
        
        //ouput "The average is"
        System.out.print("The average is ");
        
        //output the rounded average
        System.out.printf("%.2f", average(numberOfStudents, classMarks));
        
        //output a % sign
        System.out.print("%");


    } public static double average(int numberOfStudents, double[] classMarks){
        //create the variable for the total sum of the array
        double sumOfArray = 0;
        //make count equal to zero and add one every loop until it equals the length of the array
        for (int i = 0; i < numberOfStudents; i++) { 
            sumOfArray = sumOfArray + classMarks[i]; //add the next value of the array to the total sum
        }
        double average = sumOfArray / numberOfStudents; //find the average
        
        return average;
    }
}
