package Jobsheet_03.OperasiGetterSetter;

public class KoperasiDemo {
    public static void main(String[] args) {
        Anggota anggota1 = new Anggota("Iwan", "Mawar");
        System.out.println("Simpanan " + anggota1.getNama() + " : Rp. " + anggota1.getSimpanan());
        anggota1.setNama("M Akmal Dwiansyah P");
        anggota1.setAlamat("Tirtasani Estate D-17");
        anggota1.setorUang(100000);
        System.out.println("Simpanan " + anggota1.getNama() + " : Rp. " + anggota1.getSimpanan());
        anggota1.tarik(5000);
        System.out.println("Simpanan " + anggota1.getNama() + " : Rp. " + anggota1.getSimpanan());
    }
}
