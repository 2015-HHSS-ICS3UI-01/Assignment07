
import java.util.Scanner;

/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
/**
 *
 * @author yuk4142
 */
public class A7Q1 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Scanner in = new Scanner(System.in);

        System.out.println("How many students in the class?");//asks how many students in class
        int snum = in.nextInt();//variable for #students in class

        int[] marks = new int[snum];//array to find sum of test scores
        System.out.println("Enter the marks:");//asks for marks of each test

        double sum = 0;//create sum variable
        for (int r = 0; r != snum + 1; r++) { //for counting variable r, increase r until it hits i, to get all array info

            marks[r] = in.nextInt();//marks variable

            sum = sum + marks[r];   //add each section in the array each time
            if (r == snum - 1) {//if all marks have been entered in

                double avg = sum / snum;//find average by dividing sum of array by number of marks
                //then round to 2 decimal places by multiplying by 100, rounding, and then dividing by 100
                avg = avg * 100;
                avg = Math.round(avg);
                avg = avg / 100;
                //print out avg
                System.out.println("The class average is " + avg + ".");
            }
        }
        //

    }
}
