package TH1;

public class Main {
    public static void main(String[] args) {
        Shape[] shapes = new Shape[3];
        shapes[0] = new Circle("red", false, 5);
        shapes[1] = new Rectangle("yellow", true, 10, 5);
        shapes[2] = new Square("green", false, 5);
        for (Shape shape : shapes) {
            System.out.println(shape);
        }

    }
}
