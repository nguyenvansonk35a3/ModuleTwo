package Chap01_Javacore;

import java.util.Scanner;

public class CheckNamNhuan {

    public static void main(String[] args) {
        System.out.println("Kiem tra nam nhuan");
        Scanner sc = new Scanner(System.in);
        System.out.println("add year: ");
        int year = sc.nextInt();
        boolean check = false;

        boolean isBy4 = year % 4 == 0;
        if (isBy4) {
            boolean isBy100 = year % 100 == 0;
            if (isBy100) {
                boolean isBy400 = year % 400 == 0;
                if (isBy400) {
                    check = true;
                } else {
                    check = false;
                }
            } else {
                check = true;
            }
        } else {
            check = false;
        }

        if (check) {
            System.out.println(year + " is nam nhuan");
        } else {
            System.out.println(year + " is not nam nhuan");
        }
    }
}
