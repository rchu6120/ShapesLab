public class ETriangle {
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
}
