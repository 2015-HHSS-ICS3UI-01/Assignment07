
import java.util.Scanner;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
/**
 *
 * @author RARES
 */
public class A7Q5 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here

        //Create a scanner to recieve input 
        Scanner input = new Scanner(System.in);
        //Ask for the amount of marks
        System.out.println("please enter the amount of marks ");
        //Create a variable to store the amount of marks 
        int amountMarks = input.nextInt();

        //Make the amount of numbers equal to the amount entered  
        int[] numbers = new int[amountMarks];

        //Where r is equal to zero and less than the amount of open spaces in numbers, allow number to be inputted
        for (int r = 0; r < numbers.length; r++) {
            System.out.println("please enter the marks ");
            //allow user to enter numbers  
            numbers[r] = input.nextInt();

        }

        //Loop when x < the amount
        for (int x = 0; x < amountMarks - 1; x++) {
            //int y begins one more than x and if it is < 9 
            for (int y = x + 1; y < amountMarks; y++) {
                if (numbers[x] > numbers[y]) {
                    //crate a temp variable to store the number in place y 
                    //Make a variable to store the numbers in y's place
                    int secondNum = numbers[y];
                    //Make the number in y's place equal to the number in x's place
                    numbers[y] = numbers[x];
                    //Make the number in x's place equal to the secondNum int (number in spot 1 aka second number)
                    numbers[x] = secondNum;

                }

            }
        }
        //Output the numbers from least to greatest
        System.out.println("The numbers from least to greatest are... ");
        for (int i = 0; i < numbers.length; i++) {
            System.out.println(numbers[i]);
        }
        //Make an integer to store the remaining amount
        int number2 = amountMarks % 2;
        //if the remainder is 0, the number is even 
        if (number2 == 0) {
            //Make a variable to store the first median number  
            int firstLocation = amountMarks / 2;
            //Make a variable to store the second median number
            int secondLocation = amountMarks - 1;
            //Calculate their average
            int median = ((numbers[firstLocation] + numbers[secondLocation]) / 2);
            //Output the median
            System.out.println("The median number is " + median);
            //Otherwise, if the numbers are not even 
        } else {
            //Find the median number and store it as a variable
            int medianLocation = amountMarks / 2;
            //make a varible that stores the number at the middle spot  
            int medianEven = numbers[medianLocation];
            //Output the median number 
            System.out.println("The median number is " + medianEven);
        }

    }

}
