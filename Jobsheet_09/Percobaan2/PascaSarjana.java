package Jobsheet_09.Percobaan2;

public class PascaSarjana extends Mahasiswa implements Icumlaude{
    PascaSarjana(String nama){
        super(nama);
    }

    @Override
    public void lulus() {
        System.out.println("Aku sudah menyelesaikan THESIS");
    }

    @Override
    public void meraihIPKTinggi() {
        System.out.println("IPK-ku di atas 3,71");
    }
}
