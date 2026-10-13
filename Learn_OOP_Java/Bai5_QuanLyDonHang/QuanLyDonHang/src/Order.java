import java.util.ArrayList;
import java.util.List;
public class Order {
    private String orderId;
    private List<orderItem> items;
    private PaymentMethod paymentMethod;

    // Constructor
    public Order(String orderID){
        this.orderId = orderID;
        this.items = new ArrayList<>();
    }
    // Method
    // Them san pham vao don hang
    public void addItem(Product product, int quantity){
        items.add(new orderItem(product ,quantity));
    }
    // Tinh tong tien
    public double calculateTotal(){
        double total = 0;
        for(orderItem item : items){
            total += item.getSubtotal();
        }
        return total;
    }
    public void printInvoice() {
        System.out.println("===== Hoa don " + orderId + " =====");
        for (orderItem item : items) {
            System.out.println(item);
        }
        System.out.println("Tong tien: " + calculateTotal() + "VND");

        if (paymentMethod != null) {
            paymentMethod.pay(calculateTotal());
        }
        System.out.println("=========================");
    }

    public void setPaymentMethod(PaymentMethod paymentMethod) {
        this.paymentMethod = paymentMethod;
    }
}
