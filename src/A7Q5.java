
import java.util.Scanner;

/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author richj0985
 */
public class A7Q5 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // create a program that will order a certain number of marks given from the user from smallest to largest
        
        // create a scanner for input
        Scanner input = new Scanner(System.in);
        
        System.out.println("Enter the following information");
        
        // ask the user how many students there are and store this in a varaible
        System.out.print("Enter how many students are in the class: ");
        int numberOfMarks = input.nextInt();
        
        // make sure nothing happens if the user enters in 0 as the number of people in the class
        if(numberOfMarks > 0){
            // create an array that stores the marks
            double[] aryMarks = new double[numberOfMarks];

            // ask the user to input all the marks and use a for loop to store the marks in the array
            System.out.println("Enter the marks (1 per line) to order from smallest to largest and determine the median: ");
            for(int index = 0; index < numberOfMarks; index = index + 1){
                aryMarks[index] = input.nextInt();
            }

            // Bubble Sorting
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

            // output the marks in order from smallest to largest
            System.out.print("The marks from smallest to largest are ");
            for(int index2 = 0; index2 < numberOfMarks; index2 = index2 + 1){
                System.out.print(aryMarks[index2] + " ");
            }

            System.out.println("");

            double median1 = 0;
            double medianAverage = median1;


            // create a variable to store the median position
            // the median will start as a value of 
            int median1Place = 0;

            // if the length is larger then 1 then the 
            if(aryMarks.length > 1){
                median1Place = aryMarks.length / 2;
            }
            median1 = aryMarks[median1Place];
            medianAverage = median1;

            if((aryMarks.length % 2) == 0 && aryMarks.length != 1){
                median1 = aryMarks[median1Place - 1];
                double median2 = aryMarks[median1Place];
                medianAverage = (median1 + median2) / 2;
            }

            System.out.println("The median is " + medianAverage);

        }
        // close scanner
        input.close();
    }
}
