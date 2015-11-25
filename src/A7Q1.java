
import java.util.Scanner;

/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
/**
 *
 * @author richj0985
 */
public class A7Q1 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // create a scanner for input
        Scanner input = new Scanner(System.in);

        double[] aryMarks;
        
        aryMarks = new double[10];
        
        aryMarks[0] = 100.0;
        aryMarks[1] = 100.0;
        aryMarks[2] = 100.0;
        aryMarks[3] = 100.0;
        aryMarks[4] = 100.0;
        aryMarks[5] = 100.0;
        aryMarks[6] = 100.0;
        aryMarks[7] = 100.0;
        aryMarks[8] = 100.0;
        aryMarks[9] = 100.0;
        
        double average = (aryMarks[0] + aryMarks[1] + aryMarks[2] + aryMarks[3] + aryMarks[4] + aryMarks[5] + aryMarks[6] + aryMarks[7] + aryMarks[8] + aryMarks[9]) / 10;
        System.out.println(average);
    }
}
