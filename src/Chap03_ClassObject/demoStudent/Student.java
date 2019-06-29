package Chap03_ClassObject.demoStudent;

public class Student {

    private String name;
    private String address;
    private int numCourses;
    private String[] courses;
    private int[] grades;

    //khai bao so luong mon hoc - diem toi da
    int MAX = 10;

    Student(String name, String address) {
        this.name = name;
        this.address = address;
        this.numCourses = 0;
        this.courses = new String[MAX];
        this.grades = new int[MAX];
    }

    public String getName() {
        return name;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    //them mon hoc va diem cho hoc sinh
    public void addCourseGrade(String course, int grade) {
        courses[numCourses] = course;
        grades[numCourses] = grade;
        //tang so luong mon hoc len 1 sau khi them mon hoc
        numCourses++;
    }

    //hien thi mon hoc va diem mon hoc
    public void printGrade() {
        System.out.println("Mon hoc va diem mon hoc");
        for (int i = 0; i < numCourses; i++) {
            System.out.println("Mon: " + this.courses[i] + " - diem: " + this.grades[i]);
        }
    }

    //diem trung binh
    public double getAvergaGrade() {
        double sum = 0;
        for (int i = 0; i < numCourses; i++) {
            sum += grades[i];
        }
        return (sum / numCourses);
    }
}
