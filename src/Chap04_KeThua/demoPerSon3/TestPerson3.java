package Chap04_KeThua.demoPerSon3;

public class TestPerson3 {

    public static void main(String[] args) {
        //test Person
        Person person = new Person("Ho dem", "ten", true, "ngay sinh");
        System.out.println(person.personInfo());

        System.out.println();

        //test Student
        Student student = new Student("Nguyen Van", "Son", true, "06/12/1995", "A05", "CNTT", "JavaWeb");

        student.setDiem1(10);
        student.setDiem2(9);
        student.setDiem3(8);
        
        System.out.println(student.studentInfo());
    }
}
