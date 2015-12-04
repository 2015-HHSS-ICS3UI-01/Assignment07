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
        int time = 2;
        int[] ary = new int[1000];
        int[] marked = new int [1000];
        for (int i = time; i < 1001; i++){
            for (int e = 2; e < time; e++){
                int answer = time/e;
                answer = answer*e;
                if (answer == time){
                    ary[time -1] = 0;
                    marked[time -1] = 1;
                }else if (answer != time && marked[time -1] != 1){
                    ary[time -1] = time;
                }
            }
            time = time + 1;
        }
        for (int i = 0; i < 999; i++){
            if (ary[i] != 0){
                
            
            System.out.println(ary[i]);
        }
    }
}}
