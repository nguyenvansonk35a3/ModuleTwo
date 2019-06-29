package Chap05_InterfaceAbstract.demoTongHop;

public class TestCustomer {

    public static void main(String[] args) {
        //tao address
        Address address = new Address("Tan lap", "DaNang", "550000", "VN");

        //tao Customer
        Customer customer = new Customer("07564", "Nguyen", "Son", "06/12/1995");
        //them doa chi cho khach
        customer.addAddress(address);

        //hien thi
        customer.CustumerInfo();    //thong tin khach hang
        customer.coustomerAddresInfo();     //thong tin dia chi cua khach hang da add vao

        System.out.println("=========================");

        //tao tai khoan
        Acount acount = new Acount("001", "28/06/2019");
        Acount acount2 = new Acount("002", "28/06/2019");
        Acount acount3 = new Acount("003", "28/06/2019");
        Acount acount4 = new Acount("004", "28/06/2019");

        //Them tai khoan cho khach hang
        customer.addAcount(acount);
        customer.addAcount(acount2);
        customer.addAcount(acount3);
        customer.addAcount(acount4);

        customer.customerAcountInfo();

    }
}
