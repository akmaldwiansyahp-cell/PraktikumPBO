package Jobsheet_06.Tugas;

public class TiketPesawat extends Tiket{
    protected String maskapai;
    protected int barangBagasi;

    TiketPesawat(){

    }

    TiketPesawat(String kodeTiket, String namaPenumpang, String asal, String tujuan, int hargaDasar, String mask, int bagasi){
        super(kodeTiket, namaPenumpang, asal, tujuan, hargaDasar);
        this.maskapai = mask;
        this.barangBagasi = bagasi;
    }

    public int hitungBiayaBagasi(){
        if (barangBagasi <= 20) {
            return 0;
        }else{
            return (barangBagasi - 20) * 50000; 
        }
    }

    public void tampilPesawat(){
        super.tampilTiket();
        System.out.println("Maskapai        : " + maskapai);
        System.out.println("Berat Bagasi    : " + barangBagasi);
        System.out.println("Biaya Bagasi    : " + hitungBiayaBagasi());
    }
}
