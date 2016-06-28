
import java.util.Scanner;

/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
/**
 *
 * @author pintm1551
 */
public class A7Q2 {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);                                 //Create Scanner
        System.out.println("Input amount of people");                           //Asks to input number of people
        int n = input.nextInt();                                                //recieves number
        int c = n;                                                              //c is used for count
        int[] heights = new int[n];                                             //creates array with n people
        System.out.println("Input heights");                                    //asks to input heights
        while (c > 0) {                                                         //counts heights for n people
            c = c - 1;
            heights[c] = input.nextInt();
        }
        c = n;                                                                  //sets count back to n
        double avg = 0;                                                         //creates double for average
        while (c > 0) {                                                         //averages n heights
            c = c - 1;
            avg = avg + heights[c];
        }
        avg = avg / n;
        c = n;                                                                  //sets count as n
        System.out.println("The heights above average are:");                           //Asks to input number of people
        while (c > 0) {                                                         //goes through array to see what values are above average
            c = c - 1;
            if (heights[c] > avg) {
                System.out.println(heights[c]);
            }
        }
    }
}
