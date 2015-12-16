
import java.util.Scanner;

/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author moraj0721
 */
public class A7Q6 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        //make the scanner
        Scanner input = new Scanner(System.in);

        //ask for how many numbers the user wants
        System.out.println("Enter how many number you want to input.");
        int students = input.nextInt();

        //ask for the students marks
        int[] marks = new int[students];
        for (int pos = 0; pos < students; pos++) {
            System.out.println("Enter integer " + pos);
            int swittch = input.nextInt();

            marks[pos] = swittch;
            
            System.out.println("The Class marks are ");
            for(int loops00 = 0; loops00 < students; loops00++){
                System.out.println(marks[loops00]);
            }
        }
        
        //get the students marks in order
        for (int loops0 = 0; loops0 < (students - 1); loops0++) {

            for (int loops1 = loops0 + 1; loops1 < students; loops1++) {

                if (marks[loops0] > marks[loops1]) {
                    int temp = marks[loops0];
                    marks[loops0] = marks[loops1];
                    marks[loops1] = temp;
                }
            }
        }
        
        
        for (int loops3 = 0; loops3 < students; loops3++) {
            

        }
        
        //add all the marks together
        int previous = 0;
        for (int i = 0; i < students; i++) {
            previous = previous + marks[i];

            
        }
        //get the average
        int ave = previous / students;
            System.out.println("The class average is " + ave + "%");
            
            //get the lowest mark
            int firstMark = marks[0];
            System.out.println("The lowest mark in the class is " + firstMark);
            
            //get the highest mark
            int lastpos = students - 1;
            System.out.println("The highest mark is " + marks[lastpos]);
    }
}
