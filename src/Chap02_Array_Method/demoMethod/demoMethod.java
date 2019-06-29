package Chap02_Array_Method.demoMethod;

public class demoMethod {

    public static void main(String[] args) {
        System.out.println("Tinh tong cac so: ");
        System.out.println("Tong tu 0 den 9 la: " + sum(0, 9));
        System.out.println("Tong tu 10 den 20 la: " + sum(10, 20));
        System.out.println("Tong tu 100 den 200 la: " + sum(100, 200));
    }

    public static int sum(int number1, int number2) {
        int result = 0;
        for (int i = number1; i <= number2; i++) {
            result += i;
        }
        return result;
    }
}
