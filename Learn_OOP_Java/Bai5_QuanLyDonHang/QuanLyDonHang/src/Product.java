public class Product {
    private String name;
    private double price;
    // constructor
    public Product(String name, double price) {
        this.name = name;
        this.price = price;
    }
    //getter
    public String getName() {
        return this.name;
    }
    public double getPrice(){
        return this.price;
    }
    @Override
    public String toString(){
        return "Name: " + name + " - " +"Price: "+price;
    }

}
