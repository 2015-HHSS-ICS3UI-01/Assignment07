
import java.util.Scanner;

/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author malcr1272
 */
public class A7Q6 {

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
        System.out.println("The highest number is " + array[number - 1]);

          //output ascending orders using loop
        System.out.println("The Lowest mark is: " + array[0]); 
        int median = 0;
          for (int i = 0; i < number  ; i++) {
              int add = array[i];    
              median = median + add;  
          }
          
          System.out.println("The average is " + (median / number));
                
           }
     
        
    }

