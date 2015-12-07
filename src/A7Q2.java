
import java.util.Scanner;

/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
/**
 *
 * @author pircn0556
 */
public class A7Q2 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        //create scanner
        Scanner input = new Scanner(System.in);

        //ask user for how many people
        System.out.println("How many people?");
        int people = input.nextInt();

        //create array for amount of people
        int[] aboveAvg = new int[people];

        //getting values for array
        System.out.println("Enter their heights:");
        for (int i = 0; i < aboveAvg.length; i++) {
            aboveAvg[i] = input.nextInt();
        }

        //finding the average of all the values
        int heightAvg = 0;
        for (int i = 0; i < aboveAvg.length; i++) {
            heightAvg = heightAvg + aboveAvg[i];
        }
        heightAvg = heightAvg / people;

        //output all heights that are above average
        System.out.println("The heights that are above average are: ");
        for (int i = 0; i < aboveAvg.length; i++) {
            if (aboveAvg[i] > heightAvg) {
                System.out.println(aboveAvg[i]);
            }
        }


    }
}
