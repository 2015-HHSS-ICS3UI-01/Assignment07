
import java.util.Scanner;

/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
/**
 *
 * @author pircn0556
 */
public class A7Q1 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        //create scanner
        Scanner input = new Scanner(System.in);
        
        //get amount of students
        System.out.println("How many students in the class?");
        int students = input.nextInt();
        
        //make an array of amount of students
        double[] average = new double[students];

        //get array values(marks)
        System.out.println("Enter the marks:");
        for (int i = 0; i < average.length; i++) {
            average[i] = input.nextDouble();
        }
        
        //add the array values
        double studentAverage = 0;
        for (int i = 0; i<average.length;i++){
        studentAverage = studentAverage + average[i];
    }
        //get average of all students
        studentAverage = studentAverage/students;
        
        //round to two decimal places
        studentAverage = Math.round(studentAverage * 100) / 100.0;

        System.out.println("The class average is "+studentAverage);


    }
}
