package practice_3;

class Square extends Rectangle {
    public Square() {

    }
    public Square(double side)
    {
        this.width = side;
    }
    public Square(double side,String color, boolean filled)
    {
        this.width = side;
        this.color = color;
        this.filled = filled;
    }
    public double getSide() {
        return this.width;
    }

    @Override
    public void setWidth(double side) {

        super.setWidth(width);
    }

    @Override
    public void setLength(double side) {

        super.setLength(side);
    }

    public void setSide(double side) {
        setWidth(side);
    }

    @Override
    public String toString() {
        return "This is a square:" + "Side: " + this.width + ", color: "+ this.color + ", filled: " + this.filled;
    }
}
