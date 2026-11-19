package Jobsheet_09.Percobaan1;

public class Kucing extends Hewan {
    public Kucing(String nama){
        super(nama);
        this.nama = nama;
    }
    @Override 
    public void bergerak(){
        System.out.println("Berjalan dengan KAKI, \"tap..tap..\"");
        System.out.println("Nama kucingku : "+nama);
    }
}
