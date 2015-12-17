
import java.util.Scanner;

/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author kulla6503
 */
public class A7Q5 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // create a scanner
        Scanner in = new Scanner(System.in);

        // Output our sentence to the user letting them know what they entered
        System.out.println("How many Grades are there");
        int Num = in.nextInt(); 
        
        // to make an array of int
        int[] aryNums = new int[Num];

        // User Enters 2 numbers
        System.out.println("Enter the values of each Grades: ");

        // To determine the population of the array
        for (int i = 0; i < Num; i++) {
            
            int grade = in.nextInt();
            aryNums[i] = grade;
            
        }

        // Used to put the numbers in accending order
        for (int order = 0; order < Num; order++) {
            // Putting each specific number in accending with the number after it
            for (int i = 0; i < Num-1; i++) {

                // The number after the previous number that is being swapped
                int nextNum = i + 1;
                
                // The new number in the proper accending form
                int newNum;

                // Used to swap the two 
                if (aryNums[i] > aryNums[nextNum]) {
                    newNum = aryNums[i];
                    // new intial number
                    aryNums[i] = aryNums[nextNum];
                    aryNums[nextNum] = newNum;
                }
                
            }
            
        }
        // Output our sentence to the user letting them know what they entered
        System.out.println("The Marks in accending order are: ");
        
        // Used to print out the numbers in proper accending order
        for (int accending = 0; accending < Num; accending++) {
            System.out.println(aryNums[accending]);
            
            // Trying to find the median of the listed numbers 
             if(accending == Num - 1) {
                 // divides the number by 2 to get the median
                 int medianNum = (Num / 2);
                 // removes any remainder
                 int remainNum = Num % 2;
                 // if the median number odd
                 if ( remainNum == 0) {
                     
                     int lastNum = medianNum - 1; 
                     //adds both arrays
                     medianNum = aryNums[medianNum] + aryNums[lastNum]; 
                     // Takes the answer and divides it by 2
                        int answer = medianNum / 2; 
                        // Output our sentence to the user letting them know what they entered
                        System.out.println("The Median is " + answer + "%");
                 } else {
                    // Output our sentence to the user letting them know what they entered
                     System.out.println("The Median is " + aryNums[medianNum] + "%");
                 }
                 
                  
             }
               
                 
        }
       
            
       

        
    }
}
