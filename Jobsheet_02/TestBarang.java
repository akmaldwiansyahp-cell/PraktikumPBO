package Jobsheet_02;

public class TestBarang {
    public static void main(String[] args) {
        Barang barang1 = new Barang();
        barang1.nama = "Pensil";
        barang1.jenis = "ATK";
        barang1.stok = 10;

        barang1.tampilBarang();
    
        System.out.println("Jumlah Stock baru adalah: " + barang1.stockTambah(20));

    
    }
}
