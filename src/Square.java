public class Square extends Rectangle {
    private int side;

    public Square(int side) {
        super(side);
        this.side = side;
    }

    public double getArea() {
        return Math.pow(side,2);
    }

    public double getPerimeter() {
        return 4 * side;
    }
}
