package practice_3;

 class Rectangle extends Shape {
    protected double width;
    protected double length;

    public Rectangle() {
        super();
        this.width = 5;
        this.length = 5;
    }

    public Rectangle(double width, double length) {
        super();
        this.width = width;
        this.length = length;
    }

    public Rectangle(double width, double length, String color, boolean filled) {
        this.width = width;
        this.length = length;
        this.color = color;
        this.filled = filled;
    }

     public double getWidth() {
         return width;
     }

     public double getLength() {
         return length;
     }

     public void setLength(double length) {
         this.length = length;
     }

     public void setWidth(double width) {
         this.width = width;
     }

     @Override
     double getArea() {
        return  this.length * this.width;
     }

     @Override
     double getPerimeter() {
         return 2*(this.length + this.width);
     }

     @Override
     public String toString() {
         return "Shape: rectangle, width: " + this.width + ", length: " + this.length + ", color: " + this.color;
     }
 }
