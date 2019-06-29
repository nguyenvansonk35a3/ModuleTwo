package Chap05_InterfaceAbstract.demoTongHop;

public class Customer {

    private String cus_num;
    private String fisrtName;
    private String lastName;
    private String birthday;

    //khai bao Customer - Address
    private Address diachi;  // 1-1 

    //khai nap quan he Customer - Acount: 1-*
    private Acount[] taikhoan;
    private int numOfAcount;

    public Customer(String cus_num, String fisrtName, String lastName, String birthday) {
        this.cus_num = cus_num;
        this.fisrtName = fisrtName;
        this.lastName = lastName;
        this.birthday = birthday;
        this.numOfAcount = 0;
        this.taikhoan = new Acount[10];  //toi da 10 acount
    }

    //them dia chi cho Customer
    public void addAddress(Address address) {
        this.diachi = address;
    }

    //hien thi thong tin dia chi cho Customer
    public void coustomerAddresInfo() {
        this.diachi.AddressInfo();
    }

    //them Acount vao cho khach hang
    public void addAcount(Acount acount) {
        this.taikhoan[numOfAcount] = acount;
        this.numOfAcount++;
    }

    //hien thi thong  tin acount cua khach hang
    public void customerAcountInfo() {
        System.out.println("Thong tin cac tai khoan cua khach hang la: ");
        for (int i = 0; i < numOfAcount; i++) {
            this.taikhoan[i].AccountInfo();
        }
    }

    public void CustumerInfo() {
        System.out.println("cus_num: " + this.cus_num + ", fullname: " + this.fisrtName + " " + this.lastName
                + ", Birthday: " + this.birthday);
    }
}
