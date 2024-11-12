package BT3;

public class MovablePoint extends Point {
    private float xSpeed = 0.0f;
    private float ySpeed = 0.0f;

    // Constructor không tham số
    public MovablePoint() {
    }

    // Constructor có tham số xSpeed và ySpeed
    public MovablePoint(float xSpeed, float ySpeed) {
        this.xSpeed = xSpeed;
        this.ySpeed = ySpeed;
    }

    // Constructor có tham số x, y, xSpeed và ySpeed
    public MovablePoint(float x, float y, float xSpeed, float ySpeed) {
        super(x, y);
        this.xSpeed = xSpeed;
        this.ySpeed = ySpeed;
    }

    // Getter cho xSpeed
    public float getXSpeed() {
        return xSpeed;
    }

    // Setter cho xSpeed
    public void setXSpeed(float xSpeed) {
        this.xSpeed = xSpeed;
    }

    // Getter cho ySpeed
    public float getYSpeed() {
        return ySpeed;
    }

    // Setter cho ySpeed
    public void setYSpeed(float ySpeed) {
        this.ySpeed = ySpeed;
    }

    // Setter cho cả xSpeed và ySpeed
    public void setSpeed(float xSpeed, float ySpeed) {
        this.xSpeed = xSpeed;
        this.ySpeed = ySpeed;
    }

    // Getter trả về mảng chứa xSpeed và ySpeed
    public float[] getSpeed() {
        return new float[]{xSpeed, ySpeed};
    }

    // Phương thức move để di chuyển điểm
    public MovablePoint move() {
        setXY(getX() + xSpeed, getY() + ySpeed);
        return this;
    }

    // Phương thức toString
    @Override
    public String toString() {
        return super.toString() + ", speed=(" + xSpeed + ", " + ySpeed + ")";
    }
}

