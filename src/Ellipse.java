public class Ellipse extends Shape {
    private int majoraxis, minoraxis;

    public Ellipse(int majoraxis, int minoraxis) {
        super("Ellipse");
        this.majoraxis = majoraxis;
        this.minoraxis = minoraxis;
    }

    public double getArea() {
        return Math.PI * majoraxis * minoraxis;
    }

    public double getPerimeter() {
        return 
    }
}
