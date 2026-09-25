package Kuis;

public class Baterai {
    private int kapasitas;
    private int persen;

    Baterai(int kap){
        this.kapasitas = kap;
        this.persen = 20;
    }

    public int getPersen(){
        return persen;
    }

    public void tambah(int nilai){
        if (persen + nilai >= 100) {
            persen = 100;
        }else{
            persen += nilai;
        }
    }

    public void kurangi(int nilai){
        if (persen - nilai <= 0) {
            persen = 0;
        }else{
            persen -= nilai;
        }
    }

    public String info(){
        String inf = "";
        inf += "Baterai " + kapasitas + " mAh";
        return inf;
    }
}
