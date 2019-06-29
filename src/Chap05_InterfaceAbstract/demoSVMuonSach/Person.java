package Chap05_InterfaceAbstract.demoSVMuonSach;

public class Person {

    private String id;
    private String hoten;
    private String gioiTinh;
    private String birthday;
    private String address;

    public Person(String id, String hoten, String gioiTinh, String birthday, String address) {
        this.id = id;
        this.hoten = hoten;
        this.gioiTinh = gioiTinh;
        this.birthday = birthday;
        this.address = address;
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getHoten() {
        return hoten;
    }

    public void setHoten(String hoten) {
        this.hoten = hoten;
    }

    public String getGioiTinh() {
        return gioiTinh;
    }

    public void setGioiTinh(String gioiTinh) {
        this.gioiTinh = gioiTinh;
    }

    public String getBirthday() {
        return birthday;
    }

    public void setBirthday(String birthday) {
        this.birthday = birthday;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    //show info Person
    protected String showInfoPerson() {
        return "Person id: " + this.id + ", name: " + this.hoten
                + ", gioitinh: " + this.gioiTinh + ", birthday: " + this.birthday
                + ", address: " + this.address;
    }
}
