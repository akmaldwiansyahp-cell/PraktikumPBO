package Jobsheet_09.Percobaan1;

public class Percobaan1 {
    public static void main(String[] args) {

        // Hewan hewan = new Hewan();

        Hewan kucingKampung = new Kucing("Leo");
        Hewan LumbaLumba = new Ikan("Lulu");

        Orang ani = new Orang("Ani");
        Orang budi = new Orang("Budi");

        ani.peliharaanHewa(kucingKampung);
        budi.peliharaanHewa(LumbaLumba);

        ani.ajakPeliharaanJalanJalan();
        budi.ajakPeliharaanJalanJalan();
    }
}
