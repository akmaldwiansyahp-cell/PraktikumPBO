package Jobsheet_04.Percobaan_5;

public class Mobil {
    private String merk;
    private Mesin mesin;

    public Mobil(String merk){
        this.merk = merk;
        this.mesin = new Mesin();
    }

    public Mobil(String merk, Mesin mesin){
        this.merk = merk;
        this.mesin = mesin;
    }

    public void info(){
        System.out.println("Merk: " + merk);
        System.out.println("Mesin: " + mesin.getTipe());
    }
}
