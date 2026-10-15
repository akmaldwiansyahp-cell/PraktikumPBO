package Jobsheet_07.Tugas1;

public class Main {
    public static void main(String[] args) {
        Segitiga seg = new Segitiga();

        System.out.println("Total Sudut (Diketahui Sudut A): "+seg.totalSudut(90));
        System.out.println("Total Sudut (Diketahui Sudut A dan B): " + seg.totalSudut(45, 15));
        System.out.println("Keliling (Sisi A, B, C): " + seg.keliling(12, 12, 16));
        System.out.println("Keliling (Phytagoras): " + seg.keliling(12, 12));
    }
}
