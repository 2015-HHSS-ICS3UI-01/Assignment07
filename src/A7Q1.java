
import java.util.Scanner;

/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
/**
 *
 * @author pintm1551
 */
public class A7Q1 {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);                                  //Create Scanner
        System.out.println("How many students are in the class");                //Asks to input number of students
        int n = input.nextInt();                                                 //recieves number
        int c = n;                                                               //creates int to compare n
        System.out.println("Enter the marks");                                   //Asks to input number
        int[] marks = new int[n];                                                //all percents added up
        while (c > 0) {                                                          //one percent per student
            c = c - 1;                                                           //next student
            marks[c] = input.nextInt();                                          //adds all percents up
        }
        c = n;
        double avg = 0;
        while (c > 0) {                                                          //one percent per student
            c = c - 1;                                                           //next student
            avg = avg + marks[c];                                                //adds all percents up
        }
        avg = avg / n;                                                           //finds average
        avg = Math.round(avg);
        System.out.println("The average is " + avg);                             //Asks to input number
    }
}
