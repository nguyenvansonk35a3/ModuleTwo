package Chap04_KeThua.demoPerSon2;

public class TestPerson2 {

    public static void main(String[] args) {

        //test Person
        Person person = new Person("Nobody", "Vietnam");
        System.out.println(person.toString());

        System.out.println();

        //test Student
        Student student = new Student("Van Son", "Nghe An", "CodeGym", 2019, 2000000);
        System.out.println(student);

        System.out.println();

        //test Staff
        Staff staff = new Staff("Ga Ga", "Da Nang", "SEO_Codegym", 0);
        System.out.println(staff.toString());
    }
}
