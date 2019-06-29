package Chap05_InterfaceAbstract.THComparator;

import java.util.Arrays;
import java.util.Comparator;

public class SquareComparatorTest {

    public static void main(String[] args) {
        //Khai bao Square
        Square[] squares = new Square[3];
        squares[0] = new Square();
        squares[1] = new Square(0.5);
        squares[2] = new Square(5.0, "yellow", true);

        System.out.println("Before Comparator:");
        for (Square square : squares) {
            System.out.println(square);
        }

        System.out.println("----After Comparator-----");
        Comparator squareComparator = new SquareComparator();
        Arrays.sort(squares, squareComparator);
        for (Square square : squares) {
            System.out.println(square + " - " + square.getPerimeter());
        }

    }

}
