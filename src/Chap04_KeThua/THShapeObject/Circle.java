package Chap04_KeThua.THShapeObject;

public class Circle extends Shape {

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
        return "A Circle with radius = " + getRadius() + " , is subclass of:  " + super.toString();
    }
}
