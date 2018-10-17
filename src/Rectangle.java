public class Rectangle extends Shape {
    private int length, width;

    public Rectangle(int length, int width) {
        super("Rectangle");
        this.length = length;
        this.width = width;
    }

    public double getArea() {
        return length * width;
    }

    public double getPerimeter() {
        return (2 * length) + (2 * width);
    }
}
