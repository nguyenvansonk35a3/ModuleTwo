package Chap03_ClassObject.demoCircle;

public class MainCircle {

    public static void main(String[] args) {
        //Tao doi tuong
        Circle circle = new Circle();
        circle.circleInfo();

        //hinh tron 2
        Circle circle2 = new Circle(3.6);
        circle2.circleInfo();

        //hinh tron 3
        Circle circle3 = new Circle(5, "yellow");
        circle3.circleInfo();
    }
}
