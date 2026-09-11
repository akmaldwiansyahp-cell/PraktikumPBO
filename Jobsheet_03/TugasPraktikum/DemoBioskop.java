package Jobsheet_03.TugasPraktikum;

public class DemoBioskop {
    private String judul;
    private double harga;
    private boolean status;

    DemoBioskop(String judul, double harga){
        this.judul = judul;
        if (harga == 0) {
            this.harga = harga;
        }else{
            this.harga = 35000;
        }
        status = false;
    }

    public void lakukanPembayaran(){
        status = true;
    }

    public boolean statusPembayaran(){
        return status;
    }

    public String getJudul(){
        return judul;
    }

    public double getHarga(){
        return harga;
    }
}
