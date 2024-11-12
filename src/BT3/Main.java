package BT3;

public class Main {
    public class TestMovablePoint {
        public static void main(String[] args) {
            // Kiểm thử lớp Point
            Point point = new Point(2.5f, 3.5f);
            System.out.println("Point: " + point); // In ra (2.5, 3.5)

            // Kiểm thử lớp MovablePoint
            MovablePoint movablePoint = new MovablePoint(2.0f, 3.0f, 1.0f, 1.5f);
            System.out.println("MovablePoint trước khi di chuyển: " + movablePoint); // In ra (2.0, 3.0), speed=(1.0, 1.5)

            // Di chuyển điểm
            movablePoint.move();
            System.out.println("MovablePoint sau khi di chuyển: " + movablePoint); // In ra (3.0, 4.5), speed=(1.0, 1.5)
        }
    }

}
