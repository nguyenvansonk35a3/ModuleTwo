package Chap04_KeThua.demoShape;

public class Square extends Rectangle {

//    private double side = super.getWidth();
    public Square() {
    }

    public Square(double side) {
        super(side, side);
    }

    public Square(String color, boolean filled, double side) {
        super(color, filled, side, side);
    }

    public double getSide() {
        return super.getWidth();
    }

    public void setSide(double side) {
        super.setWidth(side);
    }

    public void setLength(double side) {
        super.setLength(side);
    }

    @Override
    public String toString() {
        return "Square: color = " + super.getColor() + " filled = " + super.isFilled() + " side = " + this.getSide();
    }

}
