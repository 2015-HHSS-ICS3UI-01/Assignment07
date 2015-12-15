
import java.util.Scanner;

/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
/**
 *
 * @author lalim9800
 */
public class A7Q1 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        //new scanner 
        Scanner input = new Scanner(System.in);
        //ask user how ay kids are in the class 
        System.out.println("please enter how many kids are in the class");
        //allow user to enter the amount of kids 
        int kids = input.nextInt();
        //make new integer that will store all the marks in the class
        int[] marks = new int[kids];

        //allow user to enter the marks in for each student as longs as i is less then or eual to the amount of kids /marks 
        for (int i = 0; i < marks.length; i++) {
            //ask user to enter marks 
            System.out.println("Please enter the marks");
            //allow user to enter marks 
            marks[i] = input.nextInt();
        }
        //calculate the total of marks entered by the user 
        int total = 0;
        for (int i = 0; i < marks.length; i++) {
            total = total + marks[i];
        }       //create no variable that stores the averge of the marks 
        int average = total / kids;
        //tell user the average 
        System.out.println("the class average is " + average + "%");


    }
}