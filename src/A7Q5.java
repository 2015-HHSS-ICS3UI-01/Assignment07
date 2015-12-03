
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
        // create a scanner for input
        Scanner input = new Scanner(System.in);
        
        System.out.println("Enter the following information");
        System.out.print("Enter how many marks there are in the class: ");
        int numberOfMarks = input.nextInt();
        
        double[] aryMarks = new double[numberOfMarks];
        
        System.out.println("Enter the marks (1 per line) to order from smallest to largest and determine the median: ");
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
        
        System.out.println("The marks from smallest to largest are ");
        for(int index2 = 0; index2 < numberOfMarks; index2 = index2 + 1){
            System.out.print(aryMarks[index2] + " ");
        }
        
        System.out.println("");
        
        int median1Place = 0;
        if(aryMarks.length != 1){
            median1Place = aryMarks.length / 2;
        }
        double median1 = aryMarks[median1Place];
        double medianAverage = median1;
        
        if((aryMarks.length % 2) == 0 && aryMarks.length != 1){
            median1 = aryMarks[median1Place - 1];
            double median2 = aryMarks[median1Place];
            medianAverage = (median1 + median2) / 2;
        }
        
        System.out.println("The median is " + medianAverage);
        
        // close scanner
        input.close();
    }
}
