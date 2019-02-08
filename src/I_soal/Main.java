/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package I_soal;

import java.io.BufferedReader;
import java.io.InputStreamReader;

/**
 *
 * @author Denandra
 */
public class Main {
    public static void main(String[] args) {
        
        InputStreamReader isr = new InputStreamReader(System.in);
        BufferedReader br = new BufferedReader(isr);
        
        double DISKON = 0.3;
        
        try {
            System.out.println("Input");
            System.out.println("==========================================");
            System.out.print("Masukkan harga es teh : ");
            int h_teh = Integer.parseInt(br.readLine());
            
            System.out.print("Masukkan harga ayam : ");
            int h_ayam = Integer.parseInt(br.readLine());
            
            System.out.print("Masukkan banyak es teh yang dibeli : ");
            int b_teh = Integer.parseInt(br.readLine());
            
            System.out.print("Masukkan banyak ayam goreng yang dibeli : ");
            int b_ayam = Integer.parseInt(br.readLine());
            
            int total = (h_teh*b_teh)+(h_ayam*b_ayam);
            double set_diskon = total - (total*DISKON);
            
            System.out.println("==========================================");
            System.out.println("Output");
            System.out.println("==========================================");
            
            System.out.println("Total biaya : "+total);
            System.out.println("Total biaya setelah diskon : "+set_diskon);
            
        } catch (Exception e) {
        }
    }
}
