/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */


import java.util.Scanner;

/**
 *
 * @author dhalt0019
 */
public class A7Q5 {

    private static int x;
    private static int y;

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Scanner input = new Scanner(System.in);

        System.out.println("Please enter the amount of marks");

        int amount = input.nextInt();

        int[] marks = new int[amount];


        for (int i = 0; i < marks.length; i++) {

            System.out.println("Please enter the marks in any order");

            marks[i] = input.nextInt();
        }
        // if x is greater then 9, repeat
        for (x = 0; x < amount - 1; x++) {
            // y is one ahead of x as long as it is less then nine
            for (y = x + 1; y < amount; y++) {
                if (marks[x] > marks[y]) {
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
        // create another variable to store the amouunt
        int mark2 = amount % 2;
        // if the marks are an even number
        if (mark2 == 0){
            // create an integer to store the first median number
            int spot1 = amount / 2;
            // second integer to store ther second median number and is one less
            int spot2 = amount - 2;
            // calcualte the median between the two
            int median = ((marks[spot1] + marks[spot2]) / 2);
            // tell em
            System.out.println("The median number is " + median);
            
            // if marks being calcualted are an odd number
        }else{
            // create a variable to store the middle number in the array
            int medianspot = amount / 2;
            // store that number
            int even = marks[medianspot];
            // tell em
            System.out.println("The median number is " +  even);
        }
    }
}