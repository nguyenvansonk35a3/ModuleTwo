package Chap05_InterfaceAbstract.THComparator;

import java.util.Arrays;
import java.util.Comparator;

public class RectangleComparatorTest {

    public static void main(String[] args) {
        //Khoi tao Rectangle
        Rectangle[] rectangles = new Rectangle[3];
        rectangles[0] = new Rectangle(3.0, 4.0);
        rectangles[1] = new Rectangle();
        rectangles[2] = new Rectangle(5.0, 6.0, "red", false);

        System.out.println("Before comparator:");
        for (Rectangle rectangle : rectangles) {
            System.out.println(rectangle + " - " + rectangle.getArea());
        }

        System.out.println("-------After Comparator---------");
        Comparator rectangleComparator = new RectangleComparator();
        Arrays.sort(rectangles, rectangleComparator);
        for (Rectangle rectangle : rectangles) {
            System.out.println(rectangle + " - " + rectangle.getArea());
        }
    }
}
