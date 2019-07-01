package Chap05_InterfaceAbstract.luyenTapMQH.lienKet_demo;

public class Student {

    /**
     * Moi student co nhieu mon hoc: Student-Course 5..60-*
     */
    private Course[] courses;

    private String id;
    private String fullname;
    private String address;

    public Student(String id, String fullname, String address) {
        this.id = id;
        this.fullname = fullname;
        this.address = address;
    }

    public Course[] getCourses() {
        return courses;
    }

    public void setCourses(Course[] courses) {
        this.courses = courses;
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getFullname() {
        return fullname;
    }

    public void setFullname(String fullname) {
        this.fullname = fullname;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    //show info Student
    public void showInfoStudent() {
        System.out.println("id: " + getId() + ", fullname: " + getFullname() + ",address: " + getAddress());
    }
}
