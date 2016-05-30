
import java.util.Scanner;

/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author voigr4865
 */
public class A7Q2 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        
        Scanner input = new Scanner(System.in);//basic scanner
        
        System.out.println("How many people are in the survey?");//ask the user how many people are in the class
        int people = input.nextInt();//make integer for people and entered in the next line
        int[] ppl = new int[people];//establish integer people as the array ppl and hght
        int[] hght = new int[people];
        System.out.println("What are their heights");//as the user what the hieght of the people are
        
        double total = 0;//make a total double like the last code
        for(int i = 0; i < ppl.length; i++){//for loop to go through the ppl array
        hght[i] = input.nextInt();//input all the hieghts in the next row and establish them to the hght array
        
        
        total = total + hght[i];//have the total equal the array added up
        
        }
        
        double avs = total / people;//have the average equal the total calculated above devided by the integer people entered at the beginning
       System.out.println("The heights that are above average are:");//output the hieghts that are above the calculated average
        for(int i = 0; i < ppl.length; i++){
            if (hght[i] > avs){
                System.out.println(hght[i]);
            }
        }
        
    }
}
