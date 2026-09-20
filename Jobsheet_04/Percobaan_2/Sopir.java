package Jobsheet_04.Percobaan_2;

public class Sopir {
    private String nama;
    private int biaya;
    
    Sopir(){

    }

    public void setNama(String name){
        this.nama = name;
    }

    public String getNama(){
        return nama;
    }

    public void setBiaya(int biaya) {
        this.biaya = biaya;
    }
    
    public int getBiaya() {
        return biaya;
    }
    
    int hitungBiayaSopir(int hari){
        return hari * biaya;
    }
}
