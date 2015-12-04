
import java.util.Scanner;

/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author stahc1596
 */
public class A7Q2 {

    
    public static void main(String[] args) {
        Scanner input= new Scanner(System.in);
        System.out.println("Enter the amount of people.");
        int people = input.nextInt();
        double[] heights = new double [people];
        System.out.println("Please enter a height for each participant in feet.");
        for (int e = people; e < heights.length; e++){
            heights[e] = input.nextDouble();
            if(heights[e] >= 5.9){
                System.out.println("Your height of " + heights[e] + " is greater than");
                System.out.println("the average height of a person.");
            }else if(heights[e] < 5.9){
                System.out.println("Your height of " + heights[e] + " is shorter than");
                System.out.println("the average height of a person.");
            }
            
        }
    }
}
