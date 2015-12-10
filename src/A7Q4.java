
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

        System.out.println("Enter 10 marks: ");
        order[0] = input.nextInt();
        order[1] = input.nextInt();
        order[2] = input.nextInt();
        order[3] = input.nextInt();
        order[4] = input.nextInt();
        order[5] = input.nextInt();
        order[6] = input.nextInt();
        order[7] = input.nextInt();
        order[8] = input.nextInt();
        order[9] = input.nextInt();

        //sort the marks from lowest to highest
        for (int x = 0; x < order.length - 1; x++) {
            for (int y = 0; y < order.length + 1; y++) {
                int temp1 = order[x];
                int temp2 = order[y];
                if (order[x] > order[y]) {
                    order[x] = temp2;
                    order[y] = temp1;
                }
            }
        }

        //the marks in order are
        System.out.println("The marks from lowest to highest are: " + order[0] + order[1] + order[2] + order[3] + order[4] + order[5] + order[6] + order[7] + order[8] + order[9]);


    }
}
