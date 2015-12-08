/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author butlj9437
 */
public class A7Q7 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        int p = 2;
        boolean[] prime = new boolean[1000];
        for(int i = 0; i <= 1000; i++){
            prime[i] = true;
        }
        prime[0] = false;
        while(p*p<=1000){
            for(int i = 2; p*i<=1000; i++){
                prime[(i*p)-1] = false;
            }
            boolean check = true;
            for(int i = p; check; i++){
                if(prime[i]){
                    p = i + 1;
                    check = false;
                }
            }
        }
        for(int i = 1; i<=1000; i++){
            if(prime[i]){
                System.out.println(i+1);
            }
        }
    }
}
