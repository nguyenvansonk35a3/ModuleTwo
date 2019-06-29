package Chap03_ClassObject.THfan;

public class Fan {

    final int SLOW = 1;
    final int MEDIUM = 2;
    final int FAST = 3;

    private int speed = SLOW;
    private boolean on = false;
    private int radius = 5;
    private String color = "blue";

    public int getSLOW() {
        return SLOW;
    }

    public int getMEDIUM() {
        return MEDIUM;
    }

    public int getFAST() {
        return FAST;
    }

    public void setSpeed(int speed) {
        this.speed = speed;
    }

    public int getSpeed() {
        return speed;
    }

    public void setOn(boolean on) {
        this.on = on;
    }

    public boolean isOn() {
        return on;
    }

    public void setRadius(int radius) {
        this.radius = radius;
    }

    public int getRadius() {
        return radius;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public String getColor() {
        return color;
    }

    //contructor
    Fan() {
    }

    @Override
    public String toString() {
        if (on) {
            return this.speed + " - " + this.radius + " - " + this.color + " - Fan ON";
        } else {
            return this.speed + " - " + this.radius + " - " + this.color + " - Fan OFF";
        }
    }
}
