
import java.util.Scanner;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
/**
 *
 * @author munta
 */
public class A7Q3 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {

        //make new integer that will store 2 values 
        int[] numbers = new int[2];


        //new scanner 
        Scanner input = new Scanner(System.in);
        {
            //as long as i is grater les than the amout of spaces avalible in nuimbers allow user to enter a number 
            for (int i = 0; i < numbers.length; i++) {
                //ask i
                System.out.println("please enter two numbers");
                //allow user to enter numbers 
                numbers[i] = input.nextInt();

            }
            //if the number in spot 0 is grater than the number in spot 1 in sapce two swap the order 
            if (numbers[0] > numbers[1]) {
                //crate a temp variable to store the number in place 1 
                int temp = numbers[1];
                //set the number in spot 1 equal to the number in spot 0
                numbers[1] = numbers[0];
                //set the number in spot 0 to the temp integer(number in spot 1)
                numbers[0] = temp;

152

            }
            //tell the user the numbers in ascending order 
            System.out.println("the numbers in ascending order are " + numbers[0] + ", " + numbers[1]);
        }


    }
}
