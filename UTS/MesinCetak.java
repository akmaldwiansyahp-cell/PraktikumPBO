package UTS;

public class MesinCetak {
    private String kodeMesin;

    public MesinCetak(String kodeMesin) {
        this.kodeMesin = kodeMesin;
    }

    public void cetak(Tiket tiket) {
        System.out.println("=== TIKET BIOSKOP ===");
        System.out.println("Mesin: " + kodeMesin);
        System.out.println("Kode Tiket: " + tiket.kode);
        System.out.println("Film: " + tiket.judulFilm);
        System.out.println("Jenis: " + tiket.getJenis());
        System.out.println("Harga: Rp" + tiket.hitungHarga());

        Penonton pemilik = tiket.getPemilik();

        if (pemilik != null) {
            System.out.println("Penonton: " + pemilik.getNama());
        }

        System.out.println("=====================");
    }
}
