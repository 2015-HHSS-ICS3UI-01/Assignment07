
import java.util.Scanner;

/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
/**
 *
 * @author pircn0556
 */
public class A7Q4 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        //create scanner
        Scanner input = new Scanner(System.in);

        //create array
        int[] sort = new int[10];

        //get values for array
        System.out.println("Enter 10 numbers: ");
        for (int i = 0; i < sort.length; i++) {
            sort[i] = input.nextInt();
        }

        //sort the numbers
        for (int x = 0; x < sort.length; x++) {
            for (int y = x + 1; y < sort.length; y++) {
                int temp = sort[x];
                if (sort[x] > sort[y]) {
                    sort[x] = sort[y];
                    sort[y] = temp;
                }

            }
        }
        //output the sorted numbers
        System.out.println("the numbers sorted are:");
        for (int i = 0; i < sort.length; i++) {
            System.out.println(sort[i]);
        }
    }
}
