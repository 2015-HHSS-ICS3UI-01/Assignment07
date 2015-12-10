
import java.util.Scanner;

/**
 *
 * Write a program to read in a series of heights of people and output the average and all those that are above average 
 * in height for the group. 
 * 
 * @author richj0985
 */
public class A7Q2 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // Read in the heights of people in the group into an array.  Computer the groups average height
        // and with the group average move through the array again and output any person that 
        // has height greater than the group average.
                 
        // create a scanner for input
        Scanner input = new Scanner(System.in);
        
        System.out.println("Enter the following information to determine the average of heights of a group of people.");
        
        // ask the user how many people are in the group and store this in a variable
        System.out.print("Enter how many people are in the group: ");
        int numberOfPeople = input.nextInt();
        
        if(numberOfPeople > 0){
            // create an array to store the heights of a group of people
            // the number of variables stored is the number of people in the group
            double[] aryHeights = new double[numberOfPeople];

            // create a variable to store the sum of the heights and the average height
            double averageHeight = 0;
            double sumOfHeights = 0;

            // ask the user to enter the heights
            System.out.println("Please enter the height of each person in the group (1 per line): ");

            // count the number of variables to store a certain number of heights
            for(int index = 0; index < numberOfPeople; index = index + 1){
                // store the numbers
                aryHeights[index] = input.nextDouble();

                // add the height to the average
                sumOfHeights = sumOfHeights + aryHeights[index];
            }

            // calculate the average height of the group and round to 2 decimals
            averageHeight = Math.round((sumOfHeights / numberOfPeople) * 100.0) / 100.0;

            System.out.println("The average height of the group is " + averageHeight + ".");


            // with the average height of the group, output the height of people that are
            // taller than the group average. 
            System.out.print("The heights greater than the average are ");
            for(int index = 0; index < aryHeights.length; index = index + 1){
                if(aryHeights[index] > averageHeight){
                    System.out.print(aryHeights[index] + " ");
                }
            }
            System.out.println("");
        }
        // close scanner
        input.close();
    }
}
