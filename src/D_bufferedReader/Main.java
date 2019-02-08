package D_bufferedReader;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {
    public static void main(String[] args) {
        InputStreamReader isr = new InputStreamReader(System.in);
        BufferedReader br = new BufferedReader(isr);
        
        try {
            System.out.print("Masukkan angka : ");
            int angka = Integer.parseInt(br.readLine());
            
            System.out.println("Angka yang anda masukkan adalah "+angka);
        } catch (IOException e) {
        }
    }
}
