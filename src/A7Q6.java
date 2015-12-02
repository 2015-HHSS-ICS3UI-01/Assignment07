
import java.util.Scanner;

/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author richj0985
 */
public class A7Q6 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // create a scanner for input
        Scanner input = new Scanner(System.in);
        
        System.out.print("Enter how many marks there are in the class: ");
        int numberOfMarks = input.nextInt();
        
        double[] aryMarks = new double[numberOfMarks];
        
        System.out.println("Enter the marks (1 per line) to determine the properties: ");
        for(int index = 0; index < numberOfMarks; index = index + 1){
            aryMarks[index] = input.nextInt();
        }
        for(int x = 0; x < aryMarks.length - 1; x = x + 1){
            for(int y = x + 1; y < aryMarks.length; y = y + 1){
                if(aryMarks[x] > aryMarks[y]){
                    double sub = aryMarks[x];
                    aryMarks[x] = aryMarks[y];
                    aryMarks[y] = sub;
                }
            }
        }
        
        double average = 0;
        
        for(int index = 0; index < aryMarks.length; index = index + 1){
            average = average + aryMarks[index];
        } 
        
        average = average / numberOfMarks;
        
        System.out.println("The lowest mark is " + aryMarks[0]);
        System.out.println("The highest marks is " + aryMarks[aryMarks.length - 1]);
        System.out.println("The average is " + average);
    }
}
