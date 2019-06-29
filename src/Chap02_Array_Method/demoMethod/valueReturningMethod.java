package Chap02_Array_Method.demoMethod;

public class valueReturningMethod {

    public static void main(String[] args) {
        System.out.println("the grade is " + printGrade(78.9));
        System.out.println("the grade is " + printGrade(20));
    }

    public static char printGrade(double number) {
        char result;
        if (number >= 90) {
            result = 'A';
        } else if (number > 70) {
            result = 'B';
        } else if (number > 50) {
            result = 'C';
        } else {
            result = 'D';
        }
        return result;
    }
}
