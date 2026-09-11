package Jobsheet_03.TugasPraktikum;

public class TestBioskop {
    public static void main(String[] args) {
        DemoBioskop tiket1 = new DemoBioskop("Project Hail Mary", -100000);
        System.out.println("Film: "+ tiket1.getJudul());
        System.out.println("Harga Tiket: " + tiket1.getHarga());
        System.out.println("Status Lunas? " + tiket1.statusPembayaran());
        System.out.println("\nMemproses pembayaran...");
        tiket1.lakukanPembayaran();
        System.out.println("Status Lunas Terbaru? " + tiket1.statusPembayaran());
    }
}
