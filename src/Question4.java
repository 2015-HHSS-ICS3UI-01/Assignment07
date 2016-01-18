
import java.util.Scanner;

/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author preej0747
 */
public class Question4 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        //make a scanner to collect user input
        Scanner input = new Scanner(System.in);
        
        //make an array
        int[] nums = new int[10];
        
        //get marks
        for(int mark = 0; mark < nums.length; mark++){
         System.out.println("Please enter your mark");
         nums[mark] = input.nextInt();
        }
        
        //put marks in order from least to greatest
        //comparing first spot in array
        if(nums[0] > nums[1]){
            int a = nums[0];
            nums[0] = nums[1];
            nums[1] = a;
            for(int mark = 0; mark < nums.length; mark++){
                System.out.println(nums[mark]);
            }
        }if(nums[0] > nums[2]){
            int a = nums[0];
            nums[0] = nums[1];
            nums[1] = a;
            for(int mark = 0; mark < nums.length; mark++){
                System.out.println(nums[mark]);
            }
        }if(nums[0] > nums[3]){
            int a = nums[0];
            nums[0] = nums[3];
            nums[3] = a;
            for(int mark = 0; mark < nums.length; mark++){
                System.out.println(nums[mark]);
            }
        }if(nums[0] > nums[4]){
            int a = nums[0];
            nums[0] = nums[4];
            nums[4] = a;
            for(int mark = 0; mark < nums.length; mark++){
                System.out.println(nums[mark]);
            }
        }if(nums[0] > nums[5]){
            int a = nums[0];
            nums[0] = nums[5];
            nums[5] = a;
            for(int mark = 0; mark < nums.length; mark++){
                System.out.println(nums[mark]);
            }
        }if(nums[0] > nums[6]){
            int a = nums[0];
            nums[0] = nums[6];
            nums[6] = a;
            for(int mark = 0; mark < nums.length; mark++){
                System.out.println(nums[mark]);
            }
        }if(nums[0] > nums[7]){
            int a = nums[0];
            nums[0] = nums[7];
            nums[7] = a;
            for(int mark = 0; mark < nums.length; mark++){
                System.out.println(nums[mark]);
            }
        }if(nums[0] > nums[8]){
            int a = nums[0];
            nums[0] = nums[8];
            nums[8] = a;
            for(int mark = 0; mark < nums.length; mark++){
                System.out.println(nums[mark]);
            }
        }if(nums[0] > nums[9]){
            int a = nums[0];
            nums[0] = nums[9];
            nums[9] = a;
            for(int mark = 0; mark < nums.length; mark++){
                System.out.println(nums[mark]);
            }
        }
        
        //comparing second spot in array
        if(nums[1] > nums[2]){
            int b = nums[1];
            nums[1] = nums[2];
            nums[2] = b;
            for(int mark = 0; mark < nums.length; mark++){
                System.out.println(nums[mark]);
            }
        }if(nums[1] > nums[3]){
            int b = nums[1];
            nums[1] = nums[3];
            nums[3] = b;
            for(int mark = 0; mark < nums.length; mark++){
                System.out.println(nums[mark]);
            }
        }if(nums[1] > nums[4]){
            int b = nums[1];
            nums[1] = nums[4];
            nums[4] = b;
            for(int mark = 0; mark < nums.length; mark++){
                System.out.println(nums[mark]);
            }
        }if(nums[1] > nums[5]){
            int b = nums[1];
            nums[1] = nums[5];
            nums[5] = b;
            for(int mark = 0; mark < nums.length; mark++){
                System.out.println(nums[mark]);
            }
        }if(nums[1] > nums[6]){
            int b = nums[1];
            nums[1] = nums[6];
            nums[6] = b;
            for(int mark = 0; mark < nums.length; mark++){
                System.out.println(nums[mark]);
            }
        }if(nums[1] > nums[7]){
            int b = nums[1];
            nums[1] = nums[7];
            nums[7] = b;
            for(int mark = 0; mark < nums.length; mark++){
                System.out.println(nums[mark]);
            }
        }if(nums[1] > nums[8]){
            int b = nums[1];
            nums[1] = nums[8];
            nums[8] = b;
            for(int mark = 0; mark < nums.length; mark++){
                System.out.println(nums[mark]);
            }
        }if(nums[1] > nums[9]){
            int b = nums[1];
            nums[1] = nums[9];
            nums[8] = b;
            for(int mark = 0; mark < nums.length; mark++){
                System.out.println(nums[mark]);
            }
        }
            //comparing third spot in array
            if(nums[2] > nums[3]){
                int c = nums[2];
                nums[2] = nums[3];
                nums[3] = c;
                for(int mark = 0; mark < nums.length; mark++){
                System.out.println(nums[mark]);
            }
            }if(nums[2] > nums[4]){
                int c = nums[2];
                nums[2] = nums[4];
                nums[4] = b;
                for(int mark = 0; mark < nums.length; mark++){
                System.out.println(nums[mark]);
            }
            }if(nums[2] > nums[5]){
                int c = nums[2];
                nums[2] = nums[5];
                nums[5] =c;
                for(int mark = 0; mark < nums.length; mark++){
                System.out.println(nums[mark]);
            }
            }if(nums[2] > nums[6]){
                int c = nums[2];
                nums[2] = nums[6];
                nums[6] = c;
                for(int mark = 0; mark < nums.length; mark++){
                System.out.println(nums[mark]);
            }
            }if(nums[2] > nums[7]){
                int c = nums[2];
                nums[2] = nums[7];
                nums[7] = c;
                for(int mark = 0; mark < nums.length; mark++){
                System.out.println(nums[mark]);
            }
            }if(nums[2] > nums[8]){
                int c = nums[2];
                nums[2] = nums[8];
                nums[8] = c;
                for(int mark = 0; mark < nums.length; mark++){
                System.out.println(nums[mark]);
            }
            }if(nums[2] > nums[9]){
                int c = nums[2];
                nums[2] = nums[9];
                nums[9] = c;
                for(int mark = 0; mark < nums.length; mark++){
                System.out.println(nums[mark]);
                }   
            }
            
            //comparing fourth spot in array
            if(nums[3] > nums[4]){
                int d = nums[3];
                nums[3] = nums[4];
                nums[4] = d;
                for(int mark = 0; mark < nums.length; mark++){
                System.out.println(nums[mark]);
            }
            }if(nums[3] > nums[5]){
                int d = nums[3];
                nums[3] = nums[5];
                nums[5] = d;
                for(int mark = 0; mark < nums.length; mark++){
                System.out.println(nums[mark]);
            }
            }if(nums[3] > nums[6]){
                int d = nums[3];
                nums[3] = nums[6];
                nums[6] = d;
                for(int mark = 0; mark < nums.length; mark++){
                System.out.println(nums[mark]);
            }
            }if(nums[3] > nums[7]){
                int d = nums[3];
                nums[3] = nums[7];
                nums[7] = d;
                for(int mark = 0; mark < nums.length; mark++){
                System.out.println(nums[mark]);
            }
            }if(nums[3] > nums[8]){
                int d = nums[3];
                nums[3] = nums[8];
                nums[8] = d;
                for(int mark = 0; mark < nums.length; mark++){
                System.out.println(nums[mark]);
            }
            }if(nums[3] > nums[9]){
                int d = nums[3];
    }
            
            
}
}