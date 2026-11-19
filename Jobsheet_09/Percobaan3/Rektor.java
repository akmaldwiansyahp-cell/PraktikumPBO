package Jobsheet_09.Percobaan3;

public class Rektor {
    public void beriSertifCumlaude(Icumlaude mahasiswa){
        System.out.println("Saya Rektor, memberikan sertifikat cumlaude");
        System.out.println("Selamat! Silahkan perkenalkan diri anda..");
    
        mahasiswa.lulus();
        mahasiswa.meraihIPKTinggi();

        System.out.println("-----------------------------------------------------");
    }

    public void beriSertifMawapres(IBerprestasi mahasiswa){
        System.out.println("Saya REKTOR, memberikan sertifikat MAWAPRES");
        System.out.println("Selamat! Bagaimana anda bisa berprestasi?");

        mahasiswa.menjuaraiKompetisi();
        mahasiswa.membuatPublikasiIlmiah();

        System.out.println("--------------------------------------------------------");
    }
}
