/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package N_switch_char;

/**
 *
 * @author Denandra
 */
public class Main {
    public static void main(String[] args) {
        
        char huruf = 'C';
        
        switch(huruf){
            case 'A':
                System.out.println("Huruf adalah A");
                break;
            case 'B':
                System.out.println("Huruf adalah B");
                break;
            case 'C':
                System.out.println("Huruf adalah C");
                break;
            default:
                System.out.println("Huruf tidak diketahui");
        }
        
    }
}
