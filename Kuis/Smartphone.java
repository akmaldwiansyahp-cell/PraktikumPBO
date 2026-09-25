package Kuis;

public class Smartphone {
    private String merk;
    private Baterai baterai;

    Smartphone(String merk, int kapasitasBaterai){
        this.merk = merk;
        this.baterai = new Baterai(kapasitasBaterai);
    }

    public void isiDaya(Charger c, int menit){
        if (c != null) {
            int nilai = (c.getDaya() * menit) / 10;
            baterai.tambah(nilai);
        }else{
            System.out.println("Charger tidak tersedia");
        }
    }

    public void pakai(int menit){
        baterai.kurangi(menit);
    }

    public void Info(){
        System.out.println(merk + " | " + baterai.info() + " | " + baterai.getPersen() + "%");
    }
}
