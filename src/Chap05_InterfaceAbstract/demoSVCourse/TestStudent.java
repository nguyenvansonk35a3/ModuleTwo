package Chap05_InterfaceAbstract.demoSVCourse;

public class TestStudent {

    public static void main(String[] args) {

        //khoi tao Student
        Student student = new Student("ps07564", "Son", "nam", "06/12/1995", "Nghe An", "Laptrinh", "A05");

        //khoi tao mon hoc
        MonHoc monHoc = new MonHoc("001", "Java", 5);
        MonHoc monHoc2 = new MonHoc("002", "web", 6);
        MonHoc monHoc3 = new MonHoc("003", "script", 7);

        //them mon hoc cho sinh vien
        student.addMonHoc(monHoc);
        student.addMonHoc(monHoc2);
        student.addMonHoc(monHoc3);
        
        //hien thi thong tin sinh vien
        System.out.println(student.showAllStudent());
        student.getDanhSachMonHoc();
    }
}
