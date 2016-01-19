
import java.util.Scanner;

/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author watsk8668
 */
public class A7Q1 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        //input scanner
        Scanner input = new Scanner(System.in);
        
        //how many students
        System.out.println("How many students in the class?");
        int students = input.nextInt();
        
        // make an array of ints with as many spots as there are students
        double[] grades = new double[students];
        
        //enter all the grades
        for(int i = 0; i< grades.length; i++){
        System.out.println("Enter the marks:");
            grades[i] = input.nextDouble();
        }
        
        //add up all the grades in the array
        double total = 0;
        for(int i = 0; i < grades.length; i++) {
            total = total + grades[i];
        }
        
        //calculate the average
        double average = total / students;
        
        //your average is: (rounded to 2 digits)
        System.out.println("The class average is " + String.format("%.2f",average) + "%");
    }
}