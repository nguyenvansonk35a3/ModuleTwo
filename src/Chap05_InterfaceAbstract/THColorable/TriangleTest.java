package Chap05_InterfaceAbstract.THColorable;

public class TriangleTest {

    public static void main(String[] args) {
        Triangle triangle = new Triangle();
        Triangle triangle1 = new Triangle(2, 3, 4);
        Triangle triangle2 = new Triangle(5, 6, 7, "white", false);

        System.out.println(triangle);
        System.out.println(triangle1);
        System.out.println(triangle2);
    }
}
