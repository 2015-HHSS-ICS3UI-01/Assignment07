
import java.util.Scanner;

/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author moore3607
 */
public class A7Q2 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        //made a new scanner called input
        Scanner input = new Scanner(System.in);
        //prints "How many people?" onto the screen
        System.out.println("How many people?");
        //made a new integer called people and made it equal to the next input
        //from the user
        int people = input.nextInt();
        //created a new array called nums and it's amount of spaces is equal to people
        int nums[] = new int [people];
        //created a new double called number and made it equal to 0
        double number = 0;
        //created a new integer called marks and made it equal to 0
        int height = 0;
        //prints "Enter the heights" onto the screen
        System.out.println("Enter the heights");
        //made height equal to 0 and while it is 
        //less than the value of people, the following commands will be executed
        //and 1 will be added to height
        for(height = 0; height < people; height++){
            nums[height] = input.nextInt();
            number = number + nums[height];
        }
        //created a new double and made it equal to marks divided by people
        double average = number / people;
        //rounds average to two decimal places
        average = Math.round(average*100)/100.0;
        //prints "The average height is " + average onto the screen
        System.out.println("The average height is " + average);
        
        //created a new integer called arraynums and made it equal to 0
        int arraynums = 0;
        //created a new integer called counter and made it equal to 0
        int counter = 0;
        //made arraynums equal to 0 and while it is 
        //less than the value of counter, the following commands will be executed
        //and 1 will be added to arraynums
        for(arraynums = -1; arraynums < counter; arraynums++){
            //if the current space in nums is more than average, it will be
            //displayed onto the screen
            if(nums[counter] > average){
                System.out.println(nums[counter]);
            }
            counter = counter + 1;
            //if counter is equal to people, the program will break out of
            //the for loop
            if(counter == people){
                break;
            }
        }
        
    }
}
