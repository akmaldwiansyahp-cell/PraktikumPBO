package Jobsheet_06.Tugas;

public class TiketInternational extends TiketPesawat{
    protected String nomorPaspor;
    protected int asuransi;

    TiketInternational(){

    }

    TiketInternational(String paspor,int asuransi, String kodeTiket, String namaPenumpang, String asal, String tujuan, int hargaDasar, String mask, int bagasi){
        super(kodeTiket, namaPenumpang, asal, tujuan, hargaDasar, mask, bagasi);
        this.nomorPaspor = paspor;
        this.asuransi = asuransi;
    }

    public void tampilInternational(){
        super.tampilPesawat();
        System.out.println("Nomor Paspor    : " + nomorPaspor);
        System.out.println("Asuransi        : " + asuransi);
        System.out.println("Total Biaya     : " + (super.hargaDasar + asuransi));
    }
}