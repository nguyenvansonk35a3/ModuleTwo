package Chap02_Array_Method.TH;

import java.util.Scanner;

public class DemSinhVienThiDo {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int size;
        int[] array;
        //nhap va kiem tra size
        do {
            System.out.print("enter size: ");
            size = scanner.nextInt();
            if (size > 30) {
                System.out.println("size > 30");
            }
        } while (size > 30);
        array = new int[size];

        System.out.println("Nhap mang");
        add(array);
        show(array);
        System.out.println();
        find(array);
    }

    public static void add(int[] array) {
        Scanner scanner = new Scanner(System.in);
        for (int i = 0; i < array.length; i++) {
            System.out.print("array[" + i + "]= ");
            array[i] = scanner.nextInt();
        }
    }

    public static void show(int[] array) {
        for (int i = 0; i < array.length; i++) {
            System.out.print(array[i] + "\t");
        }
    }

    public static void find(int[] array) {
        int count = 0;
        System.out.println("cac sinh vien thi dau: ");
        for (int i = 0; i < array.length; i++) {
            if (array[i] >= 5 && array[i] <= 10) {
                System.out.print(array[i] + "\t");
                count++;
            }
        }
        System.out.println();
        System.out.print("so luong: " + count);
    }
}
