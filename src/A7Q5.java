
import java.util.Scanner;

/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
/**
 *
 * @author moraj0721
 */
public class A7Q5 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here

        //Make the scanner
        Scanner input = new Scanner(System.in);

        //ask for the number of intergers they want to input
        System.out.println("Enter how many number you want to input.");
        int lines = input.nextInt();

        //ask for the integers
        int[] nums = new int[lines];
        for (int pos = 0; pos < lines; pos++) {
            System.out.println("Enter integer " + pos);
            int swittch = input.nextInt();

            nums[pos] = swittch;
        }
        //put them in order
        for (int loops0 = 0; loops0 < (lines - 1); loops0++) {

            for (int loops1 = loops0 + 1; loops1 < lines; loops1++) {

                if (nums[loops0] > nums[loops1]) {
                    int temp = nums[loops0];
                    nums[loops0] = nums[loops1];
                    nums[loops1] = temp;
                }
            }
        }
        System.out.println("The integers in ascending order are");
        for (int loops3 = 0; loops3 < lines; loops3++) {
            System.out.print(nums[loops3] + ",");

        }
        
        
        int halfOf = lines%2;
        
        //if the number of lines is even
        if(halfOf == 0){
       
            //cut the number in half to find the first middle number
        int half = (lines/2);
        
        //get the next position to find the second middle number
        int result = half + 1;
        
        //add them together and get the median
        double med1 = (nums[half] + nums[result]) / 2.0;
            System.out.println("The median is " + med1);
            
            
        }else{
           {
               //if the the number is not even cut the lines in half, round out and print the 
             int mid = lines/2;
                System.out.println("The median is " + nums[mid]);
            }
        }
    }
}

