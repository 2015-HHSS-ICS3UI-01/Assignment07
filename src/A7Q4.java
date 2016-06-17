
import java.util.Scanner;

/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
/**
 *
 * @author guanv6321
 */
public class A7Q4 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Scanner input = new Scanner(System.in);
        // create an array with the size of 10
        int[] order = new int[10];
        // for loop to input marks
        for (int i = 0; i < 10; i++) {
            System.out.println("Enter the mark:");
            int mark = input.nextInt();
            order[i] = mark;
        }
        // for loop to rearrange numbers
        for(int a = 0; a < 10; a++){
            // must be 9 because array numbers start with 0
            for(int i = 0; i < 9; i++){
                // variable for the number after the previous number was swapped 
                int next = i + 1;
                // extra variable to store previous number
                int temp;
                // if previous number is greater than number after
                if(order[i] > order[next]){
                    temp = order[i];
                    // swaps the numbers
                    order[i] = order[next];
                    order[next] = temp;
                }
            }
        }
        // prints out the rearranged order of numbers
        System.out.println("Ascending order is");
        for(int ascend = 0; ascend < 10; ascend++){
            System.out.println(order[ascend]);
        }
    }
}
