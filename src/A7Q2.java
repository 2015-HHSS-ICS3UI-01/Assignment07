
import java.util.Scanner;

/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
/**
 *
 * @author lalim9800
 */
public class A7Q2 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        //new scanner 
        Scanner input = new Scanner(System.in);
        //ask user how many people are measuring their height
        System.out.println("How many people are measuring their height");
        int peopleamount = input.nextInt();
        //create a new variable that will store all the heights of people 
        int[] heights = new int[peopleamount];
     //allow user to enter the heights of each player 
       for (int i = 0; i < heights.length; i++) {
           //ask user to enter heights
            System.out.println("please enter the heights in cenitimeters");
            //allow user to enter heights 
            heights[i] = input.nextInt();

        }
       //set total to 0 
        int total = 0;
        //calculate the total of all height entered 
        for (int i = 0; i < heights.length; i++) {
            total = total + heights[i];



        } int average=total/peopleamount;
        
         for (int i = 0; i < heights.length; i++) {
             if(heights[i]>average){
                 System.out.println("Heights that are above average are " + heights[i]);
             }
                 
             
         }
    }
}
