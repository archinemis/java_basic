/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package G_soal;

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
        
        double SETENGAH = 0.5;
        
        try {
            System.out.print("Masukkan nilai alas : ");
            int alas = Integer.parseInt(br.readLine());
            
            System.out.print("Masukkan nilai tinggi : ");
            int tinggi = Integer.parseInt(br.readLine());
            
            double luas = alas*tinggi*SETENGAH;
            
            System.out.println("Luas segitiga : "+luas);
        } catch (Exception e) {
        }
    }
}
