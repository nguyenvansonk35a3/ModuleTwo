package Chap05_InterfaceAbstract.THResizeable;

public class Rectangle extends Shape implements Resizeable {

    private double width = 1.0;
    private double height = 1.0;

    Rectangle() {
    }

    Rectangle(double width, double height) {
        this.width = width;
        this.height = height;
    }

    Rectangle(double width, double height, String color, boolean filled) {
        super(color, filled);
        this.width = width;
        this.height = height;
    }

    public double getWidth() {
        return width;
    }

    public void setWidth(double width) {
        this.width = width;
    }

    public double getHeight() {
        return height;
    }

    public void setHeight(double height) {
        this.height = height;
    }

    public double getArea() {
        return this.width * this.height;
    }

    public double getPerimeter() {
        return 2 * (this.width + this.height);
    }

    @Override
    public String toString() {
        return "Rectangle: width = " + getWidth() + ", height = " + getHeight() + ", getArea = " + this.getArea()
                + ",which is a subclass of " + super.toString();
    }

    @Override
    public void resize(double percent) {
        this.height += this.height * percent / 100;
        this.width += this.width * percent / 100;
    }
}
