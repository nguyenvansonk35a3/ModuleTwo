package Chap05_InterfaceAbstract.demoSVMuonSach;

public class Book {

    private int id_book;
    private String name_book;
    private String tacgia;
    private int num_trang;
    private String date_xb;

    public Book(int id_book, String name_book, String tacgia, int num_trang, String date_xb) {
        this.id_book = id_book;
        this.name_book = name_book;
        this.tacgia = tacgia;
        this.num_trang = num_trang;
        this.date_xb = date_xb;
    }

    public String getDate_xb() {
        return date_xb;
    }

    public void setDate_xb(String date_xb) {
        this.date_xb = date_xb;
    }

    public int getId_book() {
        return id_book;
    }

    public void setId_book(int id_book) {
        this.id_book = id_book;
    }

    public String getName_book() {
        return name_book;
    }

    public void setName_book(String name_book) {
        this.name_book = name_book;
    }

    public String getTacgia() {
        return tacgia;
    }

    public void setTacgia(String tacgia) {
        this.tacgia = tacgia;
    }

    public int getNum_trang() {
        return num_trang;
    }

    public void setNum_trang(int num_trang) {
        this.num_trang = num_trang;
    }

    //Show info Book
    public String showInfoBook() {
        return "id_book: " + this.id_book + ", name_book: " + this.name_book
                + ", tacgia: " + this.tacgia + ", num_trang: " + this.num_trang
                + ", Ngay xuat ban: " + this.date_xb;
    }

}
