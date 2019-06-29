package Chap03_ClassObject.THPTB2;

import java.util.Scanner;

public class TestQuadraticEquation {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("a: ");
        double a = sc.nextDouble();
        System.out.print("b: ");
        double b = sc.nextDouble();
        System.out.print("c: ");
        double c = sc.nextDouble();

        QuadraticEquation qua = new QuadraticEquation(a, b, c);

        display(qua);

//        Cach1:viet truc tiep
//        if (qua.getDelta()>0){
//            System.out.println("Pt co 2 nghiem " + qua.getRoot1() + " va " + qua.getRoot2());
//        } else if(qua.getDelta() == 0){
//            System.out.println("Pt co nghiem kep: " + qua.getRoot1());
//        } else {
//            System.out.println("The equation has no roots");
//        }
    }

    //Cach 2: tach ham
    public static void display(QuadraticEquation object) {
        if (object.getDelta() > 0) {
            System.out.println("Pt co 2 nghiem " + object.getRoot1() + " va " + object.getRoot2());
        } else if (object.getDelta() == 0) {
            System.out.println("Pt co nghiem kep: " + object.getRoot1());
        } else {
            System.out.println("The equation has no roots");
        }
    }
}
