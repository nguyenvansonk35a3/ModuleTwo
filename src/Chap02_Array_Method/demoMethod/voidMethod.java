package Chap02_Array_Method.demoMethod;

public class voidMethod {

    public static void main(String[] args) {
        System.out.println("The grade is ");
        printGrade(78.9);

        System.out.println("The grade is ");
        printGrade(20);
    }

    public static void printGrade(double number) {
        if (number >= 90) {
            System.out.println("A");
        } else if (number > 70) {
            System.out.println("B");
        } else if (number > 50) {
            System.out.println("C");
        } else {
            System.out.println("D");
        }
    }
}
