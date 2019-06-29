package Chap03_ClassObject.THHCN;

public class HCN {

    int width;
    int height;

    HCN() {
    }

    HCN(int width, int height) {
        this.width = width;
        this.height = height;
    }

    public int getArea() {
        if (width < 0 | height < 0) {
            return -1;
        } else {
            return width * height;
        }
    }

    public int getPerimeter() {
        if (width < 0 | height < 0) {
            return -1;
        } else {
            return (width + height) * 2;
        }
    }

    public String display() {
        return "Width: " + width + " - Height: " + height;
    }
}
