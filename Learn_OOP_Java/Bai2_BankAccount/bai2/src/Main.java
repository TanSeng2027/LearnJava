public class Main {
    public static void main(String[] args) {
        BankAccount ba = new BankAccount("0123","Tan Seng",100000);
        ba.deposit(50000); // nap 50 nghin
        ba.withdraw(200000); // rut 200 nghin
        ba.withdraw(30000); // rut 30 nghin
        System.out.println(ba.toString());
    }
}