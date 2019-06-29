/**
 * tạo một interface Resizeable với một phương thức void có tên resize(double percent).
 * Phương thức này tăng kích thước các hình lên tỷ lệ phần trăm được cho bởi đối số đầu vào.
 * Cho lớp Circle, Rectangle và Square triển khai phương thức này.
 */
package Chap05_InterfaceAbstract.THResizeable;

public class Shape {

    private String color = "green";
    private boolean filled = true;

    public Shape() {
    }

    Shape(String color, boolean filled) {
        this.color = color;
        this.filled = filled;
    }

    public boolean isFilled() {
        return filled;
    }

    public void setFilled(boolean filled) {
        this.filled = filled;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    @Override
    public String toString() {
        return "Shape - Color: " + this.color + ", " + (isFilled() ? "filled" : "not filled");
    }

}
