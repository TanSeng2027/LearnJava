public class Circle extends shape {
    private double radius;
    //Constructor
    public Circle(double radius) {
        super("Circle");
        this.radius = radius;
    }
    @Override public double perimeter() { return 3.14 * radius * 2; }
    @Override public double area() { return 3.14 * radius * radius; }
}