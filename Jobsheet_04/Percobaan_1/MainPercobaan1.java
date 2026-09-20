package Jobsheet_04.Percobaan_1;

public class MainPercobaan1 {
    public static void main(String[] args) {
        //Latihan 1
        Processor proc = new Processor("Intel I5", 3);
        Laptop laptop = new Laptop("ThinkPad", proc);
        laptop.info();

        //Latihan 2
        Processor proc2 = new Processor();
        proc2.setMerk("Ryzen 5");
        proc2.setCache(12);
        Laptop laptop2 = new Laptop();
        laptop2.setMerk("ROG");
        laptop2.setProc(proc2);
        laptop2.info();
    
        //Latihan 3
        Laptop laptop3 = new Laptop("ThunkPad", new Processor("Intel I9", 32));
        laptop3.info();
    }
}
