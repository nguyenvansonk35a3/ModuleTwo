package Chap04_KeThua.demoPerSon;

public class Student extends Person {

    private int numCourses;
    private String[] courses;
    private int[] grades;

    public String[] getCourses() {
        return courses;
    }

    public Student(String name, String address) {
        super(name, address);
        this.numCourses = 0;
        this.courses = new String[10];
        this.grades = new int[10];
    }

    public int getNumCourses() {
        return numCourses;
    }

    public void setNumCourses(int numCourses) {
        this.numCourses = numCourses;
    }

    public void setCourses(String[] courses) {
        this.courses = courses;
    }

    public int[] getGrades() {
        return grades;
    }

    public void setGrades(int[] grades) {
        this.grades = grades;
    }

    //Them diem va mon hoc cho Student
    public void addCourseGrade(String course, int grade) {
        //dua du lieu vao array
        this.courses[numCourses] = course;
        this.grades[numCourses] = grade;

        //tang numCourses len 1 don vi dau khi them thanh cong
        numCourses++;
    }

    //hien thi mon hoc va diem
    public void printGrades() {
        System.out.println("Mon hoc - diem:");
        for (int i = 0; i < numCourses; i++) {
            System.out.println(this.courses[i] + " - " + this.grades[i]);
        }
    }

    //Tinh diem trung binh cua sinh vien
    public double getAverageGrade() {
        double sum = 0;
        for (int i = 0; i < numCourses; i++) {
            sum += grades[i];
        }
        double avg = sum / numCourses;

        return avg;
    }
    
    

    @Override
    public String toString() {
        return "Student: ";
    }

}
