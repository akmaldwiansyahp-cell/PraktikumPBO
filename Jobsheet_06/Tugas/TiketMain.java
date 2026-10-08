package Jobsheet_06.Tugas;

public class TiketMain {
    public static void main(String[] args) {
        System.out.println("======= Tiket Kereta ======");
        TiketKereta kereta = new TiketKereta(3, "12A", "KA-001", "Andi", "Malang", "Jakarta", 350000);
        kereta.tampilKereta();

        System.out.println("====== Tiket Domestik ======");
        TiketDomestik domestik = new TiketDomestik(75000, "GA-210", "Sinta", "Surabaya", "Denpasar", 900000, "Garuda Indonesia", 25);
        domestik.tampilDomestik();

        System.out.println("====== Tiket International ======");
        TiketInternational international = new TiketInternational("C0987654321", 150000, "SQ-201", "Budi", "Jakarta", "Singapura", 2500000, "Singapore Airlines", 20);
        international.tampilInternational();
    }
}
