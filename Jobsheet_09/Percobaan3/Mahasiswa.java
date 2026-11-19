package Jobsheet_09.Percobaan3;

public class Mahasiswa {
    protected String nama;

    Mahasiswa(String nama){
        this.nama = nama;
    }

    public void kuliahDiKampus(){
        System.out.println("Aku Mahasiswa, namaku " + nama);
        System.out.println("Aku Berkuliah di kampus");
    }
}
