import java.util.Scanner;

/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
/**
 *
 * @author watsk8668
 */
public class A7Q2 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        //import scanner
        Scanner input = new Scanner(System.in);

        //how many people
        System.out.println("How many people?");
        int people = input.nextInt();

        // make an array of ints with the # of people as the # of spots
        double[] heights = new double[people];

        //enter all the heights
        for (int i = 0; i < heights.length; i++) {
            System.out.println("Enter the heights:");
            heights[i] = input.nextDouble();
        }

        //adding up all the heights in the array
        double total = 0;
        for (int i = 0; i < heights.length; i++) {
            total = total + heights[i];
        }

        //calculate the average
        double average = total / people;

        //go through all the heights and print out the ones that are larger than the average
        for(int i = 0; i < heights.length; i++){
            if(heights[i] > average){
                System.out.println(heights[i]);
            }
        }


    }
}
