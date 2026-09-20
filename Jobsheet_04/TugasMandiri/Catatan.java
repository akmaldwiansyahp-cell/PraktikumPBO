package Jobsheet_04.TugasMandiri;
public class Catatan {
    private String tanggal;
    private String keluhan;
 
    public Catatan(String tanggal, String keluhan) {
        this.tanggal = tanggal;
        this.keluhan = keluhan;
    }
 
    public String getTanggal() {
        return tanggal;
    }
 
    public String getKeluhan() {
        return keluhan;
    }
 
    public String info() {
        return tanggal + " | keluhan: " + keluhan;
    }
}
