package UTS;

public class MesinCetak {
    private String kodeMesin;

    public MesinCetak(String kodeMesin) {
        this.kodeMesin = kodeMesin;
    }

    public void cetak(Tiket tiket) {
        Penonton pemilik = tiket.getPemilik();

        String namaPemilik =
            pemilik == null ? "Belum ada" : pemilik.getNama();

        System.out.printf(
            "[%s] %s %s | %s | Rp%d%n",
            tiket.getJenis(),
            tiket.kode,
            tiket.judulFilm,
            namaPemilik,
            tiket.hitungHarga()
        );
    }
}
