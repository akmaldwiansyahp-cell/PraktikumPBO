package Jobsheet_09.Percobaan1;

public abstract class Hewan {
    protected int umur;
    protected String nama;

    protected Hewan(String nama){
        this.umur = 0;
        this.nama = nama;
    }
    public void bertambahUmur(){
        this.umur += 1;
    }
    public abstract void bergerak();
}
