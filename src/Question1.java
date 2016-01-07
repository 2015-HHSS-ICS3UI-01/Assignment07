
import java.util.Scanner;

/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author agott2059
 */
public class Question1 {

    
    public static void main(String[] args) {
        //create scanner
        Scanner input = new Scanner(System.in);
        //get number of students from user
        System.out.println("Enter number of people in class: ");
        int studentNum = input.nextInt();
        //create marks array that has as many elements as studentNum
        int[] marks = new int[studentNum];
        //get marks from user, request marks as many times as studentNum
        System.out.println("Enter mark: ");
        //get marks and store in array as many times as studentNum
        for (int i = 0; studentNum > i; i = i + 1) {
            int mark = input.nextInt();
            //store in space i (i goes up everytime loop runs)
            marks[i] = mark;
        }
        //create variable for sum of all the marks
        double sum = 0;
        //go through the array as many time as it is large
        for (int i = 0; i < marks.length; i++) {
            //store every number in sum
            sum = sum + marks[i];
        }
        //find average by dividing the sum by the number of elements
        double average = sum / marks.length;
        //output average
        System.out.println("The average mark is: " + average + "%");
    }
}
