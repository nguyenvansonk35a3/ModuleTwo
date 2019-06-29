package Chap04_KeThua.demoPerSon3;

public class Person {

    private String hoDem;
    private String ten;
    private boolean gioiTinh;
    private String ngaySinh;

    public Person(String hoDem, String ten, boolean gioiTinh, String ngaySinh) {
        this.hoDem = hoDem;
        this.ten = ten;
        this.gioiTinh = gioiTinh;
        this.ngaySinh = ngaySinh;
    }

    public String fullName() {
        return this.hoDem + " " + this.ten;
    }

    public String personInfo() {
        return "Person: ten = " + this.fullName() + ", Gioi tinh = " + this.gioiTinh + ", Ngay sinh = " + this.ngaySinh;
    }

}
