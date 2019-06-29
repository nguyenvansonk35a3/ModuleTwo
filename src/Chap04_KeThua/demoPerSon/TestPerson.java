package Chap04_KeThua.demoPerSon;

public class TestPerson {

    public static void main(String[] args) {
        //Tao doi tuong Person
        Person person = new Person("Van Son", "Nothing");
        System.out.println(person);

        System.out.println("");

        //Tao doi tuong Student
        Student student = new Student("Nguyen Van Son", "Infomartion Technology");

        //add Mon hoc va diem
        student.addCourseGrade("Java OOP", 9);
        student.addCourseGrade("Web HTML", 10);
        student.addCourseGrade("Javascript", 8);

        //in thong tin
        student.printGrades();
        //diem trung binh
        System.out.println("Diem trung binh: " + student.getAverageGrade());

        System.out.println("");

        /**
         * Doi tuong Teacher
         */
        Teacher teacher = new Teacher("Mr Linh", "Nghe An");
        teacher.addCourse("JavaScript");
        teacher.addCourse("Java");
        teacher.printCourses();
        
        teacher.remoteCourse("Java");
        teacher.printCourses();

    }
}
