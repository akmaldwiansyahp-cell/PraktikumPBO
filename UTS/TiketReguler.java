package UTS;

public class TiketReguler extends Tiket{
    private boolean weekend;

    public TiketReguler(String kode,String judulFilm,int hargaDasar,boolean weekend) {

        super(kode, judulFilm, hargaDasar);
        this.weekend = weekend;
    }

    @Override
    public int hitungHarga() {
        if (weekend) {
            return hargaDasar + (hargaDasar * 20 / 100);
        }

        return hargaDasar;
    }

    @Override
    public String getJenis() {
        return "Tiket Reguler";
    }
}
