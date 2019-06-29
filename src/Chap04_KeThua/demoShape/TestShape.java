package Chap04_KeThua.demoShape;

public class TestShape {

    public static void main(String[] args) {
        //Test Circle
        Circle circle = new Circle();
        System.out.println(circle);

        Circle circle1 = new Circle(3.0);
        System.out.println(circle1);

        Circle circle2 = new Circle(3.6, "Blue", false);
        System.out.println(circle2);

        System.out.println("");

        //test Rectangle
        Rectangle rectangle = new Rectangle();
        System.out.println(rectangle);

        Rectangle rectangle1 = new Rectangle(4, 5);
        System.out.println(rectangle1);

        Rectangle rectangle2 = new Rectangle("white", false, 7, 8);
        System.out.println(rectangle2);

        System.out.println("");

        //Test Square
        Square square = new Square();
        System.out.println(square);

        Square square1 = new Square(0);
        System.out.println(square1);

        Square square2 = new Square("yellow", false, 9);
        System.out.println(square2);

    }
}
