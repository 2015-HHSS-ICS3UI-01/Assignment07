
import java.util.Scanner;

/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
/**
 *
 * @author fitws6356
 */
public class A7Q2 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("How many people have had their height counted?");
        int people = input.nextInt();
        int[] heights = new int[people];
        System.out.println("Enter the heights in centimeters.");
        for (int i = 0; i < heights.length; i++) {
            heights[i] = input.nextInt();
            
        }
        int average = 0;
        for(int i = 0; i < heights.length; i++){
            average = average + heights[i];
        }//the code must find average then print all heights that are above the average
        double finalAverage = average/people;
        System.out.println("The average height of the group is "+finalAverage);
        for(int i = 0; i < heights.length; i++){
          if(finalAverage <= heights[i]){
            System.out.println("Heights above average are "+heights[i]);
        }   
        }
        
    }
}
