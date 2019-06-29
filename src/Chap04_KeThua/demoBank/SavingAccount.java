package Chap04_KeThua.demoBank;

public class SavingAccount extends BankAccount {

    //khai bao thuoc tinh
    int laiSuat;

    public SavingAccount(String acc_num, int laiSuat) {
        //Khoi tao thuoc tinh lop cha
        super(acc_num);

        //Khoi tao thuoc tinh lop con
        this.laiSuat = laiSuat;
    }

    //Method tinh lai suat
    public void addInterest() {
        //Lay sodu tu lop cha
        double sodu_tk = super.getBanlance();

        //tienlai = sodu * lai suat
        double tienlai = sodu_tk * ((double) this.laiSuat / 100);
        System.out.println("so du hien tai: " + tienlai);
        //nap tien lai vao tai khoan
        super.nap_tien(tienlai);
    }

    @Override
    public void truy_van_sodu() {
        super.truy_van_sodu();
        System.out.println("Lai suat hang thang la: " + this.laiSuat);
    }

}
