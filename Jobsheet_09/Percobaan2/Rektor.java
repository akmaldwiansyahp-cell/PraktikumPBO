package Jobsheet_09.Percobaan2;

public class Rektor {
    public void beriSertifCumlaude(Icumlaude mahasiswa){
        System.out.println("Saya Rektor, memberikan sertifikat cumlaude");
        System.out.println("Selamat! Silahkan perkenalkan diri anda..");
    
        mahasiswa.lulus();
        mahasiswa.meraihIPKTinggi();

        System.out.println("-----------------------------------------------------");
    }
}
