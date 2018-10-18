public class Runner {
    public static void main(String[] args) {
        Shape shape1 = new Rectangle(10,5);
        Shape shape2 = new ETriangle(5);
        Shape shape3 = new Circle(10);
        Shape shape4 = new Ellipse(10,5);
        Shape shape5 = new ITriangle(3,5);
        Shape shape6 = new Square(5);

        Shape[] shapes = {shape1, shape2, shape3, shape4, shape5, shape6};

        for (Shape cur : shapes) {
            System.out.println(cur);
            System.out.println("My area is: " + cur.getArea());
            System.out.println("My Perimeter is: " + cur.getPerimeter());
        }
    }
}
