
import java.util.Scanner;

/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
/**
 *
 * @author pircn0556
 */
public class A7Q3 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        //create scanner
        Scanner input = new Scanner(System.in);

        //create array
        int[] order = new int[2];

        //get values for array
        System.out.println("Enter two numbers: ");
        for (int i = 0; i < order.length; i++) {
            order[i] = input.nextInt();
        }
    }
}
