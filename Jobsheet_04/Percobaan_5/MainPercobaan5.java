package Jobsheet_04.Percobaan_5;

public class MainPercobaan5 {
    public static void main(String[] args) {
        Mobil mobil = new Mobil("Avanza");
        mobil.info();

        Mesin m = new Mesin();
        Mobil mob = new Mobil("Mazda", m);
        mob.info();
    }
}
