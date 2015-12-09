/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author iorgs3184
 */
public class A7Q7 {

    public static void main(String[] args) {

        //makes a true or false(boolean) array with 1000 spots
        boolean[] number = new boolean[1000];

        //loops through and makes all numbers prime
        for (int i = 0; i <= 999; i++) {
            number[i] = true;
        }
        //first prime number = 2
        //finds every number that is not prime
        for (int i = 2; i <= 999; i++) {
            for (int s = i * 2; s < number.length; s = s + i) {
                number[s] = false;
            }
        }
        //prints out all the numbers that are prime
        for (int i = 2; i <= 999; i++) {
            if (number[i] == true) {
                System.out.println(i);
            }
        }
    }
}
