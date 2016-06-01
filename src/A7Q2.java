
import java.util.Scanner;

/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
/**
 *
 * @author yuk4142
 */
public class A7Q2 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Scanner in = new Scanner(System.in);
        System.out.println("How many people are there?"); //asks how many people's heights are there
        int num = in.nextInt();//sets variable as #people height

        int[] heights = new int[num];//set array, with length being #heights given

        System.out.println("What are the heights of each of the individuals?");//asks for heights of everyone
        //now find avg of heights

        double sum = 0;//create sum variable
        for (int r = 0; r != num + 1; r++) {//make for loop for 0 up to number of heights inputed
            heights[r] = in.nextInt();//add heights inputed to array

            sum = sum + heights[r];//add heights inputed for final sum

            if (r == num - 1) { // if the heights have been inputed for #people present
                double avg = sum / num;//find average by dividing sum of heights by #people
                System.out.println("The above average heights are:");
                for (r = 0; r != num; r++) {// //go through the height array starting at 0(1st position)
                    if (heights[r] > avg) {//if height in that position is greater than the average 
                        System.out.println(heights[r]);//then print out the height
                    }
                }

            }
        }

    }
}