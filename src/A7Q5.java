
import java.util.Scanner;

/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
/**
 *
 * @author whitb0039
 */
public class A7Q5 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here

        //inport new scanner
        Scanner in = new Scanner(System.in);

        // create the median integer
        int median = 0;

        //ask how many students are in the class
        System.out.println("How many students are in the class?");

        //the next input is the number of students
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
        ascending(marks, numberOfStudents); //run the method that prints the marks
        if ((numberOfStudents / 2) % 2 == 1) { //if the number of students is odd
            median = marks[numberOfStudents / 2]; //the midian is the middle number
        } else { //otherwise
            int middle1 = marks[(numberOfStudents + 1) / 2]; //find the higher middle number
            int middle2 = marks[(numberOfStudents - 1) / 2]; //find the lower middle number
            median = (middle1 + middle2) / 2; //find the average of the 2
        }
        System.out.println("");
        System.out.println("The median is " + median); //output the median
    }

    public static void ascending(int[] marks, int numberOfStudents) {
        System.out.print("The numbers in ascending order are: "); //output the message

        for (int i = 0; i < numberOfStudents; i++) { //loop 10 times
            System.out.print(marks[i] + " "); //output the current number in the array
        }



    }
}
