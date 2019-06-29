package Chap03_ClassObject.demoStudent;

public class TestStudent {

    public static void main(String[] args) {
        Student student = new Student("Son", "Danang");
        student.addCourseGrade("Java", 5);
        student.printGrade();

        student.addCourseGrade("web", 10);
        student.printGrade();
        System.out.println("Diem trung binh: " + student.getAvergaGrade());
    }
}
