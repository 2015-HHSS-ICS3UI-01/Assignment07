
import java.util.Scanner;

/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
/**
 *
 * @author mitrm7692
 */
public class A7Q2 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        //Create a scanner
        Scanner input = new Scanner(System.in);
        //Ask how many people are in the group
        System.out.println("How many people are in the group?");
        //integer for the amount of people in group
        int numOfPeople = input.nextInt();
        //Makes the amount of arrays corrisponding with the amount of people in the group
        int[] heights = new int[numOfPeople];
        //Asks to enter the heights of the people in the group in cm
        System.out.println("Enter the heights in centimeters of the people in the group.");
        //for loop uses the number of people to make how many heights can be entered
        for (int i = 0; i < numOfPeople; i++) {
            //Allows the amount of heights to be entered with the amount of people in the group
            heights[i] = input.nextInt();
        }
        //Makes the integer "total"
        int total = 0;
        //for loop uses the number of people to the total of the heights
        for (int i = 0; i < numOfPeople; i++) {
          //total is equal to "total" plus the heights
            total=total+heights[i];
        }
        //prints the groups average height
        System.out.println("The average height of the group is "+total/numOfPeople+"cm");
        //calculates the average by dividing "total" by the number of people
        int avg = total/numOfPeople;
        //prints "The above average heights of the group are "
        System.out.print("The above average heights of the group are ");
        //for loop uses the number of people to see which heights are above the average
        for (int i=0; i< numOfPeople; i++){
            //if the heights are above the average
            if(heights[i]>avg){
                //outputs the heights above the average
                System.out.print(heights[i]);
                //Print out the units of measurement
                System.out.print("cm, ");
            }
            
        }
        //Print a blank space
            System.out.println("");
    }
}
