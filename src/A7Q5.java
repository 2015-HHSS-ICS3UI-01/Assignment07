
import java.util.Scanner;

/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author pircn0556
 */
public class A7Q5 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        //create scanner
        Scanner input = new Scanner(System.in);
        
        //how many marks
        System.out.println("How many marks?");
        int marks = input.nextInt();
        
        //create array for the marks
        int[] sort = new int[marks];

        //get values for array
        System.out.println("Enter the marks: ");
        for (int i = 0; i < sort.length; i++) {
            sort[i] = input.nextInt();
        }

        //sort the numbers
        for (int x = 0; x < sort.length; x++) {
            for (int y = x + 1; y < sort.length; y++) {
                int temp = sort[x];
                if (sort[x] > sort[y]) {
                    sort[x] = sort[y];
                    sort[y] = temp;
                }

            }
        }
        //output the sorted numbers
        System.out.println("the numbers sorted are:");
        for (int i = 0; i < sort.length; i++) {
            System.out.println(sort[i]);
        }
        System.out.println();
        
        //find the median
        if(marks%2==0){
            int medianOne = marks/2;
            int medianTwo = medianOne-1;
            double median = sort[medianOne]+sort[medianTwo];
            median = median/2;
            System.out.println("The median is: "+median);
        }else{
            int median = marks/2;
            System.out.println("The median is: "+sort[median]);
        }
       
    }
}
