package BT3;

public class Point {
    private float x = 0.0f;
    private float y = 0.0f;

    // Constructor không tham số
    public Point() {
    }

    // Constructor có tham số
    public Point(float x, float y) {
        this.x = x;
        this.y = y;
    }

    // Getter cho x
    public float getX() {
        return x;
    }

    // Setter cho x
    public void setX(float x) {
        this.x = x;
    }

    // Getter cho y
    public float getY() {
        return y;
    }

    // Setter cho y
    public void setY(float y) {
        this.y = y;
    }

    // Setter cho cả x và y
    public void setXY(float x, float y) {
        this.x = x;
        this.y = y;
    }

    // Getter trả về mảng chứa x và y
    public float[] getXY() {
        return new float[]{x, y};
    }

    // Phương thức toString
    @Override
    public String toString() {
        return "(" + x + ", " + y + ")";
    }
}

