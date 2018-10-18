public class Rectangle extends Shape {
    private int length, width;

    public Rectangle(int length, int width) {
        super("Rectangle");
        this.length = length;
        this.width = width;
    }

    public Rectangle(int side) {
        super("Square");
        this.length = side;
        this.width = side;
    }

    public double getArea() {
        return length * width;
    }

    public double getPerimeter() {
        return (2 * length) + (2 * width);
    }
}
