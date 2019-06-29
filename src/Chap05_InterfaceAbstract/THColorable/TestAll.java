package Chap05_InterfaceAbstract.THColorable;

public class TestAll {

    public static void main(String[] args) {
        Shape[] shapes = new Shape[3];
        shapes[0] = new Circle();
        shapes[1] = new Rectangle();
        shapes[2] = new Square();

        System.out.println("---------Before----------");
        for (Shape shape : shapes) {
            System.out.println(shape);
        }

        System.out.println("---------After----------");
        for (Shape shape : shapes) {
            System.out.println(shape);

            //test Square
            if (shape instanceof Square) {
                Colorable colorable = (Square) shape;
                colorable.howToColor();
            }

        }
    }

}
