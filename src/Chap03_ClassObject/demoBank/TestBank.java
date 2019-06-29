package Chap03_ClassObject.demoBank;

public class TestBank {

    public static void main(String[] args) {
        BankAccount bankAccount = new BankAccount("ps07564");
        bankAccount.truy_van_sodu();

        bankAccount.nap_tien(30);
        bankAccount.truy_van_sodu();

        bankAccount.rut_tien(20);
        bankAccount.truy_van_sodu();
    }
}
