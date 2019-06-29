package Chap01_Javacore;

import java.util.Scanner;

public class CheckSNT {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("number = ");
        int number = sc.nextInt();

        if (checkCountSNT(number) == 2) {
            System.out.println(number + " is SNT");
        } else {
            System.out.println(number + " Not. Add again!");
        }
    }

    public static int checkCountSNT(int number) {
        int count = 0;
        for (int i = 1; i <= number; i++) {
            if (number % i == 0) {
                count++;
            }
        }
        return count;

    }
}
