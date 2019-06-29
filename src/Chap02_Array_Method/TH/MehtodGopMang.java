package Chap02_Array_Method.TH;

import java.util.Scanner;

public class MehtodGopMang {

    public static void main(String[] args) {
        int[] arrOne = new int[4];
        int[] arrTwo = new int[5];
        int size = arrOne.length + arrTwo.length;

        int[] arrThree = new int[size];

        System.out.println("nhap mang 1: ");
        add(arrOne);
        System.out.println("Nhap mang 2: ");
        add(arrTwo);

        System.out.print("Show 1: ");
        show(arrOne);

        System.out.println();

        System.out.print("Show 2: ");
        show(arrTwo);

        System.out.println();

        System.out.print("Gop mang: ");
        gopMang(arrOne, arrTwo, arrThree, size);
        show(arrThree);

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

    public static void gopMang(int[] arrOne, int[] arrTwo, int[] arrThree, int size) {
        for (int i = 0; i < arrOne.length; i++) {
            arrThree[i] = arrOne[i];
        }
        int j = 0;
        for (int i = arrOne.length; i < size; i++) {
            arrThree[i] = arrTwo[j];
            j++;
        }
    }
}
