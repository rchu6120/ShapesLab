//Belal Jamil
public class Square extends Rectangle {
    private int side;

    /**
     * Declares the shape class as a Square
     * @param side the side of a square
     */
    public Square(int side) {
        super(side);
        this.side = side;
    }

    /**
     * Calculates the area according to the formula
     * @return the area of a square
     */
    public double getArea() {
        return Math.pow(side,2);
    }

    /**
     * Calculates the perimeter according to the formula
     * @return the perimeter of a square
     */
    public double getPerimeter() {
        return 4 * side;
    }
}
