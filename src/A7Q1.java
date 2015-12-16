
import java.util.Scanner;

/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
/**
 *
 * @author moore3607
 */
public class A7Q1 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
//made a new scanner called input
        Scanner input = new Scanner(System.in);
        //prints "How many students are in the class?" onto the screen
        System.out.println("How many students are in the class?");
        //made a new integer called people and made it equal to the next input
        //from the user
        int people = input.nextInt();
        //created a new array called nums and it's amount of spaces is equal to people 
        int[] nums = new int[people];
        //created a new double called marks and made it equal to 0
        double marks = 0;
//prints "Enter the marks:" onto the screen
        System.out.println("Enter the marks:");
        //created an int called number and made it equal to 0 and while it is 
        //less than the value of people, the following commands will be executed
        //and 1 will be added to number
        for (int number = 0; number < people; number++) {
            //takes the next input from the user and puts into that spot of the
            //array
            nums[number] = input.nextInt();

            marks = marks + nums[number];
        }
        //created a new double and made it equal to marks divided by people
        double average = marks / people;
        //rounds average to two decimal places
        average = Math.round(average*100)/100.0;
        //prints "The class average is " + average + "%" onto the screen
        System.out.println("The class average is " + average + "%");
    }
}
