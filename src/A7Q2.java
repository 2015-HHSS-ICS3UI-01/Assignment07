
import java.util.Scanner;

/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author hadik9595
 */
public class A7Q2 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        
        int height;
          System.out.println("How many people are calculating average of height for? in Centemeter");
        int n = in.nextInt();
        
        int previous = 0;
        int[] aryNums = new int[n];
        double average = ((previous)/n);
        
        System.out.println("Enter the heights");
        for (int people = 0; people < n; people++) {
             height = in.nextInt();
            aryNums[people] = height;
          previous = height + previous; 
          
       if(people == (n - 1)){
                 average = ((previous)/n);
                 System.out.println("Average is "+average);
                 for(people = people; people > 0; ){
                     aryNums[people] = height;
                     
                     if(average < aryNums[people] ){
                         
                     System.out.println("The heights.. " +  aryNums[people]);
                    people--;
                 }else{
                         people--;
                     }
                 }
}
    }
}
}

