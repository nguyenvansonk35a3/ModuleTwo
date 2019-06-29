package Chap05_InterfaceAbstract.demoSVCourse;

public class Student extends Person {

    private String Course;
    private String lop;

    //khai bao quan he Student - Monhoc : 1-*
    private MonHoc[] monHocs;
    private int numOfMonHoc;

    public Student(String id, String name, String gioitinh, String date, String address, String Course, String lop) {
        super(id, name, gioitinh, date, address);
        this.Course = Course;
        this.lop = lop;
        this.monHocs = new MonHoc[3];  //toi da 3 mon hoc
        this.numOfMonHoc = 0;
    }

    public String getCourse() {
        return Course;
    }

    public void setCourse(String Course) {
        this.Course = Course;
    }

    public String getLop() {
        return lop;
    }

    public void setLop(String lop) {
        this.lop = lop;
    }

    //Them mon hoc cho Student
    public void addMonHoc(MonHoc monHoc) {
        this.monHocs[numOfMonHoc] = monHoc;
        numOfMonHoc++;
    }

    //Lay danh sach mon hoc ra
    public void getDanhSachMonHoc() {
        System.out.println("==================get Danh sach mon hoc=======================");
        for (int i = 0; i < numOfMonHoc; i++) {
            System.out.print(this.monHocs[i].showInfoMonHoc() + "\n");
        }
    }

    // show info All Student
    public String showAllStudent() {
        return super.showInfoPerson() + "Course: " + this.Course + ", lop: " + this.lop;

    }

}
