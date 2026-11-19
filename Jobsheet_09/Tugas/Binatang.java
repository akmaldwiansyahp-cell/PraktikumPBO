package Jobsheet_09.Tugas;

public class Binatang {
    protected String nama;
    protected int kaki;

    public Binatang(String nama, int kaki){
        this.nama = nama;
        this.kaki = kaki;
    }

    void setNama(String nama){
        this.nama = nama;
    }

    public String getNama() {
        return nama;
    }

    public void setKaki(int kaki) {
        this.kaki = kaki;
    }

    public int getKaki() {
        return kaki;
    }

    public void displayBinatang(){
        System.out.println("Ini adalah binatang");
    }
}
