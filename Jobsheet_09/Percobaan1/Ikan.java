package Jobsheet_09.Percobaan1;

public class Ikan extends Hewan {
    
    public Ikan(String nama){
        super(nama);
        this.nama = nama;
    }
    @Override 
    public void bergerak(){
        System.out.println("Berenang dengan SIRIP, \"wush..wush..\"");
        System.out.println("Nama ikanku : " + nama);
    }
}
