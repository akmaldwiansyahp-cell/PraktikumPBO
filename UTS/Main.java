package UTS;

public class Main {
    public static void main(String[] args) {


        Bioskop bioskop =
            new Bioskop("Sinema Malang", 3, 50);

        bioskop.setManajer(new Manajer("Pak Hadi"));


        Penonton andi =
            new Penonton("Andi", "081234567890");

        Penonton sinta =
            new Penonton("Sinta", "081234567891");


        TiketReguler reguler = new TiketReguler("T-001", "Laskar Pelangi", 40000, true);

        TiketVIP vip = new TiketVIP("T-002", "Laskar Pelangi", 40000);

        reguler.setPemilik(andi);
        vip.setPemilik(sinta);


        bioskop.jualTiket(reguler);
        bioskop.jualTiket(vip, 1);
        bioskop.jualTiket(vip, 4);


        Studio studio1 = bioskop.getStudio(1);

        System.out.println(
            "Pendapatan Studio 1: "
            + studio1.hitungPendapatan()
        );

        Tiket t = new TiketVIP("T-099", "Dilan", 50000);

        System.out.println("Harga Tiket: " + t.hitungHarga());
    }
}
