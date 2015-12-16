
import java.util.Scanner;

/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
/**
 *
 * @author moraj0721
 */
public class A7Q2 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {

        //Make the scanner
        Scanner input = new Scanner(System.in);

        //Ask how many people there are
        System.out.println("How many people are there? ");
        int people = input.nextInt();

        //ask for the heights
        System.out.println("What are their heights?");
        int[] heights = new int[people];
        for (int position = 0; position < people; position++) {
            System.out.println("Enter height " + position);

            //put heights into array
            int height = input.nextInt();
            heights[position] = height;

        }


        //store them into variable
        int previous = 0;
        for (int i = 0; i < people; i++) {
            previous = previous + heights[i];


        }
        //divide by how many heights there 
        int ave = previous / people;
        System.out.println("The height average is " + ave);

//if a height is greater than the average output to screen
        for (int pos = 0; pos < people; pos++) {
            if (heights[pos] > ave) {
                System.out.println("Person " + pos + " is above average height");
            }
        }
    }
}
