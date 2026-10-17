public abstract class shape {
    private String name;

    // Constructor
    public shape(String name) {
        this.name = name;
    }
    // abstract method
    public abstract double area();
    public abstract double perimeter();

    // ham toString
    public String toString(){
        return "name: " + this.name +
                " area: " + this.area() +
                " perimeter: " + this.perimeter();
    }
}
