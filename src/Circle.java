//Ricky Chu
public class Circle extends Shape {
    private int radius;

    /**
     * Declares the Shape type as "Circle"
     * @param radius the radius of a circle
     */
    public Circle (int radius) {
        super( "Circle");
        this.radius = radius;
    }

    /**
     * Calculates the area according to the formula
     * @return the area of the circle
     */
    public double getArea() {
        return Math.PI * Math.pow(radius,2);
    }

    /**
     * Calculates the perimeter according to the formula
     * @return the perimeter of the circle
     */
    public double getPerimeter() {
        return 2 * Math.PI * radius;
    }
}
