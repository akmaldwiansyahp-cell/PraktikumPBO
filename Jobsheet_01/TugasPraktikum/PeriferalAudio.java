package Jobsheet_01.TugasPraktikum;

public class PeriferalAudio {
    private String brand;
    private String jenisKoneksi;
    private double harga;
    
    void setBrand(String brand){
        this.brand = brand;
    }

    void setKoneksi(String koneksi){
        jenisKoneksi = koneksi;
    }

    void setHarga(double harga){
        this.harga = harga;
    }

    void print(){
        System.out.println("Brand: " + brand);
        System.out.println("Jenis Koneksi: " + jenisKoneksi);
        System.out.println("Harga: " + harga);
    }
}
