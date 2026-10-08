package Jobsheet_06.Tugas;

public class Tiket {
    protected String kodeTiket;
    protected String namaPenumpang;
    protected String asal;
    protected String tujuan;
    protected int hargaDasar;

    public Tiket(){

    }

    public Tiket(String kode, String nama, String asal, String tujuan, int harga){
        this.kodeTiket = kode;
        this.namaPenumpang = nama;
        this.asal = asal;
        this.tujuan = tujuan;
        this.hargaDasar = harga;
    }

    public void tampilTiket(){
        System.out.println("Kode            : " + kodeTiket);
        System.out.println("Nama Penumpang  : " + namaPenumpang);
        System.out.println("Destinasi       : " + asal + "-" + tujuan);
        System.out.println("Harga Dasar     : " + hargaDasar);
    }
}
