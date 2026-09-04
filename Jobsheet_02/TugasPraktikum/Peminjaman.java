package Jobsheet_02.TugasPraktikum;

public class Peminjaman {
    public String id;
    public String namaMember;
    public String namaGame;
    public double harga;

    void tampilkanData(){
        System.out.println("Id          : " + id);
        System.out.println("Nama Member : " + namaMember);
        System.out.println("Nama Game   : " + namaGame);
        System.out.println("Harga       : Rp. " + harga);
    }

    double hargaDibayar(double jam){
        double bayar = jam * harga;
        return bayar;
    }
}
