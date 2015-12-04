
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
        //The user enters the amount of students with marks.
        int students = input.nextInt();
        int[] marks = new int[students];
        System.out.println("Enter a mark for each student.");
        //The marks of the students are entered in below.
        for (int e = students; e < marks.length; e++) {
            marks[e] = input.nextInt();
            //Whenever a mark is added, they get added together with the other marks.
            answer = answer + marks[e];

        }
        //The marks are then divided by the amount of students to get the class average.
        answer = answer / students;
        //The user recieves the class average.
        System.out.println("The average marks of the students is " + answer);
    }
}
