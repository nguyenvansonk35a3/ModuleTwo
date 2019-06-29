package Chap04_KeThua.THShapeObject;

public class Shape {

    private String color = "green";
    private boolean filled = true;

    Shape() {
    }

    Shape(String color, boolean filled) {
        this.color = color;
        this.filled = filled;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public boolean isFilled() {
        return filled;
    }

    public void setFilled(boolean filled) {
        this.filled = filled;
    }

    @Override
    public String toString() {
        return " A shape with Color is: " + getColor() + " and filled is: " + (filled == true ? " Yes" : " No");
//            return " A shape with color is: " + getColor() + " and " + (isFilled() ? " filled ": " not  filled");
    }
}
