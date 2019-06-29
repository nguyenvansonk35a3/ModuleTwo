package Chap03_ClassObject.demoBank;

public class BankAccount {

    private String acc_num;
    private int sodu;

    BankAccount(String acc_num) {
        this.acc_num = acc_num;
        this.sodu = 50;
    }

    public String getAcc_num() {
        return acc_num;
    }

    public void setAcc_num(String acc_num) {
        this.acc_num = acc_num;
    }

    public int getSodu() {
        return sodu;
    }

    public void setSodu(int sodu) {
        this.sodu = sodu;
    }

    //method truy van so du
    public void truy_van_sodu() {
        System.out.println("so du hien tai: " + this.sodu);
    }

    //method nap tien
    public void nap_tien(int so_tien) {
        this.sodu += so_tien;
    }

    //method rut tien
    public void rut_tien(int so_tien) {
        int sotien_hientai = this.sodu - so_tien;
        if (sotien_hientai >= 50) {
            this.sodu -= so_tien;
        } else {
            System.out.println(" so du phai >=50");
        }
    }
}
