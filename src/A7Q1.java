
import java.util.Scanner;

/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
/**
 *
 * @author hadik9595
 */
public class A7Q1 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // Generates scanner
        Scanner in = new Scanner(System.in);
        // asks for students marks
        System.out.println("How many students are in class?");
        int n = in.nextInt();
        // The array variable set with n equaling amount of students
        int[] aryNums = new int[n];
        int mark;
        // A variable set to keep adding previous number
        double previous = 0;

        // a for loop asking for marks, corresponds to amount of students
        System.out.println("Enter the marks");
        // Keeps adding until it reaches students
        
        for (int students = 0; students < n; students++) {
             mark = in.nextInt();
             // In this case students are independant variables and mark are dependant (x,y)
            aryNums[students] = mark;
            // a way of adding previous mark storing it
          previous = mark + previous; 
          
            // When all students marks are recorded, prints out answer, the n-1 is because 0 is counted
            if(students == (n - 1)){
                // calculates average by taking previous (total) / n (Amount of students)
                double answer = ((previous)/n);
                // Rounds it
                       double math = Math.round(answer*100)/100.0;
                   // Prints out average
                System.out.println("The average is " + math +"%");
            }
        }
            

        


    }
}
