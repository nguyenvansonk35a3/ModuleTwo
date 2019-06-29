package Chap03_ClassObject.THHCN;

import java.util.Scanner;

public class TestHCN {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("width: ");
        int width = sc.nextInt();
        System.out.print("height: ");
        int height = sc.nextInt();

        HCN hcn = new HCN(width, height);

        System.out.println("Display: " + hcn.display());
        System.out.println("Dien tich: " + hcn.getArea());
        System.out.println("Chu vi: " + hcn.getPerimeter());
    }
}
