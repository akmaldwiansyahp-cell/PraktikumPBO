package Jobsheet_09.Percobaan3;

public class PascaSarjana extends Mahasiswa implements Icumlaude, IBerprestasi{
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

    @Override
    public void menjuaraiKompetisi() {
        System.out.println("Saya telah menjuarai kompetisi INTERNASIONAL");
    }

    @Override
    public void membuatPublikasiIlmiah() {
        System.out.println("Saya menerbitkan artikel di jurnal INTERNASIONAL");
    }
}
