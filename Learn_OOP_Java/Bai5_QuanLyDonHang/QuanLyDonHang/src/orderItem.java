public class orderItem {
    private Product product;
    private int quantity;

    // Constructor
    public orderItem(Product product, int quantity){
        this.product = product;
        this.quantity = quantity;
    }
    //getter
    public Product getProduct() {
        return product;
    }
    public int getQuantity() {
        return quantity;
    }
    // Method
    // Tinh gia 1 mat hang
    public double getSubtotal(){
        return product.getPrice() * quantity;
    }
    @Override
    public String toString(){
        return "San pham: " + product.getName() +
                " co so luong: " + quantity +
                " co gia la: " + getSubtotal() + "VND";
    }


}

