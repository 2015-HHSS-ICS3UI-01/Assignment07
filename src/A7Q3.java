
import java.util.Scanner;

/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
/**
 *
 * @author rahmf8586
 */
public class A7Q3 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Scanner input = new Scanner(System.in);

        int[] num = new int[2];

        System.out.println("Enter two integers:");
        num[0] = input.nextInt();
        num[1] = input.nextInt();

        System.out.println("The integers in ascending order are:");

        if (num[0] < num[1]) {
            System.out.println(num[0]);
            System.out.println(num[1]);
        }

        if (num[0] > num[1]) {
            System.out.println(num[1]);
            System.out.println(num[0]);
        }
    }
}
