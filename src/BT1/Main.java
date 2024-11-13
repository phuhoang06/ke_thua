package BT1;

import java.util.Arrays;

public class Main {
    public static void main(String[] args) {
        Circle[] c = new Circle[2];
        c[0] = new Circle(3, "red");
        c[1] = new Cylinder(5, "yellow",10);

        ComparableCircle[] circles = new ComparableCircle[3];
        circles[0] = new ComparableCircle();
        circles[1] = new ComparableCircle();
        circles[2] = new ComparableCircle(3.5, "indigo", false);

        System.out.println("Pre-sorted:");
        for (ComparableCircle circle : circles) {
            System.out.println(circle);
        }

        Arrays.sort(circles);

        System.out.println("After-sorted:");
        for (ComparableCircle circle : circles) {
            System.out.println(circle);
        }

        ComparableCircle[] circl = new ComparableCircle[3];
        circles[0] = new ComparableCircle();
        circles[1] = new ComparableCircle();
        circles[2] = new ComparableCircle(3.5, "indigo", false);

        System.out.println("Pre-sorted:");
        for (ComparableCircle circle : circl) {
            System.out.println(circle);
        }

        Arrays.sort(circl);

        System.out.println("After-sorted:");
        for (ComparableCircle circle : circl) {
            System.out.println(circle);
        }

    }
}
