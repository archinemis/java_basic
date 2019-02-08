/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package J_soal_pr;

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
            System.out.print("Masukkan suhu celcius : ");
            double c = Double.parseDouble(br.readLine());
            
            double r = 0.8*c;
            double f = 1.8*c+32;
            double k = c + 273;
            
            System.out.println("Suhu reamur : "+r);
            System.out.println("Suhu fahrenheit : "+f);
            System.out.println("Suhu kelvin : "+k);
            
        } catch (Exception e) {
        }
    }
}
