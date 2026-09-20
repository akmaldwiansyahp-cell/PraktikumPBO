package Jobsheet_04.TugasMandiri;

public class RekamMedis {
    private String nomor;
    private Catatan[] Catatan;
    private int jumlah;
 
    public RekamMedis(String nomor, int kapasitas) {
        this.nomor = nomor;
        this.Catatan = new Catatan[kapasitas];
        this.jumlah = 0;
    }
 
    public void tambah(Catatan catatan) {
        if (jumlah >= Catatan.length) {
            System.out.println("Rekam medis " + nomor + " sudah penuh.");
            return;
        }
        this.Catatan[jumlah] = catatan;
        this.jumlah++;
    }
 
    public String info() {
        String info = "Nomor RM   : " + nomor + "\n";
        if (jumlah == 0) {
            info += "  (belum ada riwayat pemeriksaan)\n";
        }
        for (int i = 0; i < jumlah; i++) {
            info += "  " + (i + 1) + ". " + Catatan[i].info() + "\n";
        }
        return info;
    }
}
