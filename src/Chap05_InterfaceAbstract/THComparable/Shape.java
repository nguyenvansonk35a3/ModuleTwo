/**
 * Sử dụng interface Comparable và triển khai phương thức compareTo()
 * để hỗ trợ so sánh “hơn, kém, bằng” các đối tượng của các lớp hình học đã được viết ở bài trước.
 * Trong Java, phương thức java.util.Arrays.sort() sử dụng compareTo() để triển khai,
 * do đó, viết một chương trình sử dụng phương thức sort() để kiểm thử compareTo().
 */
package Chap05_InterfaceAbstract.THComparable;

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
