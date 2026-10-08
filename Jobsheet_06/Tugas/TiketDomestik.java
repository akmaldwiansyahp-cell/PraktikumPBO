package Jobsheet_06.Tugas;

public class TiketDomestik extends TiketPesawat{
    protected int pajakBandara;

    TiketDomestik(){

    }

    TiketDomestik(int pajak, String kodeTiket, String namaPenumpang, String asal, String tujuan, int hargaDasar, String mask, int bagasi){
        super(kodeTiket, namaPenumpang, asal, tujuan, hargaDasar, mask, bagasi);
        this.pajakBandara = pajak;
    }

    public void tampilDomestik(){
        super.tampilPesawat();
        System.out.println("Pajak Bandara   : " + pajakBandara);
        System.out.println("Total Bayar     : " + (super.hargaDasar + super.hitungBiayaBagasi() + pajakBandara));
    }
}
