package Jobsheet_02.TugasPraktikum;

public class Lingkaran {
    public double phi;
    public double r;

    double hitungLuas(){
        double luas = phi * r * r;
        return luas;
    }

    double hitungKeliling(){
        double keliling = 2 * phi * r;
        return keliling;
    }
}
