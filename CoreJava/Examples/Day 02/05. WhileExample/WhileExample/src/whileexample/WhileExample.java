/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package whileexample;

/**
 *
 * @author softech
 */
public class WhileExample {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        
        int i = 1;
        while (i <= 100) {
            if (i % 5 == 0) {
                System.out.println(i);
            }
            i++;
        }
        
        /*
        for (int i = 1; i <= 100; i++) {
            if (i % 5 == 0) {
                System.out.println(i);
            }
        }
        */
        
        System.out.println("Completed");
    }
    
}
