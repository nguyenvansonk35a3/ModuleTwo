package Chap05_InterfaceAbstract.THComparator;

import java.util.Arrays;
import java.util.Comparator;

public class TriangleComparatorTest {

    public static void main(String[] args) {
        //Khoi tao Triangle
        Triangle[] triangles = new Triangle[3];
        triangles[0] = new Triangle(2, 3, 4);
        triangles[1] = new Triangle();
        triangles[2] = new Triangle(4, 6, 7, "Yellow", true);

        System.out.println("---Before Comparator-----");
        for (Triangle triangle : triangles) {
            System.out.println(triangle);
        }

        System.out.println("----After Comparator-----");
        Comparator triangleComparator = new TriangleComparator();
        Arrays.sort(triangles, triangleComparator);
        for (Triangle triangle : triangles) {
            System.out.println(triangle);
        }
    }
}
