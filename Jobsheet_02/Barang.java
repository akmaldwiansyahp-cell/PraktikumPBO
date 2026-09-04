package Jobsheet_02;

public class Barang {
    public String nama;
    public String jenis;
    public int stok;

    void tampilBarang(){
        System.out.println("Nama Barang : " + nama);
        System.out.println("Jenis Barang: " + jenis);
        System.out.println("Stok        : " + stok);
    }

    int stockTambah(int jumlah){
        int stockbaru = jumlah+stok;
        return stockbaru;
    }
}
