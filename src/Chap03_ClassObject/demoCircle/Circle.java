package Chap03_ClassObject.demoCircle;

public class Circle {

    //khai bao thuoc tinh
    private double radius;      //ban kinh
    private String color;

    //Phuong thuc khoi tao - trung ten voi class
    public Circle() {
        this.radius = 3;
        this.color = "Blue";
    }

    public Circle(double radius) {
        this.radius = radius;
    }

    public Circle(double radius, String color) {
        this.radius = radius;
        this.color = "Blue";
    }

    //cac phuong thuc thay doi gia tri cua thuoc tinh
    public void setRadius(double radius) {
        this.radius = radius;
    }

    //khai bao phuong thuc
    public double getRadius() {
        return this.radius;
    }

    public String getColor() {
        return this.color;
    }

    public double getArea() {
        return this.radius * this.radius * Math.PI;
    }

    //display
    public void circleInfo() {
        System.out.println("radius: " + this.getRadius() + " Color: " + this.getColor() + " Area: " + this.getArea());
    }
}
