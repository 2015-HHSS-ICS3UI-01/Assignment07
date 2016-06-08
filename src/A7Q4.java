/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */


import java.util.Scanner;

/**
 *
 * @author dhalt0019
 */
public class A7Q4 {
    private static int x;
    private static int y;

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Scanner input = new Scanner(System.in);
        // variable to store the 10 marks
        int[] marks = new int[10];
        // let the user input the 10 marks
        for (int i = 0; i < marks.length; i++) {

            System.out.println("Please enter the 10 marks in any order");

            marks[i] = input.nextInt();
        }
        // if x is greater then 9, repeat
        for (x = 0; x < 9 - 1; x++) {
            // y is one ahead of x as long as it is less then nine
            for (y = x + 1; y < 10; y++) {
                if(marks[x] > marks[y]){
                    // create a variable for marks[x]
                    int order = marks[x];
                    // marks[x] equals marks[y]
                    marks[x] = marks[y];
                    // marks[y] equals the variable, order
                    marks[y] = order;
                }                
            }
        }
        // tell them the marks in ascending order
        System.out.println("The marks in ascending order are");
        for (int i = 0; i < marks.length; i++) {            
            System.out.println(marks[i]);
        }
    }
}