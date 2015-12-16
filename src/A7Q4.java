
import java.util.Scanner;

/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author snowc4636
 */
public class A7Q4 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        //input a scanner
        Scanner input = new Scanner(System.in);
        int [] number = new int [10];
        // enter 10 marks
        System.out.println(" Please enter 10 marks ");
        for(int x = 0; x < 10; x++){
             int mark = input.nextInt();
        // the mark formula  
        number[x] = mark;     
        }
        for(int put = 0; put < 10; put++){
            
            for(int x = 0; x < 9; x++){
        // increasing by +1
               int after = x + 1;      
               int set;
        // number is bigger than the other     
               if(number[after] < number[x]){          
         set = number[x];
        // switching numbers
         number[x] = number[after];
         number[after] = set;
               }
            }
            
        }
        // increasing the order
        System.out.print("In order of increase ");
        for(int increase = 0; increase < 10; increase++){
            System.out.print(number[increase] + "," );
         //finished 
         if( increase == 9){
             System.out.println(" ");
         }   
        }
    }
}
