public class ITriangle extends Shape {
    private int base, leg;

    public ITriangle(int base, int height) {
        super("ITriangle");
        this.base = base;
        this.leg = leg;
    }

    public double getArea() {
        double height = Math.sqrt((Math.pow(leg,2))-(Math.pow(base/2,2)));
        return (1/2) * base * height;
    }

    public double getPerimeter() {
        return (2 * leg) + base;
    }
}
