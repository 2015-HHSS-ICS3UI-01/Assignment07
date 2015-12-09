
import java.util.Scanner;

/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
/**
 *
 * @author whitb0039
 */
public class A7Q2 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here

        //inport a scanner
        Scanner in = new Scanner(System.in);

        //ask how many students are in the class
        System.out.println("How many students are you measuring?");

        //next input is the number of students
        int numberOfStudents = in.nextInt();

        //ask user to enter all of the marks in the class
        System.out.println("Please enter all of the heights in centimeters");

        //create an array to store all of the student marks
        double[] classHeights = new double[numberOfStudents];

        //execute a for loop until the number of marks entered matches the number of student in the class
        for (int i = 0; i < numberOfStudents; i++) {
            classHeights[i] = in.nextInt(); //each input will be stored in a different section of the array
        }
        
        double sumOfArray = 0;
        //make count equal to zero and add one every loop until it equals the length of the array
        for (int count = 0; count < numberOfStudents; count++) { 
            sumOfArray = sumOfArray + classHeights[count]; //add the next value of the array to the total sum
        }
        double average = sumOfArray / numberOfStudents; //find the average
        
        System.out.printf("The following heights are above average "); //output the following numbers are above average
        for(int x = 0; x < numberOfStudents; x++){ //loop until x = the number of students
            if (classHeights[x] >= average){ //if the part of the array is greater than the average
                System.out.printf("%.0f", classHeights[x]); //output the height
                System.out.print("cm, "); //output cm, 
            }         
        }
    }
}
