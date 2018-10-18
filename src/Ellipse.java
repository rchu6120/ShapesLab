public class Ellipse extends Shape {
    private int majoraxis, minoraxis;

    /**
     * Declares the Shape type as an "Ellipse"
     * @param majoraxis the major axis of an ellipse
     * @param minoraxis the minor axis of an ellipse
     */
    public Ellipse(int majoraxis, int minoraxis) {
        super("Ellipse");
        this.majoraxis = majoraxis;
        this.minoraxis = minoraxis;
    }

    /**
     * Calculates the area according to the formula
     * @return the area of an ellipse
     */
    public double getArea() {
        return Math.PI * majoraxis * minoraxis;
    }

    public double getPerimeter() {
        return 2 * Math.PI * Math.sqrt((Math.pow(majoraxis,2) + Math.pow(minoraxis,2))/2);
    }
}
