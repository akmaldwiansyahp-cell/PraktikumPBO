package Jobsheet_02.TugasPraktikum;

public class Barang {
    public String kode;
    public String nama;
    public int hargaAwal;
    public float diskon;

    int hitungHargaJual(){
        int hargaJual = hargaAwal + (int)((diskon/100) * hargaAwal);
        return hargaJual;
    }

    void tampilkanData(){
        System.out.println("Kode        : " + kode);
        System.out.println("Nama Barang : " + nama);
        System.out.println("Harga Awal  : " + hargaAwal);
        System.out.println("Diskon      : " + diskon + "%");
        System.out.println("Harga Jual  : " + hitungHargaJual());
    }
}
