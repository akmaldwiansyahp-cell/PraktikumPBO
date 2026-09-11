package Jobsheet_03.MotorEncapsulation;

public class Motor {
    private int kecepatan = 0;
    private boolean kontak = false;

    public void nyalakanMesin(){
        kontak = true;
    }

    public  void matikanMesin(){
        kontak = false;
        kecepatan = 0;
    }

    public void tambahKecepatan(){
        if (kontak) {
            if (kecepatan == 100) {
                System.out.println("Kecepatan tidak boleh melebihi 100 km/h");
            }else{
                kecepatan += 50; // Contoh kecepatan
            }
        }else{
            System.out.println("Kecepatan tidak dapat ditambah, Kontak masih berstatus mati\n");
        }
    }

    public void kurangKecepatan(){
        if (kontak) {
            kecepatan += -5;
        }else{
            System.out.println("Kecepatan tidak dapat dikurangi, Kontak masih berstatus mati\n");
        }
    }

    public void print(){
        if (kontak) {
            System.out.println("Kontak: On");
        }else{
            System.out.println("Kontak: Off");
        }
        System.out.println("Kecepatan: " + kecepatan + "\n");
    }
}
