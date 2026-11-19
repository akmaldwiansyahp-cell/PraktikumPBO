package Jobsheet_09.Tugas;

public class Kedelai extends Binatang implements Herbivora{
    private String suara;
    private String warnaBulu;

    Kedelai(String nama, int kaki, String suara, String warnaBulu){
        super(nama, kaki);
        this.suara = suara;
        this.warnaBulu = warnaBulu;
    }

    @Override
    public void displayBinatang() {
        System.out.println("Binatang: " + super.nama);
        System.out.println("Jumlah Kaki: " + super.kaki);
    }

    @Override
    public void displayMakanan() {
        System.out.println("Jenis: Herbivora");
        System.out.println("Makanan: Tumbuhan");
    }

    public void displayData(){
        System.out.println("Suara: " + suara);
        System.out.println("Warna: " + warnaBulu);
    }    
}
