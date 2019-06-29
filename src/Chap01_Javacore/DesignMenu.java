package Chap01_Javacore;

import java.util.Scanner;

public class DesignMenu {

    public static void main(String[] args) {
        System.out.println("Design menu of Aplication");
        Scanner sc = new Scanner(System.in);

        System.out.println("=======================================");
        System.out.println("Menu:");
        System.out.println("1.Draw the triangle"); //ve hinh tam giac
        System.out.println("2.Draw the square");    //ve hinh vuong
        System.out.println("3.Draw the rectangle"); //ve hinh chu nhat
        System.out.println("0.Exit");

        while (true) {
            System.out.println("Please! Enter your choise: ");
            int choise = sc.nextInt();
            switch (choise) {
                case 1:
                    System.out.println("1.Draw the triangle");
                    System.out.println("* * * * *");
                    System.out.println("* * * *");
                    System.out.println("* * *");
                    System.out.println("* *");
                    System.out.println("*");
                    break;
                case 2:
                    System.out.println("2.Draw the square");
                    System.out.println("* * * * *");
                    System.out.println("* * * * *");
                    System.out.println("* * * * *");
                    System.out.println("* * * * *");
                    System.out.println("* * * * *");
                    break;
                case 3:
                    System.out.println("3.Draw the gectangle");
                    System.out.println("* * * * * * * * ");
                    System.out.println("* * * * * * * * ");
                    System.out.println("* * * * * * * * ");
                    System.out.println("* * * * * * * * ");
                    System.out.println("* * * * * * * * ");
                    break;
                case 0:
                    System.exit(0);
                default:
                    System.out.println("No choise!");
            }
        }
    }
}
