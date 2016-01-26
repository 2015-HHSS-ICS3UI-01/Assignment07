
import java.util.Scanner;

/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
/**
 *
 * @author malcr1272
 */
public class A7Q4 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
//create scanner
        Scanner in = new Scanner(System.in);

        //create array
        int array[] = new int[10];
        //ask for 10 marks
        System.out.println("Enter in 10 marks");
        //insert 10 marks into the array with a for loop
        for (int i = 0; i < 10; i++) {
            int marks = in.nextInt();
            array[i] = marks;
        }
        //sort marks with a loop
        for (int i = 0; i < 9; i++) {
            //repeat for last spot in array
            for (int j = i + 1; j < 10; j++) {
                //switch out 2 numbers to make them ascending
                if (array[i] > array[j]) {
                    int temp = array[i];
                    array[i] = array[j];
                    array[j] = temp;

                }
            }
        }
        //output ascending orders using loop
        System.out.println("The marks in ascending order are: ");
        for (int i = 0; i < 10; i++) {
            System.out.println(array[i]);
        }

    }
}