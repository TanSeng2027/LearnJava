public abstract class Document {
    private String id;
    private String title;
    private double basePrice;
    //Constructor
    public Document(String id, String title, double basePrice){
        this.id = id;
        this.title = title;
        this.basePrice = basePrice;
    }
    //Getter && Setter
    public String getId() {
        return this.id;
    }
    public String setId(String id) {
        return this.id = id;
    }
    public String getTitle() {
        return this.title;
    }
    public void setTitle(String title) {
        this.title = title;
    }
    public double getBasePrice() {
        return this.basePrice;
    }
    public void setBasePrice(double basePrice) {
        this.basePrice = basePrice;
    }
    // phuong thuc truu tuong

    public abstract void displayInfor();
}
