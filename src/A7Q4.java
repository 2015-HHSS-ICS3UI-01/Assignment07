
import java.util.Scanner;

/**
 * create a program that will order 10 marks from smallest to largest using a technique called bubblesort
 * 
 * @author richj0985
 */
public class A7Q4 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        
        // create a scanner for input
        Scanner input = new Scanner(System.in);
        
        // create an array to store 10 numbers
        double[] aryMarks = new double[10];
        
        // ask the user to input 10 marks to order
        System.out.println("Enter 10 marks (1 per line) to order from smallest to largest: ");
        
        // create for loop to store the 10 marks
        for(int index = 0; index < 10; index = index + 1){
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
        // output the new order of marks using a for loop
        System.out.print("The marks from smallest to largest are ");
        for(int index2 = 0; index2 < 10; index2 = index2 + 1){
            System.out.print(aryMarks[index2] + " ");
        }
        System.out.println("");
        
        // close scanner
        input.close();
    }
}