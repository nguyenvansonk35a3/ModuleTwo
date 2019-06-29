package Chap02_Array_Method.TH;

import java.util.Scanner;

public class Array1Chieu {

    public static void main(String[] args) {
        //Khai bao bien, nhap va kiem tra kich thuoc mang
        Scanner scanner = new Scanner(System.in);
        int size;
        int[] array;
        do {
            System.out.print("enter a size: ");
            size = scanner.nextInt();
            if (size > 20) {
                System.out.println("size qua lon");
            }
        } while (size > 20);

        array = new int[size];

        //add
        System.out.print("Nhap: ");
        add(array);
        System.out.println();

        //show
        System.out.print("In mang: ");
        showArray(array);
        System.out.println();

        //tim min
        findMin(array);

        //dao nguoc
        System.out.print("dao nguoc mang: ");
        daoNguoc(array, size);
        showArray(array);
        System.out.println();

        //sap xep tang dan
        System.out.print("Sap xep tang dan: ");
        sapxepTang(array);
        showArray(array);
        System.out.println();

    }

    public static void add(int[] array) {
        Scanner scanner = new Scanner(System.in);
        int i = 0;
        while (i < array.length) {
            System.out.print("array[" + i + "]= ");
            array[i] = scanner.nextInt();
            i++;
        }
    }

    public static void showArray(int[] array) {
        for (int j = 0; j < array.length; j++) {
            System.out.print(array[j] + "\t");
        }
    }

    public static void daoNguoc(int[] array, int size) {
        for (int j = 0; j < array.length / 2; j++) {
            int temp = array[j];
            array[j] = array[size - 1 - j];
            array[size - 1 - j] = temp;
        }
    }

    public static void sapxepTang(int[] array) {
        int temp = array[0];
        for (int i = 0; i < array.length - 1; i++) {
            for (int j = i + 1; j < array.length; j++) {
                if (array[i] > array[j]) {
                    temp = array[i];
                    array[i] = array[j];
                    array[j] = temp;
                }
            }
        }
    }

    public static void findMin(int[] array) {
        int min = array[0];
        for (int i = 0; i < array.length; i++) {
            if (min > array[i]) {
                min = array[i];
            }
        }
        System.out.println("Min= " + min);
    }
}
