
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
        // as usual generates scanner to read human input
        Scanner in = new Scanner(System.in);
        // int stores height
        int height;
        // asks for how many individuals for their heights
          System.out.println("How many people are calculating average of height for? in Centemeter");
        int n = in.nextInt();
        
        // an int just useful later on
        int previous = 0;
        // The most important part, an array variable used to store a height for each individual
        int[] aryNums = new int[n];
        
        // Asks for heights
        System.out.println("Enter the heights");
        // a counted loop, only functions when < n meaning when it reaches the amount of people it stops
        for (int people = 0; people < n; people++) {
             height = in.nextInt();
             // every individual is assigned a height
            aryNums[people] = height;
            // A formula of adding individuals heights and stores it as previous
          previous = height + previous; 
          
          // Since this is a one big counted loop, I made condition to only execute once heights are  ALL assigned
       if(people == (n - 1)){
           // formula used to calculate the initial average which is later used for a comparison
                 double average = ((previous)/n);
                 // Prints out average (additional step this wasn't required as part of question)
                 System.out.println("Average is "+ average);
                 // A counted loop used to examine every height and take into consideration
                 for(int loop = people; loop > 0;loop-- ){
                     
                     // If height is over average.. 
                     if(average < aryNums[loop] ){
                         // then it prints it out
                     System.out.println("Individuals who are above height .. " +  aryNums[loop]);
                    
                 // Otherwise those heights that are under average aren't printed
                 }else{
                         // However, since they're contained within the paramaters (amount of people) they still are subtracted
                         loop--;
                     }
}
    }
}
}
}

