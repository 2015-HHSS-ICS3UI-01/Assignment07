
import java.util.Scanner;

/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author voigr4865
 */
public class A7Q3 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        
        Scanner input = new Scanner(System.in);//basic scanner for this code
        
        int[] num = new int[2];//make new array wai two spaces
        System.out.println("Input two integers");//tell the user to input two numbers
        for(int i = 0; i < num.length; i++){
            num[i] = input.nextInt();//input the two integers
            
        }
        if(num[0] > num[1]){//if first number is bigger then the other 
            System.out.println("The integers in ascending order are: " + num[1] + ", " + num[0]);
        } else {//if the above is false
            System.out.println("The integers in ascending order are: " + num[0] + ", " + num[1]);
        }
    }
}
