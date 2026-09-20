package Jobsheet_04.Percobaan_6;

public class MainPercobaan6 {
    public static void main(String[] args) {
        Laptop laptop = new Laptop("ThunkBed");
        Printer printer = new Printer("Epstein L3110");
        laptop.cetakDokumen(printer, "Lap.pdf");
    }
}
