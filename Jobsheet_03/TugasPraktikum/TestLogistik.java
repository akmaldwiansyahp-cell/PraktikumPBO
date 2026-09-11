package Jobsheet_03.TugasPraktikum;

import java.util.Scanner;

public class TestLogistik {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        DemoLogistik kontainerAlfa = new DemoLogistik("REQ-9988","PT . Maju Bersama", 5000);
        System.out.println("Nama Pemilik Kontainer: " + kontainerAlfa.getPemilik());
        System.out.println("Kapasitas Maksimal: " + kontainerAlfa.getMaks() + "kg");
        System.out.println("\nMemasukkan muatan baru seberat 6.000 kg...");
        kontainerAlfa.tambahMuatan (sc.nextInt());
        System.out.println("Berat muatan saat ini: "+ kontainerAlfa.getBerat() + "kg");

        System.out.println("\nMemasukkan muatan baru seberat 4.000 kg...");
        kontainerAlfa.tambahMuatan(sc.nextInt());
        System.out.println("Berat muatan saat ini: " + kontainerAlfa.getBerat() + "kg");
 
        System.out.println("\nMembongkar muat/menurunkan barang seberat 500 kg...");
        kontainerAlfa.turunMuatan(sc.nextInt());
        System.out.println("Berat muatan saat ini: " + kontainerAlfa.getBerat() + "kg");

        System.out.println("\nMembongkar muat/menurunkan barang seberat 1.500 kg...");
        kontainerAlfa.turunMuatan(sc.nextInt());
        System.out.println("Berat muatan saat ini: " + kontainerAlfa.getBerat() + "kg");

        System.out.println("\nMembongkar muat/menurunkan barang seberat 2000600 kg...");
        kontainerAlfa.turunMuatan(sc.nextInt());
        System.out.println("\nBerat muatan saat ini: " + kontainerAlfa.getBerat() + "kg");        
        sc.close();
    }
}
