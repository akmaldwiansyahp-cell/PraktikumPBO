package Jobsheet_06.Tugas;

public class TiketKereta extends Tiket{
    protected int nomorGerbong;
    protected String nomorKursi;

    TiketKereta(){

    }

    TiketKereta(int gerbong, String kursi, String kodeTiket, String namaPenumpang, String asal, String tujuan, int hargaDasar){
        super(kodeTiket, namaPenumpang, asal, tujuan, hargaDasar);
        this.nomorGerbong = gerbong;
        this.nomorKursi = kursi;
    }

    public void tampilKereta(){
        super.tampilTiket();
        System.out.println("Nomor Gerbong   : " + nomorGerbong);
        System.out.println("Nomor Kursi     : " + nomorKursi);
        System.out.println("Total Biaya     : " + super.hargaDasar);
    }
}
