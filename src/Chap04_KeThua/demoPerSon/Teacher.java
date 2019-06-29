package Chap04_KeThua.demoPerSon;

public class Teacher extends Person {

    private int numCourses;
    private String[] courses;

    public Teacher(String name, String address) {
        super(name, address);
        this.numCourses = 0;
        this.courses = new String[10];
    }

    //add mon hoc 
    public boolean addCourse(String course) {
        if (this.numCourses <= 10) {
            courses[numCourses] = course;
            numCourses++;
            return true;
        } else {
            return false;
        }
    }

    //xoa mon hoc
    public boolean remoteCourse(String course) {
        boolean flag = false;
        for (int i = 0; i < numCourses; i++) {
            if (courses[i].equals(course)) {
                numCourses--;
                for (int j = i; j < numCourses; j++) {
                    courses[j] = courses[j + 1];
                }
                flag = true;
            }
        }
        return flag;
    }

    public void printCourses() {
        System.out.println("printCourses:");
        for (int i = 0; i < numCourses; i++) {
            System.out.println("Courses[" + i + "] = " + this.courses[i]);
        }
    }
}
