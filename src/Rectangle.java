public class Rectangle extends Shape {
    private int length, width;

    /**
     * Declares the shape type as "Rectangle"
     * @param length the length of a rectangle
     * @param width the width of a rectangle
     */
    public Rectangle(int length, int width) {
        super("Rectangle");
        this.length = length;
        this.width = width;
    }

    /**
     * Declares the shape type as "Square" and the code is based off the constructor
     * @param side the side of a square
     */
    public Rectangle(int side) {
        super("Square");
        this.length = side;
        this.width = side;
    }

    /**
     * Calculates the area according to the formula
     * @return the area of a rectangle
     */
    public double getArea() {
        return length * width;
    }

    /**
     * Calculates the perimeter according to the formula
     * @return the perimeter of a rectangle
     */
    public double getPerimeter() {
        return (2 * length) + (2 * width);
    }
}
