
import java.util.Scanner;

/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
/**
 *
 * @author pircn0556
 */
public class A7Q6 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        //create scanner
        Scanner input = new Scanner(System.in);

        //How many students in class
        System.out.println("How many students in class?");
        int students = input.nextInt();

        //create array
        int[] classMarks = new int[students];

        //get values for array
        System.out.println("Enter the marks of students: ");
        for (int i = 0; i < classMarks.length; i++) {
            classMarks[i] = input.nextInt();
        }

        //sort the numbers
        for (int x = 0; x < classMarks.length; x++) {
            for (int y = x + 1; y < classMarks.length; y++) {
                int temp = classMarks[x];
                if (classMarks[x] > classMarks[y]) {
                    classMarks[x] = classMarks[y];
                    classMarks[y] = temp;
                }
            }
        }

        //find lowest mark
        int lowestMark = classMarks[0];

        //find highest mark
        students = students - 1;
        int highestMark = classMarks[students];

        //find mark average
        int avg = 0;
        for (int i = 0; i < classMarks.length; i++) {
            avg = avg + classMarks[i];
        }
        avg = avg / students;
        
        //output the three numbers
        System.out.println("The lowest mark of the class is: "+lowestMark);
        System.out.println();
        System.out.println("The highest mark of the class is: "+highestMark);
        System.out.println();
        System.out.println("The average of the class is: "+avg);

    }
}
