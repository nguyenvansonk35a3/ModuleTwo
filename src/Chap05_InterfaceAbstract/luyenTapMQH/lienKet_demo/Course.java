package Chap05_InterfaceAbstract.luyenTapMQH.lienKet_demo;

public class Course {

    private String courseName;

    /**
     * moi mon hoc chi nhan 1 Teacher day
     */
    private Faculty faculty;

    /**
     * Moi mon hoc nhan 5 den 60 hoc sinh
     */
    private Student[] students = new Student[100];
    int numOfStudents = 0;

    public Course(String courseName) {
        this.courseName = courseName;
    }

    public String getCourseName() {
        return courseName;
    }

    public void setCourseName(String courseName) {
        this.courseName = courseName;
    }

    //Them sinh vien vao khoa hoc
    public void addStudent(Student student) {
        students[numOfStudents] = student;
        numOfStudents++;
    }

    public Student[] getStudents() {
        return students;
    }

    //Lay so luong Student trong Course 
    public int getNumberOfStudents() {
        return numOfStudents;
    }
}
