/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author stahc1596
 */
public class A7Q7 {

    public static void main(String[] args) {
        //The program starts at evaluating the number two.
        int time = 2;
        int[] ary = new int[1000];
        int[] marked = new int[1000];
        for (int i = time; i < 1001; i++) {
            for (int e = 2; e < time; e++) {
                //The number is tested to see if it can be divided and remain a whole number.
                int answer = time / e;
                answer = answer * e;
                //If it can, then it is not a prime number
                if (answer == time) {
                    ary[time - 1] = 0;
                    marked[time - 1] = 1;
                    //If it can`t, then it is a prime number
                } else if (answer != time && marked[time - 1] != 1) {
                    ary[time - 1] = time;
                }
            }
            //After one cycle, it restarts but with the next number in line until
            //it reaches 1000
            time = time + 1;
        }
        //Every prime number is then printed on the screen.
        for (int i = 0; i < 999; i++) {
            if (ary[i] != 0) {


                System.out.println(ary[i]);
            }
        }
    }
}
