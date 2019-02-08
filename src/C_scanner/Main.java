package C_scanner;

import java.util.Scanner;


public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        System.out.print("Masukkan Huruf : ");
        String huruf = scanner.next();
        
        System.out.println("huruf yang anda masukkan yaitu "+huruf);
    }
}