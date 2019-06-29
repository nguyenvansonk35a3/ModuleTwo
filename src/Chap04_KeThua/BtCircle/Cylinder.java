package Chap04_KeThua.BtCircle;

public class Cylinder extends Circle {

    double height;

    public Cylinder() {
    }

    public Cylinder(double height) {
        this.height = height;
    }

    public Cylinder(double height, double radius, String color) {
        super(radius, color);
        this.height = height;
    }

    public double getDienTichHinhTru() {
        return super.getDienTich() * 2 + this.height * getChuvi();
    }

    @Override
    public String toString() {
        return "Cylinder: radius = " + "height= " + this.height + " Dien tich hinh tru = " + this.getDienTichHinhTru();
    }
}
