package Chap04_KeThua.demoPerSon3;

public class Student extends Person {

    private String lop;
    private String khoa;
    private String nganh;
    private int diem1;
    private int diem2;
    private int diem3;

    public Student(String hoDem, String ten, boolean gioiTinh, String ngaySinh, String lop, String khoa, String nganh) {
        super(hoDem, ten, gioiTinh, ngaySinh);
        this.lop = lop;
        this.khoa = khoa;
        this.nganh = nganh;
    }

    public void setDiem1(int diem1) {
        this.diem1 = diem1;
    }

    public void setDiem2(int diem2) {
        this.diem2 = diem2;
    }

    public void setDiem3(int diem3) {
        this.diem3 = diem3;
    }

    public double getDiemTrungBinh() {
        double diemtb = 0;
        diemtb = (this.diem1 + this.diem2 + this.diem3) / 3;
        return diemtb;
    }

    public void thongTinDiem() {
        System.out.println("Diem1: " + this.diem1 + "Diem2: " + this.diem2 + "Diem3: " + this.diem3);
    }

    public String xepLoai() {
        if (getDiemTrungBinh() < 5) {
            return "Chua dat";
        } else {
            return "Dat";
        }
    }

    public String studentInfo() {
        return super.personInfo() + ", lop = " + this.lop + ", khoa = " + this.khoa + ", nganh = " + this.nganh + ", diemtb = " + this.getDiemTrungBinh();
    }
}
