
import java.util.Scanner;

/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
/**
 *
 * @author voigr4865
 */
public class A7Q4 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        int n;
        int swap;
        Scanner input = new Scanner(System.in);//scanner for this code

        n = 10;//have an easy integer to hold the value of 10

        int array[] = new int[n];//set an array to this integer

        System.out.println("Enter " + n + " Marks");//tells you to enter 10 marks

        for (int i = 0; i < n; i++) {
            array[i] = input.nextInt();//set all of the numbers inputted to an array
        }

        for (int c = 0; c < (n - 1); c++) {
            for (int d = 0; d < n - c - 1; d++) {
                if (array[d] > array[d + 1])//if the first number is bigger then the one after it 
                {
                    swap = array[d];//have the integer swap equal the bigger number
                    array[d] = array[d + 1];//have the bigger number = the smaller number
                    array[d + 1] = swap;//swap them 
                }
            }
        }

        System.out.println("Marks in order are:");//

        for (int i = 0; i < n; i++) {
            System.out.println(array[i]);//outprint all of the swapped integers
        }
    }
}
