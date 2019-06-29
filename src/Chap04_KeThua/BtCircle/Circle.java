package Chap04_KeThua.BtCircle;

public class Circle {

    private double radius;
    private String color;

    public Circle() {
    }

    public Circle(double radius, String color) {
        this.radius = radius;
        this.color = color;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public double getRadius() {
        return radius;
    }

    public void setRadius(double radius) {
        this.radius = radius;
    }

    //dien tich
    public double getDienTich() {
        return Math.PI * this.radius * this.radius;
    }

    //chu vi
    public double getChuvi() {
        return Math.PI * radius * 2;
    }

    @Override
    public String toString() {
        return "Circle: radius = " + getRadius() + ", color = " + getColor();
    }

}
