package BT1;

public class Cylinder extends Circle{
    private double Height = 1.0;

    public Cylinder() {
    }

    public Cylinder(double height) {
        Height = height;
    }

    public Cylinder(double radius, String color, double height) {
        super(radius, color);
        Height = height;
    }

    public double getHeight() {
        return Height;
    }

    public void setHeight(double height) {
        Height = height;
    }

    public double getVolume(){
        return Math.PI * getRadius() * getHeight() * getRadius();
    }

    @Override
    public String toString() {
        return "Cylinder{" +
                "Height=" + Height +
                "} " + super.toString();
    }
}
