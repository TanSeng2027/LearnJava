public class BankAccount {
    private String accountNumber; // So taif khoan
    private String accountName;
    private double balance; // So du


    // Constructor
    public BankAccount(String accountNumber, String accountName, double balance) {
        this.accountNumber = accountNumber;
        this.accountName = accountName;
        this.balance = balance;
    }
    //Getter vaf Setter
    public String getAccountNumber() {
        return accountNumber;
    }
    public String getAccountName() {
        return accountName;
    }
    public void setAccountName(String accountName) {
        this.accountName = accountName;
    }
    public double getBalance() {
        return balance;
    }

    // Business Methods
    /** hàm nạp tiền **/
    public void deposit(double amount) {
        if(amount > 0) {
            this.balance += amount;
        }
        else {
            System.out.println("nap tien that bai");
        }
    }
    /** hamf rut tien **/
    public void withdraw(double amount) {
        if(amount > 0 && (this.balance - amount) >= 50) {
            this.balance -= amount;
        }
        else {
            System.out.println("Giao dich that bai");
        }
    }
    @Override
    public String toString(){
        return "So tai khoan: " + accountNumber +
                ", Ten chu tai khoan: " + accountName +
                ", So du tai khoan: " + balance + " VND";

    }
}
