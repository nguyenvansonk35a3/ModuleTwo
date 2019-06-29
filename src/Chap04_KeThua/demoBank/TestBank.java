package Chap04_KeThua.demoBank;

public class TestBank {

    public static void main(String[] args) {
//        BankAccount bankAccount = new BankAccount("ps07564");
//        bankAccount.truy_van_sodu();
//
//        bankAccount.nap_tien(30);
//        bankAccount.truy_van_sodu();
//
//        bankAccount.rut_tien(20);
//        bankAccount.truy_van_sodu();

        //tao tai khoan tiet kiem
        SavingAccount savingAccount = new SavingAccount("ps07564", 8);

        //hien thi thong tin
        savingAccount.truy_van_sodu();

        // thuc hien tinh lai
        savingAccount.addInterest();

        //hien thi lai
        savingAccount.truy_van_sodu();

        System.out.println(savingAccount.toString());
    }
}
