
import java.util.Scanner;

/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

/**
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
        
        int[] aryMarks;
        
        aryMarks = new int[10];
        
        System.out.println("Enter 10 marks (1 per line) to order from smallest to largest: ");
        for(int index = 0; index < 10; index = index + 1){
            aryMarks[index] = input.nextInt();
        }
        for(int x = 0; x < aryMarks.length - 1; x = x + 1){
            for(int y = x + 1; y < aryMarks.length; y = y + 1){
                if(aryMarks[x] > aryMarks[y]){
                    int sub = aryMarks[x];
                    aryMarks[x] = aryMarks[y];
                    aryMarks[y] = sub;
                }
            }
        }
        System.out.println("The marks from smallest to largest are ");
        for(int index2 = 0; index2 < 10; index2 = index2 + 1){
            System.out.println(aryMarks[index2]);
        }
    }
}
