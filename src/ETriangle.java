public class ETriangle extends Shape {
    private int side;

    public ETriangle(int side) {
        super("ETriangle");
        this.side = side;
    }

    public double getArea() {
        return (Math.sqrt(3)/4) * Math.pow(side,2);
    }

    public double getPerimeter() {
        return side * 3;
    }
}

    public static void findArea(int sideLength)
    {
        int x= (int) (Math.sqrt(3)) / 4;
        int area= (sideLength * sideLength) * x;
        System.out.println("The area of an equilateral triangle with side length " + sideLength + " is" + area + ".");
    }

    public static void findPerimeter(int sideLength)
    {
        int perimeter= 3 * sideLength;
        System.out.println("The perimeter of an equilateral triangle with side length " + sideLength + "is " + perimeter + ".");
    }
