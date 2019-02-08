/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package F_soal;

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
                
        try {
            System.out.print("Masukkan panjang : ");
            int panjang = Integer.parseInt(br.readLine());
            
            System.out.print("Masukkan lebar : ");
            int lebar = Integer.parseInt(br.readLine());
            
            double luas = panjang * lebar;
            
            System.out.println("Luas Persegi Panjang : "+luas);
        } catch (Exception e) {
            
        }
    }
}
