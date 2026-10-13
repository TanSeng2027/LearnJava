public class CashPayment implements PaymentMethod {
    @Override
    public void pay(double amount) {
        System.out.print("Thanh toan bang tien mat" + "\n");
        System.out.print("So tien: " + amount + "VND");
    }
    @Override
    public String getPaymentType(){
        return "Tien mat";
    }
}
