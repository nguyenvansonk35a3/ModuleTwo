package Chap02_Array_Method.TH;

import java.util.Scanner;

public class ChuyenDoiNhietDo {

    public static void main(String[] args) {
        System.out.println("Chuong trinh chuyen doi nhiet do");
        Scanner scanner = new Scanner(System.in);

        System.out.println("nhiet do =");
        double variable = scanner.nextDouble();

        System.out.println(" F --> C");
        System.out.println(variable + " do F = " + FtoC(variable) + " do C");

        System.out.println("C --> F");
        System.out.println(variable + " do C = " + CtoF(variable) + " do F");
    }

    public static double FtoC(double variable) {
        double result = (5.0 / 9) * (variable - 32);
        return result;
    }

    public static double CtoF(double variable) {
        double result = (9.0 / 5) * (variable + 32);
        return result;
    }
}
