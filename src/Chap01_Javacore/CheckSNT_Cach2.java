package Chap01_Javacore;

import java.util.Scanner;

public class CheckSNT_Cach2 {

    public static void main(String[] args) {
        System.out.println("Kiem tra nguyen to!");
        System.out.print("Number = ");
        Scanner sc = new Scanner(System.in);

        int number = sc.nextInt();

        if (number < 2) {
            System.out.println("number is not a prime!");
        } else {
            int i = 2;
            boolean check = true;
            while (i <= Math.sqrt(number)) {
                if (number % i == 0) {
                    check = false;
                    break;
                }
                i++;
            }
            if (check) {
                System.out.println("number is a prime");
            } else {
                System.out.println("number not prime. Please again!");
            }
        }
    }
}
