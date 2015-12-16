
import java.util.Scanner;

/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author snowc4636
 */
public class A7Q5 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        //input a scanner
        Scanner input = new Scanner(System.in);
        System.out.println(" How many people are in the class ");
        int nums = input.nextInt();
        int [] number = new int [nums];
        // enter a random number of marks
        System.out.println(" Please enter " + nums + " marks ");
        for(int x = 0; x < nums; x++){
             int mark = input.nextInt();
        // the mark formula  
        number[x] = mark;     
        }
        for(int put = 0; put < nums; put++){
            
            for(int x = 0; x < nums -1; x++){
        // increasing by +1
               int after = x + 1;       
               int set;
        // number is larger then the other number     
               if(number[after] < number[x]){         
         set = number[x];
        // swapping numbers
         number[x] = number[after];
         number[after] = set;
               }

            }
            

        } 
        //giving median a desginated number
           double median = 0;
        System.out.print("In order of increase ");
        for(int increase = 0; increase < nums; increase++){
            System.out.print(number[increase] + "," );
         //finish 
         if( increase == 9){
             System.out.println(" ");
         }
         // if the number is /2 and == 1
         if(nums/2==1){
             median= number[nums/2];
         }else{
             int ave = nums/2;
             median = number[ave] + number[ave -1];
             median = median/2;
         }
            
         
        
 
         }
        // what the median is
System.out.println(" The median is ");
            System.out.println(median);
    }
}


