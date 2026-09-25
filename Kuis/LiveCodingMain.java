package Kuis;

public class LiveCodingMain {
    public static void main(String[] args) {
        Charger charge = new Charger(25);
        Smartphone phone = new Smartphone("Pixel 8", 4500);

        phone.Info();
        phone.isiDaya(charge, 30);
        phone.Info();
        phone.isiDaya(charge, 10);
        phone.Info();
        phone.pakai(60);
        phone.Info();
        phone.pakai(50);
        phone.Info();
        phone.isiDaya(null, 10);
    }
}
