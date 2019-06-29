package Chap05_InterfaceAbstract.demoSVMuonSach;

public class TestMuonSach {

    public static void main(String[] args) {
        //Khoi tao muon sach
        MuonSach muonSach = new MuonSach("001", "29/6/2019", "29/7/2019");

        //Khoi tao Book
        Book book = new Book(1, "Java", "Sonso", 100, "01/01/2019");
        Book book2 = new Book(2, "Web", "Nguyen", 150, "01/01/2019");
        Book book3 = new Book(3, "PHP", "John", 200, "01/01/2019");

        //Khoi tao Student
        Student student = new Student("ps07564", "Nguyen Son", "nam", "06/12/1995", "Nghe An", "A05", "Laptrinh");

        //Them sinh vien vao phieu muon
        muonSach.addStudent(student);
        //them book vao phieu muon
        muonSach.addBook(book);
        muonSach.addBook(book2);
        muonSach.addBook(book3);

        //Danh sach book
        muonSach.danhSach_book();

        System.out.println();

        //Thong tin sinh vien muon sach
        muonSach.sinhVien_MuonSach();

        System.out.println("-------------show all-------------");
        //ShowAll
        System.out.println(muonSach.showAll());
    }
}
