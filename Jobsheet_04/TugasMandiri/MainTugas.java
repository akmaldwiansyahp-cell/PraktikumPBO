package Jobsheet_04.TugasMandiri;

public class MainTugas {
    public static void main(String[] args) {
        Pasien pasien = new Pasien("2571020110", "Akmal");
 
        Catatan c1 = new Catatan("12/09/2026", "Demam 3 hari");
        Catatan c2 = new Catatan("19/09/2026", "Batuk kering");
        pasien.catat(c1);
        pasien.catat(c2);
 
        System.out.println(pasien.info());
 
        Kunjungan kunjungan = new Kunjungan("19/09/2026", pasien,  2);
 
        Printed printer = new Printed("Epstein L3110");
        kunjungan.cetak(printer);
 
    }
}

