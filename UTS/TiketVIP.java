package UTS;

public class TiketVIP extends Tiket{
    public TiketVIP(String kode,String judulFilm,int hargaDasar) {
        super(kode, judulFilm, hargaDasar);
    }

    @Override
    public int hitungHarga() {
        return hargaDasar + (hargaDasar * 50 / 100);
    }

    @Override
    public String getJenis() {
        return "Tiket VIP";
    }
}
