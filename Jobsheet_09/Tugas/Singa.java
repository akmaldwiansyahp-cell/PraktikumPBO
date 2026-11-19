package Jobsheet_09.Tugas;

public class Singa extends Binatang implements Karnivora{
    private String suara;
    private String warnaBulu;

    Singa(String nama, int kaki, String suara, String warnaBulu){
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
        System.out.println("Jenis: Karnivora");
        System.out.println("Makanan: Daging");
    }

    public void displayData(){
        System.out.println("Suara: " + suara);
        System.out.println("Warna: " + warnaBulu);
    }
}
