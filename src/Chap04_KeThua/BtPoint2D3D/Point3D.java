package Chap04_KeThua.BtPoint2D3D;

public class Point3D extends Point2D {

    private float z = 0.0f;

    Point3D() {
    }

    Point3D(float x, float y, float z) {
        super(x, y);
        this.z = z;
    }

    public float getZ() {
        return z;
    }

    public void setZ(float z) {
        this.z = z;
    }

    public void setXYZ(float x, float y, float z) {
        super.setX(x);
        super.setY(y);
        this.z = z;
    }

    public float[] getXYZ() {
        float[] arr = new float[3];
        arr[0] = getX();
        arr[1] = getY();
        arr[2] = z;
        return arr;
    }

    @Override
    public String toString() {
        float[] arr = getXYZ();
        return "Point3D: (x,y,z) = (" + arr[0] + "," + arr[1] + "," + arr[2] + ")";
    }
}
