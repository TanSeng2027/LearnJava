public class Main {
    public static void main(String[] args) {
        // Tạo sản phẩm
        Product p1 = new Product("Laptop", 15000000);
        Product p2 = new Product("Chuột", 250000);
        Product p3 = new Product("Bàn phím", 500000);

        // Tạo đơn hàng
        Order order = new Order("DH001");
        order.addItem(p1, 1);
        order.addItem(p2, 2);
        order.addItem(p3, 1);

        // Chọn hình thức thanh toán
        order.setPaymentMethod(new CashPayment());   // hoặc new CardPayment()

        // In hóa đơn
        order.printInvoice();
    }
}