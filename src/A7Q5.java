
import java.util.Scanner;

/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author lalim9800
 */
public class A7Q5 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        //new scanner 
        Scanner input = new Scanner(System.in);
        //ask user to enter how many marks there are 
        System.out.println("please enter the amount of marks ");
        //allow user to enter amount of marks and store it in a variable 
        int amount = input.nextInt();


        //set the amont of numbers, to the amount entered by the user 
        int[] numbers = new int[amount];




        //as long as i is grater les than the amout of spaces avalible in nummbers allow user to enter a number 
        for (int i = 0; i < numbers.length; i++) {
           
            System.out.println("please enter the marks ");
            //allow user to enter numbers 
            numbers[i] = input.nextInt();

        }
        //AS LONG AS X IS LESS THAN  the amount REPEAT 
        for (int x = 0; x < amount-1; x++) {
            //int y starts at one avove x and as long as it is less than 9 
            for (int y = x + 1; y < amount; y++) {
                if (numbers[x] > numbers[y]) {
                    //crate a temp variable to store the number in place y
                    int temp = numbers[y];
                    //set the number in spot y equal to the number in spot x
                    numbers[y] = numbers[x];
                    //set the number in spot x to the temp integer(number in spot 1)
                    numbers[x] = temp;


                }

            }
        }
        //tell user the numbers in acending order 
        System.out.println("The numbers in ascending order are");
        for (int i = 0; i < numbers.length; i++) {
            System.out.println(numbers[i]);
        }

        
        
    }
}

    

