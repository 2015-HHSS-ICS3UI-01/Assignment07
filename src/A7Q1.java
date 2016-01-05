
import java.util.Scanner;

/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author mitrm7692
 */
public class A7Q1 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        //Create a scanner
        Scanner input = new Scanner(System.in);
        //Asks how many students are in class
        System.out.println("How many students in the class?");
        //Created integer to enter how many students are in class
        int numOfStudents= input.nextInt();
        //Asks user to enter the marks of the class
        System.out.println("Enter the marks:");
        //Makes the right amount of arrays depending on how many students are in the class 
        double[] numOfMarks= new double [numOfStudents];
        //For loop to make arrays and marks go together
        for(int i=0; i<numOfStudents; i++){
        //Entered mark goes with array that corrisponds
        numOfMarks[i]=input.nextInt();
        }
        //Runs the method classMean with the entered amount of students and marks
        double classMean=classMean(numOfStudents, numOfMarks);
        //Outputs "The class average is " on one line
        System.out.print("The class average is ");
        //outputs the classmean rounded to two decimal places on the same line
        System.out.printf("%.2f", classMean);
        //outputs % sign beside the classmean
        System.out.print("%");
    }
    
    public static double classMean(int numOfStudents, double[] numOfMarks){
        //Make a variable "average"
        double average=0;
        //for loop to make the number of students equal the number of marks
        for(int i=0; i<numOfStudents; i++){
            //average is equal to the average plus the number of marks which is the number of students
            average=average+numOfMarks[i];
        }
        //Makes the value of Mean equal the variable "average" divided by the number of students
        double Mean = average/numOfStudents;
            //returns the value of Mean
                return Mean;
    }
}
