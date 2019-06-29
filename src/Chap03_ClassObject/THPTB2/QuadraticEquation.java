package Chap03_ClassObject.THPTB2;

public class QuadraticEquation {

    private double a;
    private double b;
    private double c;

    QuadraticEquation() {
    }

    //khoi tao gia tri 3 tham so
    QuadraticEquation(double A, double B, double C) {
        this.a = A;
        this.b = B;
        this.c = C;
    }

    //getter and setter
    public void setA(double A) {
        this.a = A;
    }

    public void setB(double B) {
        this.b = B;
    }

    public void setC(double C) {
        this.c = C;
    }

    public double getA() {
        return a;
    }

    public double getB() {
        return b;
    }

    public double getC() {
        return c;
    }

    double getDelta() {
        double delta;
        delta = b * b - 4 * a * c;
        return delta;
    }

    double getRoot1() {
        return (-b + Math.sqrt(b * b - 4 * a * c)) / (2 * a);
    }

    double getRoot2() {
        return (-b - Math.sqrt(b * b - 4 * a * c)) / (2 * a);
    }
}
