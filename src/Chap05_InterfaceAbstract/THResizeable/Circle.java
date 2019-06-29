package Chap05_InterfaceAbstract.THResizeable;

public class Circle extends Shape implements Resizeable {

    private double radius = 1.0;

    Circle() {
    }

    Circle(double radius) {
        this.radius = radius;
    }

    Circle(double radius, String color, boolean filled) {
//        super(color,filled);
        this.radius = radius;
        setColor(color);
        setFilled(filled);
    }

    public double getRadius() {
        return radius;
    }

    public void setRadius(double radius) {
        this.radius = radius;
    }

    public double getArea() {
        return Math.PI * radius * radius;
    }

    public double getPerimeter() {
        return Math.PI * radius * 2;
    }

    @Override
    public String toString() {
        return "Circle: radius = " + getRadius() + ", getArea = " + this.getArea() + ", is subclass of:  " + super.toString();
    }

    //resize kich thuoc
    @Override
    public void resize(double percent) {
        this.radius += this.radius * percent / 100;
    }
}
