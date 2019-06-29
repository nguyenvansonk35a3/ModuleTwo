package Chap05_InterfaceAbstract.demoSVCourse;

public class Person {

    private String id;
    private String name;
    private String gioitinh;
    private String date;
    private String address;

    public Person(String id, String name, String gioitinh, String date, String address) {
        this.id = id;
        this.name = name;
        this.gioitinh = gioitinh;
        this.date = date;
        this.address = address;
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getGioitinh() {
        return gioitinh;
    }

    public void setGioitinh(String gioitinh) {
        this.gioitinh = gioitinh;
    }

    public String getDate() {
        return date;
    }

    public void setDate(String date) {
        this.date = date;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    //show info
    public String showInfoPerson() {
        return "id: " + this.id + ", name: " + this.name + ", gioitinh: " + this.gioitinh + ", date: "
                + this.date + ", address: " + this.address;
    }
}
