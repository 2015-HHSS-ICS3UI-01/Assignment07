
import java.util.Scanner;

/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
/**
 *
 * @author guanv6321
 */
public class A7Q5 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Scanner input = new Scanner(System.in);
        // user input for how many people
        System.out.println("How many people?");
        int ppl = input.nextInt();
        // create an array with the size of how many people there are
        int[] order = new int[ppl];
        // variable for median
        int median;
        // for loop to enter marks
        for (int i = 0; i < ppl; i++) {
            System.out.println("Enter the mark:");
            int mark = input.nextInt();
            order[i] = mark;
        }
        // for loop to rearrange numbers
        for (int a = 0; a < ppl; a++) {
            // must be  number of people -1 because array numbers start with 0
            for (int i = 0; i < ppl - 1; i++) {
                 // variable for the number after the previous number was swapped 
                int next = i + 1;
                // extra variable to store previous number
                int temp;
                // if previous number is greater than number after
                if (order[i] > order[next]) {
                    temp = order[i];
                    // swaps the numbers
                    order[i] = order[next];
                    order[next] = temp;
                }
            }
        }
        // prints out the rearranged order of numbers
        System.out.println("Ascending order:");
        for (int ascend = 0; ascend < ppl; ascend++) {
            System.out.println(order[ascend]);
        }
        // if there is an odd number of people
        if(ppl%2==1){
            // finding which number is median
            median = (ppl+1)/2;
            // outputs the median
            System.out.println("Median: " + order[median-1]);
        }
        // if there is an even number of people
        if(ppl%2==0){
            // finding which two numbers were in middle
            median = ppl/2;
            // finding average of those two numbers
            double avg = (order[median-1] + order[median])/2;
            // outputs the new median
            System.out.println("Median:" + avg);
        }
    }
}

