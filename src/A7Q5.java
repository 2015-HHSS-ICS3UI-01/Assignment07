
import java.util.Scanner;

/**
 *
 * Create a program that will user enter in a number of student marks, order the marks
 * in the array using bubblesort and then output the median (middle mark).
 * 
 * - If the number of marks entered is even then take the 2 middle marks.
 * - Then finally average them for the median mark.
 * 
 * @author richj0985
 */
public class A7Q5 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
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
            System.out.println("Enter the marks of each student (1 per line): ");
            for(int index = 0; index < numberOfMarks; index = index + 1){
                aryMarks[index] = input.nextDouble();
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
            System.out.print("The marks from smallest to largest are:  ");
            for(int index2 = 0; index2 < numberOfMarks; index2 = index2 + 1){
                System.out.print(aryMarks[index2] + " ");
            }
            System.out.println("");

            // with the marks now ordered in the array, determine the median mark
            // by using the middle mark of the ordered array
            // if the number of marks is even then average the middle 2 marks
            
            //create variable for the final median product
            double finalMedian = 0;

            // create a variable to store the median position
            int medianIndex = 0;

            // Special case when the class only had 1 student and hence 1 mark
            // in this case the median is the single mark
            if(aryMarks.length == 1){
                // only 1 mark for class, median is the single mark
                finalMedian = aryMarks[0];
            }
            else {
                // more than 1 student in class, compute the middleIndex of the array
                // be sure to subtract 1 since array is 0 based. 
                medianIndex = (aryMarks.length / 2);

                // the final median should be location within the exact middle of the array
                finalMedian = aryMarks[medianIndex];
            
                // if the array has an even number of marks we need to average the 2 middle marks
                if( (aryMarks.length % 2) == 0 ){
                    // the other middle median will be 1 index less than computed middle index 
                    double median2 = aryMarks[medianIndex - 1];
                
                    // the final median is the mean of the two medians3
                    finalMedian = Math.round( ( (finalMedian + median2) / 2.0) * 100.0) / 100.0; 
                }
            }
            
            // output median
            System.out.println("The median mark is " + finalMedian);

        }
        // close scanner
        input.close();
    }
}
