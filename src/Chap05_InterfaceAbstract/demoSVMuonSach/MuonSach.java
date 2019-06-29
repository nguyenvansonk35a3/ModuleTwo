package Chap05_InterfaceAbstract.demoSVMuonSach;

public class MuonSach {

    private String IdBorrow;        //ma so muon
    private String dateBorrow;      //Ngay muon
    private String datePay;         //Ngay tra

    //Kahi bao quan he MuonSach - Student: 1-1
    private Student sinhvien;

    //khai bao quan he MuonSach - Book: 1-*
    private Book[] books;
    private int num_book;

    public MuonSach(String IdBorrow, String dateBorrow, String datePay) {
        this.IdBorrow = IdBorrow;
        this.dateBorrow = dateBorrow;
        this.datePay = datePay;
        this.num_book = 0;
        this.books = new Book[3];
    }

    public String getDatePay() {
        return datePay;
    }

    public void setDatePay(String datePay) {
        this.datePay = datePay;
    }

    public String getIdBorrow() {
        return IdBorrow;
    }

    public void setIdBorrow(String IdBorrow) {
        this.IdBorrow = IdBorrow;
    }

    public String getDateBorrow() {
        return dateBorrow;
    }

    public void setDateBorrow(String dateBorrow) {
        this.dateBorrow = dateBorrow;
    }

    //Them sinh vien vao phieu
    public void addStudent(Student student) {
        this.sinhvien = student;
    }

    //add book vao phieu
    public void addBook(Book book) {
        books[num_book] = book;
        num_book++;
    }

    //hien thi danh sach Book
    public void danhSach_book() {
        System.out.println("--------------Danh sach book--------------");
        for (int i = 0; i < num_book; i++) {
            System.out.println(this.books[i].showInfoBook());
        }
    }

    //Thong tin sinh vien muon sach
    public void sinhVien_MuonSach() {
        System.out.println("--------Thong tin sinh vien muon sach--------");
        System.out.println(this.sinhvien.showInfoStudent());
    }

    //Show All
    public String showAll() {
        return "info sinh vien: " + sinhvien.showInfoStudent() + "\n Thong tin muon: IdBorrow: " + this.IdBorrow
                + ",dateBorrow: " + this.dateBorrow + ",datePay: " + this.datePay;
    }
}
