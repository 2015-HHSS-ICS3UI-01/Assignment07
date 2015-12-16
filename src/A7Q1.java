
import java.util.Scanner;

/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
/**
 *
 * @author moraj0721
 */
public class A7Q1 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {

        //Make the scanner
        Scanner input = new Scanner(System.in);

        //Ask how many students are in the class
        System.out.println("How many students are in the class? ");
        int num = input.nextInt();

        //Ask for students marks
        System.out.println("What are their marks?");
        int[] marks = new int[num];
        for (int position = 0; position < num; position++) {
            System.out.println("Enter mark " + position);

            //put the marks into the array
            int mark = input.nextInt();
            marks[position] = mark;

        }
        
        //add all the marks into the variable
        int previous = 0;
        for (int i = 0; i < num; i++) {
            previous = previous + marks[i];

            
        }
        //divide the sum by how many marks there are
        int ave = previous / num;
            System.out.println("The class average is " + ave + "%");
    }
}