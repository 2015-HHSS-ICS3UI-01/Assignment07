
import java.util.Scanner;

/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
/**
 *
 * @author whitb0039
 */
public class A7Q6 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here

        //create scanner
        Scanner in = new Scanner(System.in);

        System.out.println("How many students are in the class?");

        int numberOfStudents = in.nextInt();

        //create an array
        int[] marks = new int[numberOfStudents];

        //ask user for 10 marks
        System.out.println("Please enter " + numberOfStudents + " marks");


        //recieve all of the marks
        for (int a = 0; a < numberOfStudents; a++) { //loop 10 times
            marks[a] = in.nextInt(); //next input is mark[a]
        }

        for (int x = 0; x < numberOfStudents; x++) { //loop 10 times
            for (int i = 0; i < numberOfStudents - 1; i++) { //loop 9 times
                if (marks[x] < marks[i]) { //if the value of marks[x] is greater than marks[i]
                    int temp = marks[i]; //create a temp int of what marks[i] is
                    marks[i] = marks[x]; //swap marks[i] with marks[x]
                    marks[x] = temp; //swap marks[x] with the temp int
                } else {//otherwise do nothing
                }
            }
        }
        
        int average = 0; //create a variable for the average
        
        for (int y = 0; y < numberOfStudents; y++){ //loop until y meets the number of students
            average = marks[y] + average; //add up all of the numbers in the array
        }
        average = average/numberOfStudents; //find the average by dividing it by the number of students
        
        System.out.println("The lowest mark is " + marks[0]); //output the lowest mark
       
        System.out.println("The highest mark is " + marks[numberOfStudents - 1]); //output the highest mark
        
        System.out.println("The average is " + average); //output the average

    }
}
