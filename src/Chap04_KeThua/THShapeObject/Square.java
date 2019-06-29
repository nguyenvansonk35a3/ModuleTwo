package Chap04_KeThua.THShapeObject;

public class Square extends Rectangle {

    Square() {
    }

    Square(double size) {
        super(size, size);
    }

    Square(double size, String color, boolean filled) {
        super(size, size, color, filled);
    }

    public double getSize() {
        return getWidth();
    }

    public void setSize(double size) {
        setWidth(size);
        setHeight(size);
    }

    @Override
    public void setWidth(double width) {
        setSize(width);
    }

    @Override
    public void setHeight(double height) {
        setSize(height);
    }

    @Override
    public String toString() {
        return "Square with side = " + getSize() + ", which is a subClass of: " + super.toString();
    }
}
