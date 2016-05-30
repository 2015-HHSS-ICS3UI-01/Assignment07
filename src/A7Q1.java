
import java.util.Scanner;

/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author pawar5658
 */
public class A7Q1 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        
        //input a new scanner
        Scanner input = new Scanner(System.in);
                
        System.out.println("How many students are there?");
        int s = input.nextInt();
        int a = s;
        int[] outof = new int[s];
        System.out.println("input their grades.");
        int[] marks = new int[s];
        while(0 < a){
            a = a - 1;
            marks[a] = input.nextInt();
        }
        a = s;
        double average = 0;
        while(a > 0){
            a = a - 1;
            average = average + (marks[a]);
        }
        average = average/s;
        System.out.println("The total average of the students is " + average);
        
        
        }
    }
