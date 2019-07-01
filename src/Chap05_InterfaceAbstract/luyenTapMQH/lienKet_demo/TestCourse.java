package Chap05_InterfaceAbstract.luyenTapMQH.lienKet_demo;

public class TestCourse {

    public static void main(String[] args) {
        Course course1 = new Course("Lap trinh java");
        Course course2 = new Course("Lap trinh PHP");

        Student student1 = new Student("001", "Nguyen", "Nghe An");
        Student student2 = new Student("002", "Van", "DaNang");
        Student student3 = new Student("003", "Son", "HaNoi");

        //them Student vao khoa hoc
        course1.addStudent(student1);
        course1.addStudent(student2);

        course2.addStudent(student1);
        course2.addStudent(student2);
        course2.addStudent(student3);

        System.out.println("----------------Khoa hoc 1-------------------");
        System.out.println("So Student in course1: " + course1.getNumberOfStudents());
        System.out.println("Ten khoa hoc 1: " + course1.getCourseName());
        System.out.println("Danh sach Student khoa hoc 1:");
        Student[] students = course1.getStudents();
        for (int i = 0; i < course1.getNumberOfStudents(); i++) {
            students[i].showInfoStudent();
        }
        System.out.println("----------------Khoc hoc 2-------------------");
        System.out.println("So Student in course2: " + course2.getNumberOfStudents());
        System.out.println("Ten khoa hoc 2: " + course2.getCourseName());
        System.out.println("Danh sach Student khoa hoc 2:");
        Student[] students1 = course2.getStudents();
        for (int i = 0; i < course2.getNumberOfStudents(); i++) {
            students1[i].showInfoStudent();
        }
    }

}
