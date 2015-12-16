
import java.util.Scanner;

/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
/**
 *
 * @author moore3607
 */
public class A7Q6 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        //created a new scanner called input
        Scanner input = new Scanner(System.in);
        //asks the user how many epople are in the class
        System.out.println("What is the size of the class?");
        //size is equal to the next input from the user
        int size = input.nextInt();
        //the "nums" array has equal spots to "size"
        int nums[] = new int[size];
        //created variables marks, temp, and all and made them equal to 0
        int marks = 0;
        int temp = 0;
        double all = 0;
//tells the user to enter the marks
        System.out.println("Enter the marks.");
        //loops until every person in the class has their mark inputed
        for (marks = 0; marks < size; marks++) {
            nums[marks] = input.nextInt();
        }

//moves the lowest mark to the first spot in the array and stops when it has
        //gone through all of the numbers
        for (int i = 0; i < size; i++) {

            for (int n = 0; n < size; n++) {
                if (nums[i] < nums[n]) {
                    temp = nums[i];
                    nums[i] = nums[n];
                    nums[n] = temp;
                }
            }
        }
        //adds all of the marks together
        for (int a = 0; a < size; a++) {
            all = all + nums[a];
        }
        //divides the sum of the marks by the size of the class
        double average = all / size;
        //prints out the new number order (least to greatest)
        System.out.println("Here is the new number order.");
        for (int finale = 0; finale < size; finale++) {
            System.out.println(nums[finale]);
        }
        //prints the top mark, the lowest mark, and the average mark 
        //onto the screen
        System.out.println("The highest mark is " + nums[size - 1]);
        System.out.println("The lowest mark is " + nums[0]);
        System.out.println("The class average is " + average);

    }
}
