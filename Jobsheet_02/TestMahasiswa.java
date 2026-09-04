package Jobsheet_02;

public class TestMahasiswa {
    public static void main(String[] args) {
        Mahasiswa mhs1 = new Mahasiswa();
        mhs1.nim = 101;
        mhs1.nama = "Lestari";
        mhs1.alamat = "Jl. Vinolia No. 1A";
        mhs1.kelas = "1A";

        mhs1.tampilkanBiodata();

        Mahasiswa mhs2 = new Mahasiswa();
        mhs2.nim = 102;
        mhs2.nama = "Akmal";
        mhs2.alamat = "Tirtasani Estate";
        mhs2.kelas = "TI_2C";

        mhs2.tampilkanBiodata();
        
        Mahasiswa mhs3 = new Mahasiswa();
        mhs3.nim = 103;
        mhs3.nama = "Fauzi";
        mhs3.alamat = "Jl. Ikan Hiu No. 67";
        mhs3.kelas = "TI_2G";

        mhs3.tampilkanBiodata();        
    }
}
