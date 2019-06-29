package Chap04_KeThua.BtPoint2D3D;

public class TestPoint {

    public static void main(String[] args) {
        Point2D point2D = new Point2D();
        System.out.println(point2D);

        point2D = new Point2D(1, 2);
        System.out.println(point2D);

        System.out.println("===================================");
        Point3D point3D = new Point3D();
        System.out.println(point3D);

        point3D = new Point3D(4, 5, 6);
        System.out.println(point3D);
    }
}
