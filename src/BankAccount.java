public class BankAccount {
    private long accountNumber;

    private String accountHolderName;

    private double balance;

    public long getAccountNumber() {
        return accountNumber;
    }

    public void setAccountNumber(int accountNumber) {

        this.accountNumber = accountNumber;
    }

    public String getAccountHolderName() {
        return accountHolderName;
    }

    public void setAccountHolderName(String accountHolderName) {
        this.accountHolderName = accountHolderName;
    }

    public double getBalance() {
        return balance;
    }

    public void setBalance(double balance) {
        this.balance = balance;
    }

    public BankAccount(long accountNumber, String accountHolderName, double balance) {
        this.accountNumber = accountNumber;
        this.accountHolderName = accountHolderName;
        this.balance = balance;
    }

    public double depositMoney(double money){
        if(money <= 0){
            System.out.println("Fail occur due to improper amount choose by account holder ! ");
        }
        else{
            balance += money;
        }
        return balance;
    }

    public double withdrawMoney(double money){
        if(balance ==0){
            System.out.println("Your balance is zero. you can not withdraw money.");
        }
        else if(money < 0){
            System.out.println("Fail occur due to improper amount choose by account holder !");
        }
        else if(money > balance){
            money = balance;
            balance = 0;
        }
        else{
            balance -= money;
        }
        return balance;

    }
}
