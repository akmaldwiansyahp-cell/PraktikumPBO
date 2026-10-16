package UTS;

public class Bioskop {
    private String nama;
    private Studio[] daftarStudio;
    private Manajer manajer;

    public Bioskop(
            String nama,
            int jumlahStudio,
            int kapasitas) {

        this.nama = nama;
        this.daftarStudio = new Studio[jumlahStudio];

        for (int i = 0; i < jumlahStudio; i++) {
            daftarStudio[i] =
                new Studio(i + 1, kapasitas);
        }
    }

    public void setManajer(Manajer manajer) {
        this.manajer = manajer;
    }

    public void jualTiket(Tiket tiket) {
        jualTiket(tiket, 1);
    }

    public void jualTiket(Tiket tiket, int nomorStudio) {
        Studio studio = getStudio(nomorStudio);

        if (studio == null) {
            System.out.println(
                "Studio " + nomorStudio + " tidak tersedia."
            );
            return;
        }

        if (!studio.jual(tiket)) {
            System.out.println(
                "Studio " + nomorStudio + " sudah penuh."
            );
            return;
        }

        MesinCetak mesin = new MesinCetak("M001");
        mesin.cetak(tiket);
    }

    public Studio getStudio(int nomor) {
        if (nomor < 1 || nomor > daftarStudio.length) {
            return null;
        }

        return daftarStudio[nomor - 1];
    }

    public void tampilInfo() {
        System.out.println("Bioskop: " + nama);

        System.out.println(
            "Manajer: " +
            (manajer == null ? "Belum ada" : manajer.getNama())
        );
    }
}
