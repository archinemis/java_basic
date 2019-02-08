/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package H_soal;

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
            System.out.print("Masukkan nama anda : ");
            String nama = br.readLine();
            
            System.out.print("Masukkan NIM anda : ");
            String nim = br.readLine();
            
            System.out.print("Masukkan nilai UTS : ");
            int uts = Integer.parseInt(br.readLine());
            
            System.out.print("Masukkan nilai UAS : ");
            int uas = Integer.parseInt(br.readLine());
            
            System.out.print("Masukkan nilai Tugas : ");
            int tgs = Integer.parseInt(br.readLine());
            
            double nilai = (uts*0.3)+(uas*0.3)+(tgs*0.4);
            
            System.out.println("Nama anda : "+nama);
            System.out.println("NIM anda : "+nim);
            System.out.println("Nilai akhir anda : "+nilai);
        } catch (Exception e) {
        }
    }
}
