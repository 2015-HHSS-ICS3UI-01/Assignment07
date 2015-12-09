
import java.util.Scanner;

/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
/**
 *
 * @author iorgs3184
 */
public class A7Q2 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {

        //new scanner
        Scanner input = new Scanner(System.in);

        //asks user how many people
        System.out.print("How many people are there? ");
        int people = input.nextInt();

        //asks for all the heights in centimetres
        System.out.println("Enter the heights(In centimetres): ");
        //makes array of amount of people entered
        int[] nums = new int[people];
        //gets number from when the user entered at people
        for (int i = 0; i < nums.length; i++) {
            nums[i] = input.nextInt();
        }
        double average = 0;
        //adds all heights together
        for (int i = 0; i < nums.length; i++) {
            average = average + nums[i];
        }
        //finds average by dividing total by people
        average = average / people;
        //roundeds to nearest hundreth place value
        average = Math.round(average * 100) / 100f;
        //prints out the average height in centimetres
        System.out.println("The average height is " + average + "cm");
    }
}
