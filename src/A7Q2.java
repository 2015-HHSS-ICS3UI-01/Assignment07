
import java.util.Scanner;

/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author richj0985
 */
public class A7Q2 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // create a program that will determine the average heights of a group of people
                
        // create a scanner for input
        Scanner input = new Scanner(System.in);
        
        System.out.println("Enter the following information to determine the average of heights of a group of people.");
        
        // ask the user how many people are in the group and store this in a variable
        System.out.print("Enter how many people are in the group: ");
        int numberOfPeople = input.nextInt();
        
        // create an array to store the heights of a group of people
        // the number of variables stored is the number of people in the group
        double[] aryHeights = new double[numberOfPeople];
        
        // create a variable to store the average
        double average = 0;
        
        // ask the user to enter the heights
        System.out.println("Please enter the marks of the students (1 per line): ");
        
        // count the number of variables to store a certain number of heights
        for(int index = 0; index < numberOfPeople; index = index + 1){
            // store the numbers
            aryHeights[index] = input.nextDouble();
            
            // add the height to the average
            average = Math.round((average + aryHeights[index]) * 100) / 100;
        }
        
        // calculate the average and output
        average = average / numberOfPeople;
        System.out.println("The average height is " + average + ".");
        
        // close scanner
        input.close();
    }
}
