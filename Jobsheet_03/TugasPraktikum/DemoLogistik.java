package Jobsheet_03.TugasPraktikum;

public class DemoLogistik {
    private String kode;
    private String pemilik;
    private int berat;
    private int maks;

    DemoLogistik(String kode, String pemilik, int berat){
        this.kode = kode;
        this.pemilik = pemilik;
        this.berat = berat;
        maks = 5000;
    }

    public int getMaks(){
        return maks;
    }

    public String getPemilik(){
        return pemilik;
    }

    public String getKode(){
        return kode;
    }

    public int getBerat(){
        return berat;
    }

    public void tambahMuatan(int tambah){
        if (berat + tambah > maks) {
            System.out.println("Maaf, berat muatan melebihi kapasitas maksimal kontainet");
            berat = 0;
        }else{
            berat += tambah;
        }
    }

    public void turunMuatan(int kurang){
        if (kurang < berat/2) {
            berat -= kurang;
        }else{
            System.out.println("Maaf, demi keselamatan, pembongkaran muatan satu kali jalan tidak boleh melebihi 50% dari muatan saat ini!");
        }
    }
}
