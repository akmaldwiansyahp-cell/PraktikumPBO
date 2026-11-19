package Jobsheet_09.Percobaan2;

public class Main {
    public static void main(String[] args) {
        Rektor pk = new Rektor();

        // Mahasiswa biasa = new Mahasiswa("Charlie");
        Sarjana cum = new Sarjana("Dini");
        PascaSarjana masterCum = new PascaSarjana("Kirk");

        // pk.beriSertifCumlaude(biasa);
        pk.beriSertifCumlaude(cum);
        pk.beriSertifCumlaude(masterCum);

        cum.kuliahDiKampus();

    }
}
