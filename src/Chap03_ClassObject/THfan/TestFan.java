package Chap03_ClassObject.THfan;

public class TestFan {

    public static void main(String[] args) {
        Fan fan1 = new Fan();

        fan1.setSpeed(fan1.getFAST());
        fan1.setRadius(10);
        fan1.setColor("Yellow");
        fan1.setOn(true);
        fan1.isOn();
        System.out.println("=============Object One==============");
        System.out.println(fan1.toString());

        Fan fan2 = new Fan();
        fan2.setSpeed(fan2.getMEDIUM());
        fan2.setOn(false);
        fan2.isOn();

        System.out.println("==============Object Two================");
        System.out.println(fan2.toString());

    }
}
