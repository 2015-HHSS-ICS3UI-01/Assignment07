
import java.util.Scanner;

/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
/**
 *
 * @author voigr4865
 */
public class A7Q5 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here

        int swap;
        
        Scanner input = new Scanner(System.in);//scanner for this code

        System.out.println("Enter number of marks you wish to sort");
        int n = input.nextInt();//set n to a number that is entered by the user 
        int array[] = new int[n];//set the int to an array

        System.out.println("Enter " + n + " Marks");//print out the inputted number by the user

        for (int i = 0; i < n; i++) {
            array[i] = input.nextInt();//count throught the array of all the numbers inputted
        }

        for (int c = 0; c < (n - 1); c++) {
            for (int d = 0; d < n - c - 1; d++) {
                if (array[d] > array[d + 1]) {//if d is bigger then the number in front of it   
                    swap = array[d];//have sway equal d
                    array[d] = array[d + 1];//then have d equal to the number infront of it 
                    array[d + 1] = swap;//then swap
                }
            }
        }

        System.out.println("Marks sorted:");

        for (int i = 0; i < n; i++) {
            System.out.println(array[i]);//pring out the new swapped list of numbers
        }
        System.out.print("The median is:");

        if (array.length % 2 == 0) {//if thwe number of numbers entered is even
            int mid = array[n / 2];//take the array n and devide it by two
            int mid2 = array[mid - 1];//then take the number below it 
            double median = ((n / 2 + mid2) / 2.0);//add them and devide them by two make this a double for accuracy
            System.out.println(median);//outprint this median

        } else {//if the number of marks entered is odd
            int median = array[n / 2];//take the middle number
            System.out.println(median);//ouprint that number
            
        }
    }
}
