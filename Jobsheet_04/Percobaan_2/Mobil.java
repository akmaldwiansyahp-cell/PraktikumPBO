package Jobsheet_04.Percobaan_2;

public class Mobil {
    private String merk;
    private int biaya;

    Mobil(){
        
    }

    public void setMerk(String merk) {
        this.merk = merk;
    }

    public String getMerk() {
        return merk;
    }

    public void setBiaya(int biaya) {
        this.biaya = biaya;
    }

    public int getBiaya() {
        return biaya;
    }

    int hitungBiayaMobil(int hari){
        return hari * biaya;
    }
}
