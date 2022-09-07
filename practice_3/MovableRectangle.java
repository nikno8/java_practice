package practice_3;

public class MovableRectangle implements Movable {
    private MovablePoint topLeft;
    private MovablePoint bottomRight;

    public MovableRectangle(int x1, int y1, int x2, int y2, int xSpeed, int ySpeed) {
        this.topLeft = new MovablePoint(x1,y1,xSpeed,ySpeed);
        this.bottomRight = new MovablePoint(x2,y2,xSpeed,ySpeed);
    }

    @Override
    public String toString() {
        return "MovableRectangle{" +
                "topLeft=" + topLeft +
                ", bottomRight=" + bottomRight +
                '}';
    }

    public boolean XChecker()
    {
        return (topLeft.xSpeed == bottomRight.xSpeed);
    }
    public boolean YChecker()
    {
        return (topLeft.ySpeed == bottomRight.ySpeed);
    }
    @Override
    public void moveUp() {
        if (YChecker())
        {
           this.topLeft.moveUp();
           this.bottomRight.moveUp();
        }
    }

    @Override
    public void moveDown() {
        if (YChecker())
        {
            this.topLeft.moveDown();
            this.bottomRight.moveDown();
        }
    }

    @Override
    public void moveLeft() {
        if (XChecker())
        {
            this.topLeft.moveLeft();
            this.bottomRight.moveLeft();
        }

    }

    @Override
    public void moveRight() {
        if (XChecker())
        {
            this.topLeft.moveRight();
            this.bottomRight.moveRight();
        }
    }

}
