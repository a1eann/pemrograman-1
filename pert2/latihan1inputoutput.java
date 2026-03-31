package pert2;

import java.util.Scanner;

public class latihan1inputoutput {
    public static void main(String[] args) {

        try (Scanner scanner = new Scanner(System.in)){
            
            
            System.out.print("input nama : ");
            String name = scanner.nextLine();
            
            System.out.print("input usia : ");
            int usia = scanner.nextInt();
            
            System.out.println("============");
            System.out.println("HALLO " + name);
            System.out.println("Usia Anda " + usia + " Tahun");
            
        }
    }
}