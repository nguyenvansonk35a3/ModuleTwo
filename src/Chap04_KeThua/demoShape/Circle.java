package Chap04_KeThua.demoShape;

public class Circle extends Shape {

    private double radius = 1.0;

    public Circle() {
    }

    public Circle(double radius) {
        this.radius = radius;
    }

    public Circle(double radius, String color, boolean filled) {
        super(color, filled);
        this.radius = radius;
    }

    public double getRadius() {
        return radius;
    }

    public void setRadius(double radius) {
        this.radius = radius;
    }

    public double getArea() {
        return Math.PI * this.radius * this.radius;
    }

    public double getPerimeter() {
        return Math.PI * 2 * this.radius;
    }

    @Override
    public String toString() {
        return "Circle: color = " + super.getColor() + " filled = " + super.isFilled()
                + " radius = " + this.getRadius() + " Area = " + this.getArea() + " Perimeter = " + this.getPerimeter();
    }
    
}
