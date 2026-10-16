package UTS;

public class Studio {
    private int nomor;
    private int kapasitas;
    private Tiket[] tiketTerjual;
    private int jumlah;

    public Studio(int nomor, int kapasitas) {
        this.nomor = nomor;
        this.kapasitas = kapasitas;
        this.tiketTerjual = new Tiket[kapasitas];
        this.jumlah = 0;
    }

    public boolean jual(Tiket tiket) {
        if (jumlah >= kapasitas) {
            return false;
        }

        tiketTerjual[jumlah] = tiket;
        jumlah++;
        return true;
    }

    public int hitungPendapatan() {
        int total = 0;

        for (int i = 0; i < jumlah; i++) {
            total += tiketTerjual[i].hitungHarga();
        }

        return total;
    }

    public int getNomor() {
        return nomor;
    }
}
