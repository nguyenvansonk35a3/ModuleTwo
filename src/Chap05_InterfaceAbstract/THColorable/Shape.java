/**
 *Hãy tạo một interface Colorable với một phương thức void có tên howToColor(). 
 * Cho lớp Square triển khai interface này với phương thức howToColor() hiển thị thông điệp Color all four sides.
 * Tạo một mảng các đối tượng hình học trong đó có ít nhất một Square. 
 * Với mỗi phần tử trong mảng, hiển thị diện tích của nó, nếu phần tử đó là một Colorable, gọi phương thức howToColor().
 */
package Chap05_InterfaceAbstract.THColorable;

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
