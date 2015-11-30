
import java.util.Scanner;

/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author stahc1596
 */
public class A7Q1 {

    
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        double answer = 0;
        System.out.println("Please input the amount of marks.");
        int students = input.nextInt();
        int[] marks = new int [students];
        System.out.println("Enter a mark for each student.");
        for (int e = students -1; e > -1; e--){
            marks[e] = input.nextInt();
            answer = answer + marks[e];
        
        }
        answer = answer/students;
        System.out.println("The average marks of the students is " + answer);
    }
}
