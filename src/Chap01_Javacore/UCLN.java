package Chap01_Javacore;

import java.util.Scanner;

public class UCLN {

    public static void main(String[] args) {
        int a;
        int b;
        Scanner sc = new Scanner(System.in);
        System.out.println("Number a: ");
        a = sc.nextInt();
        System.out.println("Number b: ");
        b = sc.nextInt();

        //dua ve gia tri tuyet doi
        a = Math.abs(a);
        b = Math.abs(b);

        if (a == 0 || b == 0) {
            System.out.println(" No greatest common factor!");
        } else {
            while (a != b) {
                if (a > b) {
                    a -= b;
                } else {
                    b -= a;
                }
            }
            System.out.printf("UCLN of a and b is: %d", a);
        }
    }
}
