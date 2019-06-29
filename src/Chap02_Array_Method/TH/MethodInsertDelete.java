package Chap02_Array_Method.TH;

import java.util.Scanner;

public class MethodInsertDelete {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int size;
        int[] array;

        do {
            System.out.print("enter size: ");
            size = scanner.nextInt();
            if (size > 20) {
                System.out.println("Full Size!!!");
            }
        } while (size > 20);

        array = new int[size];

        System.out.print("Nhap so luong phan tu trong mang: n= ");
        int n = scanner.nextInt();
        add(array, n);
        show(array, n);
        System.out.println();

//        System.out.println("Chen");
//        System.out.print("index = ");
//        int index = scanner.nextInt();
//        System.out.print("value = ");
//        int value = scanner.nextInt();
//        insert(array, n, index, value);
//        showInsert(array, n);
        System.out.println();

        System.out.println("Xoa");
        System.out.print("enter vitri xoa:");
        int index2 = scanner.nextInt();
        delete(array, n, index2);
        showDelete(array, n);
    }

    public static void add(int[] array, int n) {
        Scanner scanner = new Scanner(System.in);
        for (int i = 0; i < n; i++) {
            System.out.print("array[" + i + "]= ");
            array[i] = scanner.nextInt();
        }
    }

    public static void show(int[] array, int n) {
        for (int i = 0; i < n; i++) {
            System.out.print(array[i] + "\t");
        }
    }

    public static void insert(int arr[], int n, int index, int value) {
        for (int i = n - 1; i >= index; i--) {
            arr[i + 1] = arr[i];
        }
        arr[index] = value;
    }

    public static void showInsert(int[] array, int n) {
        for (int i = 0; i <= n; i++) {
            System.out.print(array[i] + "\t");
        }
    }

    //xoa
    public static void delete(int[] array, int n, int index) {
        for (int i = index; i < n - 1; i++) {
            array[i] = array[i + 1];
        }
        array[n] = 0;
    }

    public static void showDelete(int[] array, int n) {
        for (int i = 0; i < n - 1; i++) {
            System.out.print(array[i] + "\t");
        }
    }
}
