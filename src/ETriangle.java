//Ashanti Clarke
public class ETriangle extends Shape {
    private int side;

    /**
     * Declares the shape type as "ETriangle"
     * @param side the side of an equilateral triangle
     */
    public ETriangle(int side) {
        super("ETriangle");
        this.side = side;
    }

    /**
     * Calculates the area according to the formula
     * @return the area of an equilateral triangle
     */
    public double getArea() {
        return (Math.sqrt(3)/4) * Math.pow(side,2);
    }

    /**
     * Calculates the perimeter according to the formula
     * @return the perimeter of an equilateral triangle
     */
    public double getPerimeter() {
        return side * 3;
    }
}


