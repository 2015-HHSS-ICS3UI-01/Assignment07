
import java.util.Scanner;

/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author pawar5658
 */
public class A7Q2 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        
        Scanner input = new Scanner(System.in);
        
        int length = 0;
        int height;
        
        System.out.println("Input the number of students.");
        int s = input.nextInt();
        int h[] = new int[s];
        
        System.out.println("Please input the heights of these students in cm.");
        for(int i = 0; i < s; i++)
        {
            h[i] = input.nextInt();
            length = length + h[i];
        }
        height = length/s;
        
        System.out.println("The average height of the students is " + height + " cm.");
        if(length > height){
            System.out.println("Some students are taller than the average.");
        }
    }
}
