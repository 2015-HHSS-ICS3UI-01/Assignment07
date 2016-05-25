
import java.util.Scanner;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
/**
 *
 * @author RARES
 */
public class A7Q2 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here

        //Create a new scanner to recieve input
        Scanner input = new Scanner(System.in);
        //Ask for the amount of people being measured
        System.out.println("How many people are measuring their height");
        int numberOfPeople = input.nextInt();
        //Make a variable to store the heights  
        int[] heights = new int[numberOfPeople];
        //Allow the input of the heights 
        for (int i = 0; i < heights.length; i++) {
            //Ask for the heights
            System.out.println("Please enter the heights in cenitimeters");
            //Input of heights
            heights[i] = input.nextInt();

        }
        //Make total equal to 0  
        int total = 0;
        //Count how many heights were entered  
        for (int i = 0; i < heights.length; i++) {
            total = total + heights[i];

            //Make a variable to store the average height 
        }
        int avgHeight = total / numberOfPeople;
        //Look for height greater than the average
        for (int i = 0; i < heights.length; i++) {
            //If the height is > avgHeight, output the heights
            if (heights[i] > avgHeight) {
                //Ouptput heights > avgHeight
                System.out.println("Heights that are above average are " + heights[i]);
            }

        }

    }

}
