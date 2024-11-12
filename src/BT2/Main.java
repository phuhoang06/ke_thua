package BT2;

public class Main {
    public static void main(String[] args) {
        Point2D point2D = new Point2D(3.5f, 5.5f);
        System.out.println("Point2D: " + point2D); // In ra (3.5, 5.5)

        // Thay đổi giá trị x và y
        point2D.setX(4.0f);
        point2D.setY(6.0f);
        System.out.println("Sau khi thay đổi: " + point2D); // In ra (4.0, 6.0)

        // Thay đổi cả x và y bằng setXY
        point2D.setXY(1.0f, 2.0f);
        System.out.println("Sau khi gọi setXY: " + point2D); // In ra (1.0, 2.0)

        // Lấy mảng [x, y] từ getXY
        float[] xy = point2D.getXY();
        System.out.println("Mảng [x, y]: [" + xy[0] + ", " + xy[1] + "]");


        Point3D point3D = new Point3D(1.5f, 2.5f, 3.5f);
        System.out.println("Point3D: " + point3D); // In ra (1.5, 2.5, 3.5)

        // Thay đổi giá trị z
        point3D.setZ(4.5f);
        System.out.println("Sau khi thay đổi z: " + point3D); // In ra (1.5, 2.5, 4.5)

        // Thay đổi cả x, y và z bằng setXYZ
        point3D.setXYZ(2.0f, 3.0f, 5.0f);
        System.out.println("Sau khi gọi setXYZ: " + point3D); // In ra (2.0, 3.0, 5.0)

        // Lấy mảng [x, y, z] từ getXYZ
        float[] xyz = point3D.getXYZ();
        System.out.println("Mảng [x, y, z]: [" + xyz[0] + ", " + xyz[1] + ", " + xyz[2] + "]");
    }
}
