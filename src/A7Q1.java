
import java.util.Scanner;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
/**
 *
 * @author RARES
 */
public class A7Q1 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        //Create a new scanner to recieve input
        Scanner input = new Scanner(System.in);
        //As for the amount of students in the class 
        System.out.println("please enter how many kids are in the class");
        //Allow for input of amount of students
        int students = input.nextInt();
        //Create a new integer to store the marks of the class
        int[] marks = new int[students];

        
        //Allow the input of marks only if i <= to the number of students/marks
        for (int i = 0; i < marks.length; i++) {
            //Ask for the input of marks 
            System.out.println("Please enter the marks");
            //Allow for the input of marks
            marks[i] = input.nextInt();
        }
        //Calculate the total marks
        int total = 0;
        for (int i = 0; i < marks.length; i++) {
            total = total + marks[i];
        }       //Create a variable to store the average  
        int avg = total/students;
        //Output the average 
        System.out.println("the class average is " + avg + "%");

    }

}
