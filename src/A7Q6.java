
import java.util.Scanner;

/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author watsk8668
 */
public class A7Q6 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        //input scanner
        Scanner input = new Scanner(System.in);
        
        //ask for the size of the class
        System.out.println("How many people in the class?");
        int size = input.nextInt();
        
        // create array
        double[] marks = new double[size];
        
        //enter the marks
        System.out.println("Enter the marks: ");
        
        //enter the marks
        for(int i = 0; marks.length > i; i++){
            marks[i] = input.nextDouble();
        }
        
        //sort the marks from lowest to highest
        for (int x = 0; x < marks.length - 1; x++) {
            for (int y = x + 1; y < marks.length; y++) {
                double temp = marks[x];
                if (marks[x] > marks[y]) {
                    marks[x] = marks[y];
                    marks[y] = temp;
                }
            }
        }
        
        //the lowest mark is
        System.out.println("The lowest mark is " + marks[0] + "%");
        
        //sort the marks from highest to lowest
        for (int x = 0; x < marks.length - 1; x++) {
            for (int y = x + 1; y < marks.length; y++) {
                double temp = marks[x];
                if (marks[x] < marks[y]) {
                    marks[x] = marks[y];
                    marks[y] = temp;
                }
            }
        }
        
        //the highest mark is
        System.out.println("The highest mark is " + marks[0] + "%");
        
        //add up all the heights in the array
        double total = 0;
        for (int i = 0; i < marks.length; i++) {
            total = total + marks[i];
        }
        
        //calculate the average + print to the screen
        System.out.println("The average is " + (total / size ) + "%");
        
    }
}