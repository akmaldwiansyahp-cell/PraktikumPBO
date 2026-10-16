package Jobsheet_07.Percobaan_1;

public class Manager extends Karyawan {
    private double tunjangan;
    private String bagian;
    private Staff[] staffs;

    public void setTunjangan(int tunjangan) {
        this.tunjangan = tunjangan;
    }

    public double getTunjangan() {
        return tunjangan;
    }

    public void setBagian(String bagian) {
        this.bagian = bagian;
    }

    public String getBagian() {
        return bagian;
    }

    public void setStaffs(Staff[] staffs) {
        this.staffs = staffs;
    }

    public void viewStaff(){
        int i;
        System.out.println("================");
        for(i=0; i<staffs.length; i++){
            staffs[i].lihatInfo();
        }
        System.out.println("================");
    }

    public void lihatInfo(){
        System.out.println("Manager: " + getBagian());
        System.out.println("NIP: " + getNip());
        System.out.println("Nama: " + getNama());
        System.out.println("Golongan: " + getGolongan());
        System.out.printf("Tunjungan: %.0f\n", getTunjangan());
        System.out.printf("Gaji: %.0f\n", getGaji());
        System.out.println("Bagian: " + getBagian());
    }

    @Override
    public double getGaji() {
        return super.getGaji() + tunjangan;
    }
    
}
