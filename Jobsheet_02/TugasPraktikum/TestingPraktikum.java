package Jobsheet_02.TugasPraktikum;

public class TestingPraktikum {
    public static void main(String[] args) {
        Peminjaman pinjam1 = new Peminjaman();
        pinjam1.id = "001";
        pinjam1.namaMember = "Akmal";
        pinjam1.namaGame = "Risk Of Rains 2";
        pinjam1.harga = 10000;

        pinjam1.tampilkanData();

        System.out.println("Harga yang harus dibayar adalah: Rp. " + pinjam1.hargaDibayar(24));

        System.out.println("");

        Lingkaran lingkaran1 = new Lingkaran();
        lingkaran1.phi = 3.14;
        lingkaran1.r = 10;

        System.out.println("Total Luas Lingkaran: " + lingkaran1.hitungLuas());
        System.out.println("Total Keliling Lingkaran: " + lingkaran1.hitungKeliling());

        System.out.println("");

        Barang barang1 = new Barang();
        barang1.kode = "A001";
        barang1.nama = "Sepatu";
        barang1.hargaAwal = 100000;
        barang1.diskon = 50;

        barang1.tampilkanData();

        System.out.println("");

        int[] angka = {1, 2, 3};
        System.out.println("Awal Program");
        System.out.println(angka[3]);
        System.out.println("Akhir Program");
    }
}
