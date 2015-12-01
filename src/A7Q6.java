
import java.util.Scanner;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
/**
 *
 * @author Administrator
 */
public class A7Q6 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        //Generates scanner
        Scanner in = new Scanner(System.in);
        // asks for marks
        System.out.println("How many students are there?");
        int n = in.nextInt();
        // n representing how many students
        int[] array = new int[n];
        // asks for marks to put
        int previous = 0;
        
        // asks for marks
        System.out.println("Enter the marks!");
        // A counted loop assigning marks to students
        for (int i = 0; i < n; i++) {
            int mark = in.nextInt();
            // the "equation" that organizes marks to students
            array[i] = mark;
            previous = mark + previous;
            if (i == (n - 1)) {
                double answer = (previous / n);
                double math = Math.round(answer * 100) / 100.0;
                System.out.println("The class average is " + math + "%");
            }
        }// This chunk is just used to order them accordingly 
        for (int organizer = 0; organizer < n; organizer++) {
            // x is a variable I used to organize numbers nicely and not give out error
            int x = n - 1;
            
            // A counted loop used to set numbers in ascending pair (e.g 9,10.. 235,953..)
            for (int i = 0; i < x; i++) {
                // A variable used for the number after the previus one that's being swapped with
                int next = i + 1;
                // Temp is just to not mess with order, ensures numbers to not be overwritten
                int temp;
                // if condition stating if previous number is greater than the number after
                if (array[i] > array[next]) {
                    // Temp set as the number that's being compared 
                    temp = array[i];
                    //Swaps the bigger number with smaller
                    array[i] = array[next];
                    array[next] = temp;

                }

            }

        }
        // Prints out lowest mark and highest mark in class
        System.out.println("The lowest mark in the class is " + array[0] + "%\nThe highest mark in the class " + array[n - 1] + "%");
    }
}
