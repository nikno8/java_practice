package practice_3;

public class MovableTest {
    public static void main(String[] args) {
        MovablePoint point1 = new MovablePoint(1, 0, 40, 20);
        System.out.println(point1);
        point1.moveDown();
        point1.moveRight();
        System.out.println(point1);

        MovableCircle circle1 = new MovableCircle(5, 5, 10, 10, 50);
        System.out.println(circle1);
        circle1.moveLeft();
        circle1.moveUp();
        System.out.println(circle1);

        MovableRectangle rectangle1 = new MovableRectangle(0, 0, 15, -6, 34, 56);
        System.out.println(rectangle1);
        rectangle1.moveUp();
        rectangle1.moveRight();
        System.out.println(rectangle1);
    }
}
