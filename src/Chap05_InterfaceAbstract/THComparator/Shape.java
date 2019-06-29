/**
 * Ở bài thực hành trước đã tiến hành cho các lớp hình học triển khai interface Comparable để hỗ trợ so sánh “hơn, kém, bằng”.
 * Phương án này không phù hợp khi mà vì lý do gì đó, không thể thay đổi các lớp đã có sẵn, cũng như không thể tùy ý tạo ra và sử dụng các lớp kế thừa mới.
 * Trong trường hợp đó, ta có thể sử dụng những đối tượng thuộc những lớp mà có triển khai interface Comparator và phương thức compare() của nó, để phục phụ việc so sánh, như hướng dẫn dưới đây.
 */
package Chap05_InterfaceAbstract.THComparator;

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
