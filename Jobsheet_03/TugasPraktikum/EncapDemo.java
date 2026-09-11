package Jobsheet_03.TugasPraktikum;

public class EncapDemo {
    private String nama;
    private int age;

    public String getNama(){
        return nama;
    }

    public void setNama(String nama){
        this.nama = nama;
    }

    public int getUmur(){
        return age;
    }

    public void setUmur(int umur){
        if (umur >= 30) {
            age = 30;
        }else if(umur >= 18){
            age = umur;
        }else{
            age = umur;
        }
    }
}
