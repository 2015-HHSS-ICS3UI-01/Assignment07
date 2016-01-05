
import java.util.Scanner;

/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
/**
 *
 * @author mitrm7692
 */
public class A7Q6 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        //Create a scanner
        Scanner input = new Scanner(System.in);
        //Asks user how many students are in class
        System.out.println("Please enter the number of students ");
        //Int for the number of students or marks
        int numOfMarks = input.nextInt();
        //Make x amount of spots in the array depending on how many students are in the class
        int[] marks = new int[numOfMarks];
        //Asks user to enter the marks of the students
        System.out.println("Please enter the marks of the students ");
        //loops x times for the number of marks being entered depending on how many students
        for (int i = 0; i < numOfMarks; i++) {
            //Makes int mark for marks being entered
            int mark = input.nextInt();
            //marks[i] is euqal to the mark that is entered 
            marks[i] = mark;
        }
        //loops x amount of times to sort the marks lowest to highest depending on how many students are in the class
        for (int sort = 0; sort < numOfMarks; sort++) {
            //loops how ever many times depending on the number of marks 
            for (int i = 0; i < numOfMarks - 1; i++) {
                //nxtMark is equal to the position of the array plus 1 to go to the next position 
                int nxtMark = i + 1;
                //int temp is a temporary variable
                int temp;
                //if marks[i] is greater than marks[nxtMark]  
                if (marks[i] > marks[nxtMark]) {
                    //int temp is equal to marks[i]
                    temp = marks[i];
                    //marks[i] is equal to marks[nxtMark]
                    marks[i] = marks[nxtMark];
                    //marks[nxtMark] is equal to temp
                    marks[nxtMark] = temp;
                }
            }
        }
        //runs BubbleSorting method with the marks
        BubbleSorting(marks, numOfMarks);
        //The lowest mark is the mark in the first spot in the array when sorted
        int lowest = marks[0];
        //The highest mark is the mark in the last spot in the array when sorted
        int highest = marks[numOfMarks - 1];
        //makes the int avg equal 0
        int avg = 0;
        //loops how ever many times depending on the number of students/ marks 
        for (int i = 0; i < numOfMarks; i++) {
            //avg is equal to the marks added together plus 0
            avg = marks[i] + avg;
        }
        //average is equal to the average divided my the number of students
        avg = avg / numOfMarks;
        //Prints out a blank line
        System.out.println("");
        //Outputs the lowest mark of the entered amount of people
        System.out.println("The lowest mark is " + lowest + ".");
        //Outputs the highest mark of the entered amount of people
        System.out.println("The highest mark is " + highest + ".");
        //Outputs the average mark of the entered amount of people
        System.out.println("The average mark is " + avg + ".");
    }

    //makes a new method to make marks for lowest to highest
    public static void BubbleSorting(int[] marks, int numOfStudents) {
        //outputs "The marks from lowest to highest order are: "
        System.out.print("The marks from lowest to highest order are: ");
        //loops the lowestToHighest x amount of times depending on how many students were entered
        for (int lowestToHighest = 0; lowestToHighest < numOfStudents; lowestToHighest++) {
            //outputs the marks from lowest to highest order
            System.out.print(marks[lowestToHighest] + ", ");
        }
    }
}
