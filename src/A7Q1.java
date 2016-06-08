/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */


import java.util.Scanner;

/**
 *
 * @author dhalt0019
 */
public class A7Q1 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Scanner input = new Scanner(System.in);
        System.out.println("Please enter the number of students in the class");
        int students = input.nextInt();
        // make a variable to store the marks
        int [] marks = new int [students];
        // let the user enter enter in the marks as long as i is greater or equal to the number of students
        for(int i = 0; i <marks.length; i++){
            // ask them to enter the marks in
            System.out.println("Please enter the marks");
            // where they put the marks in
            marks [i] = input.nextInt();
        }
        // get all the total amount of marks 
        int total = 0;
         for(int i = 0; i <marks.length; i++){
             
             total = total + marks[i];
         }
         // find the average 
         int average = total / students;
         // tell the user what the average of the class is
         System.out.println("The class average is " + average);
    } 
}
