package UTS;

public class Bioskop {
    private String nama;
    private Studio[] daftarStudio;
    private Manajer manajer;

    public Bioskop(String nama, int jumlahStudio, int kapasitas) {
        this.nama = nama;
        this.daftarStudio = new Studio[jumlahStudio];

        for (int i = 0; i < jumlahStudio; i++) {
            daftarStudio[i] = new Studio(i + 1, kapasitas);
        }
    }

    public void setManajer(Manajer manajer) {
        this.manajer = manajer;
    }

    public boolean jualTiket(Tiket tiket) {
        return jualTiket(tiket, 1);
    }

    public boolean jualTiket(Tiket tiket, int nomorStudio) {
        Studio studio = getStudio(nomorStudio);

        if (studio == null) {
            return false;
        }

        return studio.jual(tiket);
    }

    public Studio getStudio(int nomor) {
        if (nomor < 1 || nomor > daftarStudio.length) {
            return null;
        }

        return daftarStudio[nomor - 1];
    }

    public void tampilInfo() {
        System.out.println("Nama Bioskop: " + nama);
        System.out.println(
            "Manajer: " +
            (manajer == null ? "Belum ada" : manajer.getNama())
        );

        for (Studio studio : daftarStudio) {
            System.out.println(
                "Studio " + studio.getNomor()
                + " | Pendapatan: Rp"
                + studio.hitungPendapatan()
            );
        }
    }
}
