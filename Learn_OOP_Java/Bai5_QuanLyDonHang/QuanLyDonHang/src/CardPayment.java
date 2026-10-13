public class CardPayment implements PaymentMethod{
    @Override
    public void pay (double amount){
        System.out.println("Thanh toan  bang the");
        System.out.println("So tien: " + amount + "VND");

    }
    @Override
    public String getPaymentType(){
        return "The ngan hang";
    }
}
