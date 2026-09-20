package Jobsheet_04.Percobaan_3;

public class Pegawai {
    private String nip;
    private String nama;

    public Pegawai(String nama, String nip){
        this.nama = nama;
        this.nip = nip;
    }

    public void setNip(String nip) {
        this.nip = nip;
    }
    
    public String getNip() {
        return nip;
    }
    public void setNama(String nama) {
        this.nama = nama;
    }
    
    public String getNama() {
        return nama;
    }


    String info(){
        String info = "";
        info += "Nip: " + this.nip + "\n";
        info += "Nama: " + this.nama + "\n";
        return info;
    }
}
