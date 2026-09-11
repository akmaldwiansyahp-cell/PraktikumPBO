package Jobsheet_03.TugasPraktikum;

public class EncapTest {
    public static void main(String[] args) {
        EncapDemo encap = new EncapDemo();
        encap.setNama("Akmal");
        encap.setUmur(35);

        System.out.println("Name: " + encap.getNama());
        System.out.println("Umur: " + encap.getUmur());
    }
}
