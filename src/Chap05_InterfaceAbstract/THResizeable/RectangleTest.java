package Chap05_InterfaceAbstract.THResizeable;

public class RectangleTest {

    public static void main(String[] args) {
        Rectangle rectangle = new Rectangle();
        System.out.println(rectangle);

        rectangle = new Rectangle(2.3, 5.8);
        System.out.println(rectangle);

        rectangle = new Rectangle(2.5, 3.8, "orange", false);
        System.out.println(rectangle);
    }
}