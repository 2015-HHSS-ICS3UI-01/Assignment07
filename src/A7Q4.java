
import java.util.Scanner;

/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
/**
 *
 * @author watsk8668
 */
public class A7Q4 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // import scanner
        Scanner input = new Scanner(System.in);

        //create array with 10 places
        int[] order = new int[10];

        //enter 10 marks
        for (int i = 0; i < order.length; i++) {
            System.out.println("Enter the marks:");
            order[i] = input.nextInt();
        }

        //sort the marks from lowest to highest
        for (int x = 0; x < order.length - 1; x++) {
            for (int y = x + 1; y < order.length; y++) {
                int temp = order[x];
                if (order[x] > order[y]) {
                    order[x] = order[y];
                    order[y] = temp;
                }
            }
        }

        //the marks in order are
        System.out.println("The marks from lowest to highest are: ");
        
        //print out the values
        for(int i = 0; i < order.length; i++) {
            System.out.println(order[i]);
        }


    }
}