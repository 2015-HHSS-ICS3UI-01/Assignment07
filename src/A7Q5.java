
import java.util.Scanner;

/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
/**
 *
 * @author malcr1272
 */
public class A7Q5 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        //create scanner
        Scanner in = new Scanner(System.in);

        //ask for length of array
        System.out.println("How many marks would you like to input? ");
        int number = in.nextInt();

        //create array
        int array[] = new int[number];
        //ask for 10 marks
        System.out.println("Enter in " + number + " marks");
        //insert 10 marks into the array with a for loop
        for (int i = 0; i < number; i++) {
            int marks = in.nextInt();
            array[i] = marks;
        }
        //sort marks with a loop
        for (int i = 0; i < number - 1; i++) {
            //repeat for last spot in array
            for (int j = i + 1; j < number; j++) {
                //switch out 2 numbers to make them ascending
                if (array[i] > array[j]) {
                    int temp = array[i];
                    array[i] = array[j];
                    array[j] = temp;

                }
            }
        }
        //output ascending orders using loop
        System.out.println("The numbers in ascending order are: ");
        for (int i = 0; i < number; i++) {
            System.out.println(array[i]);
        }
        //find the remainder of the number of marks
        int median = number % 2;
        //find the middle of the number of marks
        int answer = number / 2;
        //if there is no remainder output the middle number 
        if (median > 0) {
            System.out.println("Median is " + array[answer]);
        } else {
            //if there is a remainder find the other middle number 
            int middle = answer - 1;
            //find the average of the 2 middle updates
            int OtherMedian = (array[answer] + array[middle])/2;
            //output the average of the median
            System.out.println("The median is " + OtherMedian);


        }
    }
}
