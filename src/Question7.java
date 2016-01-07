
/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
/**
 *
 * @author agott2059
 */
public class Question7 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        
        //make a boolean array
        boolean[] nums = new boolean[1000];
        
        //TRUE = PRIME
        //make all nums in array "prime" or true
        for (int i = 0; i < nums.length; i++) {
            nums[i] = true;
        }
        //mark all non-prime numbers false using the sieve method
        for (int i = 2; i < nums.length; i++) {
            for (int x = i * 2; x < nums.length; x = x + i) {
                nums[x] = false;
            }
        }  
        
        //output numebers that are prime by going through the boolean array and outputing number marked "true"
        for (int i = 0; i < nums.length; i++) {
            //check if nums at i is true;(output number if marked true)
            if(nums[i] == true){
                System.out.println(i);
            }
        }
    }
}