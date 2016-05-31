
import java.util.Scanner;

/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
/**
 *
 * @author rahmf8586
 */
public class A7Q2 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Scanner input = new Scanner(System.in);

        System.out.println("How many people in the group?");
        int people = input.nextInt();

        double[] height = new double[people];

        for (int i = 0; i < people; i++) {
            System.out.println("Enter a height in centimeters:");
            height[i] = input.nextDouble();
        }

        double total = 0;

        for (int i = 0; i < people; i++) {
            double avg = height[i];
            total = total + avg;
        }
        double average = Math.round(total * 100.0 / people) / 100.0;

        for (int i = 0; i < people; i++) {
            if (height[i] > average) {
                System.out.println("This height is above average:");
                System.out.println(height[i]);
            }
        }
    }
}
