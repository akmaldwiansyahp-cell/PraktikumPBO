package Jobsheet_04.TugasMandiri;

public class Printed {
    private String merk;
 
    public Printed(String merk) {
        this.merk = merk;
    }
 
    public void cetak(String isi) {
        System.out.println("[" + merk + "] mencetak...");
        System.out.println(isi);
        System.out.println("[" + merk + "] selesai.");
    }    
}
