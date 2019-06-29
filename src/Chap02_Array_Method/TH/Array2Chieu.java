package Chap02_Array_Method.TH;

import java.util.Scanner;

public class Array2Chieu {

    public static void main(String[] args) {

        int[][] arr = new int[5][5];

        System.out.println("Ung dung mang 2 chieu");
        System.out.println("*****************Menu********************");
        System.out.println("1. Nhap mang");
        System.out.println("2. In mang");
        System.out.println("3. Tim phan tu lon nhat trong mang");
        System.out.println("4. Exit");
        System.out.println("*****************************************");

        while (true) {
            System.out.print("choise: ");
            Scanner scanner = new Scanner(System.in);
            int number = scanner.nextInt();
            switch (number) {
                case 1:
                    System.out.println("Nhap mang: ");
                    add(arr);
                    break;
                case 2:
                    System.out.println("In mang: ");
                    show(arr);
                    break;
                case 3:
                    System.out.println(" tim Max: ");
                    findMaxValue(arr);
                    break;
                case 4:
                    System.out.println("Exit");
                    System.exit(0);
                default:
                    System.out.println("please choise again!");
            }
        }
    }

    //nhap
    public static void add(int[][] arr) {
        Scanner scanner = new Scanner(System.in);
        for (int row = 0; row < arr.length; row++) {
            for (int colum = 0; colum < arr.length; colum++) {
                System.out.print("arr[" + row + "," + colum + "]= ");
                arr[row][colum] = scanner.nextInt();
            }
        }
    }

    //in
    public static void show(int[][] arr) {
        for (int row = 0; row < arr.length; row++) {
            for (int colum = 0; colum < arr.length; colum++) {
                System.out.print(arr[row][colum] + "\t");
            }
            System.out.println();
        }
    }

    //findMax
    public static void findMaxValue(int[][] arr) {
        int max = arr[0][0];
        int xMax = 0;
        int yMax = 0;
        for (int row = 0; row < arr.length; row++) {
            for (int colum = 0; colum < arr.length; colum++) {
                if (max < arr[row][colum]) {
                    max = arr[row][colum];
                    xMax = row;
                    yMax = colum;
                }
            }
        }
        System.out.println("max = arr[" + xMax + "," + yMax + "]=" + max);
    }
}
