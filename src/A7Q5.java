
import java.util.Scanner;

/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
/**
 *
 * @author watsk8668
 */
public class A7Q5 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // import scanner
        Scanner input = new Scanner(System.in);

        //how many people
        System.out.println("How many numbers?");
        int numbers = input.nextInt();

        //create array
        int[] order = new int[numbers];

        System.out.println("Enter " + numbers + " numbers: ");

        //enter numbers
        for (int i = 0; i < order.length; i++) {
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
        for (int i = 0; i < order.length; i++) {
            System.out.println(order[i]);
        }
      
        if (numbers %2 == 0) {
            //calculate the median
            double media = (order[numbers/2] + order[(numbers/2)-1]) / 2;
            //print out the median
            System.out.println("The media is " + media);
        } else {
            //calculate the media
            double median = order[numbers / 2];
            System.out.println("The median is " + median);
        }



    }
}
