
import java.util.Scanner;

/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author guanv6321
 */
public class A7Q2 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Scanner input = new Scanner(System.in);
        // user input for how many people
        System.out.println("How many people?");
        int ppl = input.nextInt();
        // creates array depending on number of people
        int[] h = new int [ppl];
        // new variable to store heights
        int total = 0;
        for(int i = 0; i < h.length; i++){
            // user input for heights
            System.out.println("Enter the heights:");
            h[i] = input.nextInt();
            total = total + h[i];
        }
        // finding average
        double avg = total/ppl;
        // for loops to read the heights
        for(int i = 0; i < h.length; i++){
            // if height is above average
            if(h[i] > avg){
                // output to screen
                System.out.println(h[i]);
            }
        }
    }
}
