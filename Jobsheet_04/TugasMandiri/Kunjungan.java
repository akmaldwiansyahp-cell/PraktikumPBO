package Jobsheet_04.TugasMandiri;

public class Kunjungan {
    private String tanggal;
    private Pasien pasien;
    private int jumlahTindakan;
 
    public Kunjungan(String tanggal, Pasien pasien, int jumlahTindakan) {
        this.tanggal = tanggal;
        this.pasien = pasien;
        this.jumlahTindakan = jumlahTindakan;
    }
 
    public void cetak(Printed printer) {
        String isi = "";
        isi += "Tanggal  : " + tanggal + "\n";
        isi += "Pasien   : " + pasien.getNama() + "\n";
        isi += "Tindakan : " + jumlahTindakan + "x\n";
        printer.cetak(isi);
    }
}
