package UTS;

public class Main {
    public static void main(String[] args) {
        Manajer manajer = new Manajer("Andi");
        Penonton penonton = new Penonton("Budi", "08123456789");

        TiketReguler reguler = new TiketReguler(
            "T001", "Laskar Pelangi", 40000, true
        );

        TiketVIP vip = new TiketVIP(
            "T002", "Laskar Pelangi", 40000
        );

        reguler.setPemilik(penonton);
        vip.setPemilik(penonton);

        Bioskop bioskop = new Bioskop("Cinema Jaya", 2, 50);
        bioskop.setManajer(manajer);

        bioskop.jualTiket(reguler, 1);
        bioskop.jualTiket(vip, 1);

        MesinCetak mesin = new MesinCetak("M001");
        mesin.cetak(reguler);
        mesin.cetak(vip);

        bioskop.tampilInfo();
    }
}
