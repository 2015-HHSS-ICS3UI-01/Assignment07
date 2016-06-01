
import java.util.Scanner;

/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
/**
 *
 * @author yuk4142
 */
public class A7Q3 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here\
        Scanner in = new Scanner(System.in);
        System.out.println("Enter two integers:");
        int integers[] = new int[2]; //create array with 2 spots
        //add in 2 numbers to array
        integers[0] = in.nextInt();
        integers[1] = in.nextInt();
        //if 1st number is bigger than the 2nd number
        if (integers[0] > integers[1]) {
            //make seperate integers for each spot in array(to save them)
            int int1 = integers[0];
            int int2 = integers[1];
            //them switch the integers in each array
            integers[0] = int2;
            integers[1] = int1;
            //print out integers in order
            System.out.println("The integers in ascending order are:" + " " + integers[0] + ", " + integers[1]);
        }
    }
}
