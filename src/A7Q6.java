
import java.util.Scanner;

/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 * Create a program that will ask a user for the size of a class and the marks for each student, then output the highest mark, lowest mark, and median. 
 * 
 * 
 * @author richj0985
 */
public class A7Q6 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // create a program that will store a list of marks and output the lowest, highest, and average mark

        // create a scanner for input
        Scanner input = new Scanner(System.in);
        
        // ask the user how many students were in the class and store this on the next line
        System.out.print("Enter how many students are in the class?: ");
        int numberOfMarks = input.nextInt();
        
        // make sure that 0 is not entered
        if(numberOfMarks > 0){
            
            // create an array to store the marks
            double[] aryMarks = new double[numberOfMarks];
            
            // the user to enter the marks and store these marks in the array
            System.out.println("Enter the marks (1 per line) to determine the properties: ");
            
            // use a for loop to store the marks
            for(int index = 0; index < numberOfMarks; index = index + 1){
                aryMarks[index] = input.nextInt();
            }
            
            // Bubble Sorting the marks array in order from smallest to largest
            // this will make it easy to find the lowest and highest marks
            //
            // create a for loop that will use the corrdinates of x and y to represent two positions within the array
            // the x variable will represent the number that the program is trying to find the position of
            // the y variable will represent the number that the program uses to compare to the x varaible

            // make x start from position 0 to the second last position of the array (8)
            for(int x = 0; x < aryMarks.length - 1; x = x + 1){
                // make y start from position 1 to the end of the array (9)
                for(int y = x + 1; y < aryMarks.length; y = y + 1){
                    // swap positions of x and y
                    if(aryMarks[x] > aryMarks[y]){
                        double sub = aryMarks[x];
                        aryMarks[x] = aryMarks[y];
                        aryMarks[y] = sub;
                    }
                }
            }
            
            // create variable to store the average
            double average = 0;
            
            // use for loop to calculate the average
            for(int index = 0; index < aryMarks.length; index = index + 1){
                // the average starts out as all the marks are added together
                average = average + aryMarks[index];
            } 
            
            // the average is then divided by the number of students in the class
            average = average / numberOfMarks;
            
            // output the lowest mark as the first position of the array (0)
            System.out.println("The lowest mark is " + aryMarks[0]);
            // output the highest mark as the last position of the array (length  - 1)
            System.out.println("The highest marks is " + aryMarks[aryMarks.length - 1]);
            // output average
            System.out.println("The average is " + average);
        }
        // close scanner
        input.close();
    }
}
