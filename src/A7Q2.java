
import java.util.Scanner;

/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
/**
 *
 * @author howen2217
 */
public class A7Q2 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Scanner input = new Scanner(System.in);
        //get the number of people
        System.out.println("Please enter the number of people");
        int people = input.nextInt();
        int[] height = new int[people];
        //collect heights of all people
        for (int i = 0; i < height.length; i++) {
            System.out.println("Please enter a height for person " + (i + 1) + " in centimetres");
            height[i] = input.nextInt();
        }
        //add all heights togehter
        int addedTotal = 0;
        for (int i = 0; i < height.length; i++) {
            addedTotal = addedTotal + height[i];
        }
        //determine the average height and output those above the average height
        double average = addedTotal / people;
        System.out.println("The average height is " + average + " cm");
        for (int i = 0; i < height.length; i++) {
            if (height[i] > average) {
                System.out.println("Person " + (i + 1) + " is over the average height at " + height[i] + " cm");
            }
        }
    }
}
