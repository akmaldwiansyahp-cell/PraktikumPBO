package Jobsheet_04.TugasMandiri;

public class Pasien {
    private String nik;
    private String nama;
    private RekamMedis rekam;
 
    public Pasien(String nik, String nama) {
        this.nik = nik;
        this.nama = nama;
        this.rekam = new RekamMedis("RM-" + nik, 10);
    }
 
    public String getNik() {
        return nik;
    }
 
    public String getNama() {
        return nama;
    }
 
    public void catat(Catatan catatan) {
        this.rekam.tambah(catatan);
    }
 
    public String info() {
        String info = "Pasien     : " + nama + " (NIK " + nik + ")\n";
        info += rekam.info();
        return info;
    }
}
