package Jobsheet_04.Percobaan_3;

public class MainPercobaan3 {
    public static void main(String[] args) {
        Pegawai p1 = new Pegawai("Spongebob SquarePants", "1234");
        Pegawai p2 = new Pegawai("Patrick Star", "5678");
        KeretaApi k1 = new KeretaApi("Gaya Baru", "Bisnis", p1, p2);
        System.out.println(k1.info());

        Pegawai p3 = new Pegawai("Jeffery Epstien", "9101112");
        KeretaApi k2 = new KeretaApi("Middle East", "Private", p3);
        System.out.println(k2.info());
    }
}
