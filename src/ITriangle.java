//Ashanti Clarke
public class ITriangle extends Shape {
    private int base, leg;

    /**
     * Declares the shape type as "ITriangle"
     * @param base the base of an isosceles triangle
     * @param leg the height of an isosceles triangle
     */
    public ITriangle(int base, int leg) {
        super("ITriangle");
        this.base = base;
        this.leg = leg;
    }

    /**
     * Calculates the area according to the formula
     * @return the area of an isosceles triangle
     */
    public double getArea() {
        double height = Math.sqrt((Math.pow(leg,2))-(Math.pow((base/2.0),2)));
        return (base * height)/2;
    }

    /**
     * Calculates the perimeter according to the formula
     * @return the perimeter of an isosceles triangle
     */
    public double getPerimeter() {
        return (2 * leg) + base;
    }
}
