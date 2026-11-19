package Jobsheet_09.Tugas;

public class Main {
    public static void main(String[] args) {
        Singa singa = new Singa("CingaCing", 4, "Rawr", "Coklat");
        Kedelai kedelai = new Kedelai("Kedelai", 4, "WKWK", "Abu-abu");
        Gorilla gorilla = new Gorilla("Gorilla", 4, "Haum", "Hitam Manis");

        singa.displayMakanan();
        singa.displayBinatang();
        singa.displayData();

        System.out.println("------------------------");

        kedelai.displayMakanan();
        kedelai.displayBinatang();
        kedelai.displayData();

        System.out.println("------------------------");

        gorilla.displayMakanan();
        gorilla.displayBinatang();
        gorilla.displayData();
    }
}
