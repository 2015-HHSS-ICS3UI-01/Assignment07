/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author hadik9595
 */
public class NewMain {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        int i = 2147483647;
        while(true){
            System.out.println(i);
            i++;
            try{
                Thread.sleep(500);
            }catch(Exception e){
                break;
            }
        }
    }
}
