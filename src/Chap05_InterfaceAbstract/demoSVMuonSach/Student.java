package Chap05_InterfaceAbstract.demoSVMuonSach;

public class Student extends Person {

    private String lop;
    private String nganh;

    public Student(String id, String hoten, String gioiTinh, String birthday, String address, String lop, String nganh) {
        super(id, hoten, gioiTinh, birthday, address);
        this.lop = lop;
        this.nganh = nganh;
    }

    public String getLop() {
        return lop;
    }

    public void setLop(String lop) {
        this.lop = lop;
    }

    public String getNganh() {
        return nganh;
    }

    public void setNganh(String nganh) {
        this.nganh = nganh;
    }

    //show info Sinh vien
    public String showInfoStudent() {
        return super.showInfoPerson() + ", Lop: " + this.lop
                + ", nganh: " + this.nganh;
    }
}
