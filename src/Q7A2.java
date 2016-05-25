
import java.util.Scanner;

/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author kangh4484
 */
public class Q7A2 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
       Scanner input = new Scanner(System.in);
        double total = 0;
        //aske how many students
        System.out.println("How many students in the class?");
        int numberofstudents = input.nextInt();
        //creat array
        int[] height = new int[numberofstudents];
        //aske user to input height
        System.out.println("Enter the height in cm:");
        for (int i = 0; i < height.length; i++) {
            //record height and get total height
            height[i] = input.nextInt();
            total = total + height[i];
        }
        //calculate average
        double avg = Math.round((total / height.length) * 100d) / 100d;
        System.out.println("Average height is " + avg + " and height that are heigher than average are:");
        for (int i = 0; i < height.length; i++){
        //print out height that are heigher than average
            if(height[i] > avg){
                System.out.println(height[i]);
            }
        }
    
    }
}
